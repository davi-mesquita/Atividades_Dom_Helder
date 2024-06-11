
from flask import Blueprint, app, flash, g, redirect, render_template, session, url_for

from flaskr.db import get_db

bp = Blueprint('cart', __name__, url_prefix='/cart')

@bp.route('/add_to_cart/<int:item_id>', methods=['POST'])
def add_to_cart(item_id):
    if 'cart' not in session:
        session['cart'] = []
    session['cart'].append(item_id)
    session.modified = True
    flash('Item adicionado ao carrinho!')
    session['cart_count'] = len(session['cart'])
    return redirect(url_for('index'))

@bp.before_request
def load_logged_in_user():
    g.user = session.get('user')

@bp.route('/cart')
def view_cart():
    cart_items = [item for item in get_db().execute('SELECT * FROM produto') if item[0] in session.get('cart', [])]
    total_value = sum(item[3] for item in cart_items)
    return render_template('cart/cart.html', cart_items=cart_items, total_value=total_value)
