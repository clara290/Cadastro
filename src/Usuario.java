class Usuario {
    private String nome;
    private String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public void autenticar(String nomeInserido, String senhaInserida) throws AutenticacaoException {
        if (!nomeInserido.equals(nome)) {
            throw new NomeUsuarioInvalidoException();
        }

        if (!senhaInserida.equals(senha)) {
            throw new SenhaMuitoCurtaException();
        }
    }
}
