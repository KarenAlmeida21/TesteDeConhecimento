package setimoExercicio;

import org.w3c.dom.ls.LSOutput;

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
            System.out.println(produtoReferencia.getNome());

        }

    }



   public  static void deletarProduto(String nome) throws Exception {
        for (Produto produto : produtosList) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produtosList.remove(produto);
                System.out.println("Produto deletado");
            }
        }

    }
    public static  void verificacaoListaVazia(){
        if(Estoque.produtosList.size()==0){
            System.out.println("Não há produtos cadastrados");
        }
    }

    public static void verificarCadastroProdutoPositivo(String nome) throws Exception {
        for (Produto produto : produtosList) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                throw new Exception("Produto já cadastrado. Verifique!");
            }
        }
    }

}
