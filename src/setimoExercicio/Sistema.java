package setimoExercicio;

import java.util.Scanner;

public class Sistema {
    private static Scanner obterDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void opcaoInvalida() {
        System.out.println("Digite uma opção existente no menu\n");
    }

    public static void redirecionarMenu() {
        System.out.println("Você será redirecionado para o menu anterior\n");

    }
    public static void mensagemErroNaDeleção(){
        System.out.println("Não existe este produto no estoque");
    }

    public static void informarProdutoCadastradoComSucesso() {
        System.out.println("Proguto cadastrado com sucesso!\n ");
    }

    public static Produto cadastrarProduto() throws Exception {
        String nomeProduto = obterDados("Digite o nome do produto que será cadastrado").nextLine();
        Double valorProduto = obterDados("Digite o valor do produto que será cadastrado").nextDouble();
        return Estoque.cadastrarProduto(nomeProduto, valorProduto);
    }

    public static void deletarProduto() throws Exception {
        String nomeProduto = obterDados("Digite o nome do produto que será deletado").nextLine();
        Estoque.deletarProduto(nomeProduto);
    }

    public static void exibirProdutos() {
        Estoque.exibir();
    }

    public static void mensagemEncerramento() {
        System.out.println("Sistema encerrado\n");
    }

    public static void menuInicial() {
        System.out.println("\nESTOQUE\n");
        System.out.println("Digite 1 para cadastrar produto");
        System.out.println("Digite 2 para deletar produto");
        System.out.println("Digite 3 para exibir produto");
        System.out.println("Digite 4 para sair do sistema de estoque");
    }

    public static void verificacaoCadastrarNovamente() throws Exception {
        boolean loop = true;
        while (loop) {
            int cadastrarMaisProdutos = obterDados("Deseja cadastrar mais produtos:\n" +
                    "1 para Sim\n" +
                    "2 para não\n").nextInt();

            if (cadastrarMaisProdutos == 1) {
                cadastrarProduto();
            }
            if (cadastrarMaisProdutos == 2) {
                loop = false;
                redirecionarMenu();
            }
        }

    }

    public static boolean operacaoUsuario() throws Exception {
        boolean menu = true;

        menuInicial();
        int opcaoUsuario = obterDados("Digite a opção desejada:").nextInt();
        while (menu) {
            if (opcaoUsuario == 1) {

                cadastrarProduto();

                verificacaoCadastrarNovamente();
                break;
            }
            if (opcaoUsuario == 2) {
                deletarProduto();
                break;
            }
            if (opcaoUsuario == 3) {
                Estoque.verificacaoListaVazia();
                exibirProdutos();
                break;
            }
            if (opcaoUsuario == 4) {
                mensagemEncerramento();
                menu = false;
                break;
            } else {
                opcaoInvalida();
                break;
            }

        }
        return menu;
    }
}


