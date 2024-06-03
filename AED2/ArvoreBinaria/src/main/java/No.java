class No {
    public int elemento; // Conteudo do no.
    public No esq, dir;  // Filhos da esq e dir.
    public String nome; // Nome do contato
    public String telefone; // Telefone do contato

    /**
     * Construtor da classe.
     * @param elemento Conteudo do no.
     */
    public No(int elemento, String nome, String telefone) {
        this(elemento, null, null, nome, telefone);
    }

    /**
     * Construtor da classe.
     * @param elemento Conteudo do no.
     * @param esq No da esquerda.
     * @param dir No da direita.
     */
    public No(int elemento, No esq, No dir, String nome, String telefone) {
        this.elemento = elemento;
        this.esq = esq;
        this.dir = dir;
        this.nome = nome;
        this.telefone = telefone;
    }
}

