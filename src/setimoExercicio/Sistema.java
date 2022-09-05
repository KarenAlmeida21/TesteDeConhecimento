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
        System.out.println("CadastrarProduto");
        System.out.println("DeletarProduto");
        System.out.println("ExibirProduto");
        System.out.println("Sair");
    }

}
