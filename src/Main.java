public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("usuario123", "minhasenha");

        try {

            String nomeInserido = "usuario123";
            String senhaInserida = "senha";

            usuario.autenticar(nomeInserido, senhaInserida);
            System.out.println("Autenticação bem-sucedida!");
        } catch (AutenticacaoException e) {
            System.out.println("Erro na autenticação: " + e.getMessage());
        }
    }
}