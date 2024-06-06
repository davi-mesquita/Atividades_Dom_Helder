import functools

from flask import (
    Blueprint, flash, g, redirect, render_template, request, session, url_for
)
from werkzeug.security import check_password_hash, generate_password_hash

from flaskr.db import get_db

bp = Blueprint('auth', __name__, url_prefix='/auth')


@bp.route('/register', methods=('GET', 'POST'))
def register():
    if request.method == 'POST':
        nome = request.form['nome']
        email = request.form['email']
        senha = request.form['senha']
        db = get_db()
        error = None

        if not email:
            error = 'Por favor preencha o campo e-mail.'
        elif not senha:
            error = 'Por favor preencha o campo senha.'
        elif not nome:
            error = 'Por favor preencha o campo nome.'

        if error is None:
            try:
                db.execute(
                    "INSERT INTO usuario (nome, email, senha) VALUES (?, ?, ?)",
                    (email, generate_password_hash(senha)),
                )
                db.commit()
            except db.IntegrityError:
                error = f"O E-mail: {email} \n já existe, por favor recupere sua senha ou utilize outro e-mail."
            else:
                return redirect(url_for("auth.login"))

        flash(error)

    return render_template('auth/register.html')

@bp.route('/login', methods=('GET', 'POST'))
def login():
    if request.method == 'POST':
        email = request.form['email']
        senha = request.form['senha']
        db = get_db()
        error = None
        usuario = db.execute(
            'SELECT * FROM usuario WHERE email = ?', (email,)
        ).fetchone()

        if usuario is None:
            error = 'E-mail Incorreto.'
        elif not check_password_hash(usuario['senha'], senha):
            error = 'Senha Incorreto.'

        if error is None:
            session.clear()
            session['usuario_id'] = usuario['id']
            return redirect(url_for('base'))

        flash(error)

    return render_template('auth/login.html')

@bp.before_app_request
def load_logged_in_usuario():
    usuario_id = session.get('usuario_id')

    if usuario_id is None:
        g.usuario = None
    else:
        g.usuario = get_db().execute(
            'SELECT * FROM usuario WHERE id = ?', (usuario_id,)
        ).fetchone()

@bp.route('/logout')
def logout():
    session.clear()
    return redirect(url_for('base'))

def login_required(view):
    @functools.wraps(view)
    def wrapped_view(**kwargs):
        if g.usuario is None:
            return redirect(url_for('auth.login'))

        return view(**kwargs)

    return wrapped_view