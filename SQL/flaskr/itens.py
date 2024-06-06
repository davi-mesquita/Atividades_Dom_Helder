from flask import (
    Blueprint, flash, g, redirect, render_template, request, url_for
)
from werkzeug.exceptions import abort

from flaskr.auth import login_required
from flaskr.db import get_db

bp = Blueprint('itens', __name__)

@bp.route('/')
def index():
    db = get_db()
    posts = db.execute(
        'SELECT p.id_produto, nome, descricao, preco, imagem, categoria'
        ' FROM produto p'
    ).fetchall()
    return render_template('itens/index.html', posts=posts)