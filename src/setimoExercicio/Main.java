package setimoExercicio;

public class Main {
    public static void main(String[] args) {
        boolean prosseguir = true;
        while ((prosseguir)){
            try {
                prosseguir=Sistema.operacaoUsuario();
            } catch (Exception erro) {
                System.out.println(erro.getMessage());
            }

        }
    }
}
