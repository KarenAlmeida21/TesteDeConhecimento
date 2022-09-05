package setimoExercicio;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private static List<Produto> produtosList = new ArrayList<>();

    public Estoque() {
    }

    public static Produto cadastrarProduto(String nome, double valor) throws Exception {
        verificarCadastroProdutoPositivo(nome);
        Produto produto = new Produto(nome, valor);
        produtosList.add(produto);
        Sistema.informarProdutoCadastradoComSucesso();
        return produto;
    }

    public static void exibir() {
        for (Produto produtoReferencia : produtosList) {
            System.out.println(produtoReferencia.getNome());
            System.out.println(produtoReferencia.getValor());

        }

    }

    public static void deletarProduto(String nome) throws Exception {
        for (Produto produto : produtosList) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produtosList.remove(produto);
                throw new Exception("Deletado com sucesso \n");


            }
        }
        Sistema.mensagemErroNaDeleção();

    }

    public static void verificacaoListaVazia() {
        if (Estoque.produtosList.size() == 0) {
            System.out.println("Não há produtos cadastrados\n");
        }
    }

    public static void verificarCadastroProdutoPositivo(String nome) throws Exception {
        for (Produto produto : produtosList) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                throw new Exception("Produto já cadastrado. Verifique!\n");
            }
        }
    }

    public static void verificarCadastroProdutoNegativo(String nome) throws Exception {
        for (Produto produto : produtosList) {
            if (!produto.getNome().equalsIgnoreCase(nome)) {
                throw new Exception("Produto não encontrado \n");
            }
        }
    }


}

