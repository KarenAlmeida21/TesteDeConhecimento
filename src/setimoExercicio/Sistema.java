package setimoExercicio;

import java.util.Scanner;

public class Sistema {
    private static Scanner obterDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void encerrarMenus() {
        System.out.println("Você será rediciobado ao menu anterior\n");
    }

    public static void opcaoInvalida() {
        System.out.println("Digite uma opção existente no menu\n");
    }

    public static Produto cadastrarProduto() throws Exception {
        String nomeProduto = obterDados("Digite o nome do produto que será cadastrado").nextLine();
        Double valorProduto = obterDados("Digite o valor do produto que será cadastrado").nextDouble();
        return Estoque.cadastrarProduto(nomeProduto, valorProduto);
    }

    public static Produto deletarProduto() throws Exception {
        String nomeProduto = obterDados("Digite o nome do produto que será deletado").nextLine();
        return Estoque.deletarProduto(nomeProduto);
    }

    public static void exibirProduto() {
        Estoque.exibir();

    }



    public static void menuInicial(){
        System.out.println("ESTOQUE");
        System.out.println("Digite 1 para cadastrar produto");
        System.out.println("Digite 2 para deletar produto");
        System.out.println("Digite 3 para exibir produto");
        System.out.println("Digite 4 para sair do sistema de estoque");
    }

    public static void operacaoUsuario() throws Exception {
        boolean menu= true;

        menuInicial();
        int opcaoUsuario = obterDados("Digite a opção desejada:").nextInt();
        while (menu){
            if(opcaoUsuario == 1){
                cadastrarProduto();
                break;
            }
            if(opcaoUsuario==2 ){
                deletarProduto();
            }
            if(opcaoUsuario == 3){
                exibirProduto();
            }
            if(opcaoUsuario == 4){
                menu = false;


            }

            }
        }
    }


