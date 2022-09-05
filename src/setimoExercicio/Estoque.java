package setimoExercicio;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private static List<Produto> produtosList = new ArrayList<>();

    public Estoque() {
    }

    public List<Produto> getProdutosList() {
        return produtosList;
    }

    public void setProdutosList(List<Produto> produtosList) {
        this.produtosList = produtosList;
    }

    public static Produto cadastrarProduto(String nome, double valor) throws Exception {
        verificarCadastroProdutoPositivo(nome);
        Produto produto = new Produto(nome, valor);
        produtosList.add(produto);
        return produto;
    }

    public static void exibir() {
        for (Produto produtoReferencia : produtosList) {
            System.out.println(produtoReferencia);
        }

    }

    public static void deletarProduto(String nome) {
        for (Produto produtoReferencia : produtosList) {
            if (produtoReferencia.getNome().equals(nome)) {
                produtosList.remove(produtoReferencia);
            }
        }

    }
    public static void verificarCadastroProdutoPositivo(String nome) throws Exception {
        for(Produto produto: produtosList){
            if(produto.getNome().equals(nome)){
                throw new Exception("Produto já cadastrado. Verifique!");
            }
        }
    }
}
