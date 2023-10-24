class AutenticacaoException extends Exception {
    public AutenticacaoException(String mensagem) {
        super(mensagem);
    }
}

class SenhaMuitoCurtaException extends AutenticacaoException {
    public SenhaMuitoCurtaException() {
        super("A senha é muito curta. Ela deve ter pelo menos 6 caracteres.");
    }
}

class NomeUsuarioInvalidoException extends AutenticacaoException {
    public NomeUsuarioInvalidoException() {
        super("Nome de usuário inválido. Deve conter apenas letras e números.");
    }
}

