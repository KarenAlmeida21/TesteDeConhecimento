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

    public static Produto cadastrarProduto(String nome, double valor){
        Produto produto = new Produto(nome,valor);
        produtosList.add(produto);
        return produto;
    }

}
