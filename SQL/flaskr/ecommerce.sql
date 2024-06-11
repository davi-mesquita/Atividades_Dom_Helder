DROP TABLE IF EXISTS usuario;
DROP TABLE IF EXISTS produto;
DROP TABLE IF EXISTS carrinho;


-- Criação da tabela Usuário
CREATE TABLE usuario (
    id_usuario INTEGER PRIMARY KEY AUTOINCREMENT,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    senha VARCHAR(255) NOT NULL,
    data_criacao DATETIME DEFAULT CURRENT_TIMESTAMP
);

-- Criação da tabela Produto
CREATE TABLE produto (
    id_produto INTEGER PRIMARY KEY AUTOINCREMENT,
    nome VARCHAR(255) NOT NULL,
    descricao TEXT,
    preco DECIMAL(10, 2) NOT NULL,
    estoque INTEGER NOT NULL,
    categoria VARCHAR(100),
    imagem VARCHAR(255),
    data_criacao DATETIME DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO produto (nome, descricao, preco, estoque, categoria, imagem) VALUES
('Notebook Dell Inspiron', 'Notebook Dell Inspiron com 8GB RAM e 256GB SSD', 3500.00, 50, 'Eletrônicos', 'static/img/notebook_dell.jpg'),
('Smartphone Samsung Galaxy S21', 'Smartphone Samsung Galaxy S21 com 128GB de armazenamento', 4500.00, 100, 'Eletrônicos', 'static/img/samsung_s21.jpg'),
('Fone de Ouvido JBL', 'Fone de Ouvido JBL sem fio com cancelamento de ruído', 600.00, 200, 'Acessórios', 'static/img/fone_jbl.jpg'),
('Cafeteira Nespresso', 'Cafeteira Nespresso com 20 cápsulas inclusas', 400.00, 150, 'Eletrodomésticos', 'static/img/cafeteira_nespresso.jpg'),
('Livro "O Poder do Hábito"', 'Livro de Charles Duhigg sobre hábitos e produtividade', 45.00, 300, 'Livros', 'static/img/livro_habito.jpg'),
('Cadeira Gamer DXRacer', 'Cadeira Gamer DXRacer com ajuste de altura e encosto', 1500.00, 80, 'Móveis', 'static/img/cadeira_gamer.jpg');