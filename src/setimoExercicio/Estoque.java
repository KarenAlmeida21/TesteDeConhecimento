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

    public static Produto deletarProduto(String nome) throws Exception {
        for(Produto produto: produtosList){
            if(produtosList.contains(produto.getNome())){
                produtosList.remove(produto);
            }
        }
        return (Produto) produtosList;

    }

    public static void verificarCadastroProdutoPositivo(String nome) throws Exception {
        for(Produto produto: produtosList){
            if(produto.getNome().equalsIgnoreCase(nome)){
                throw new Exception("Produto já cadastrado. Verifique!");
            }
        }
    }

}
