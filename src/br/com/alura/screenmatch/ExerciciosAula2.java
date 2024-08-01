package br.com.alura.screenmatch;
import br.com.alura.screenmatch.modelos.*;

import java.util.ArrayList;

public class ExerciciosAula2 {
    public static void main(String[] args) {
        ex4();
    }

    public static void ex1() {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        Produto produto1 = new Produto();
        produto1.setNome("Amêndoas cobertas com chocolate");
        produto1.setPreco(5.5);
        produto1.setQuantidade(100);

        Produto produto2 = new Produto();
        produto2.setNome("Caderno");
        produto2.setPreco(12.9);
        produto2.setQuantidade(1);

        Produto produto3 = new Produto();
        produto3.setNome("Caneta");
        produto3.setPreco(7.9);
        produto3.setQuantidade(3);

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        System.out.println("Tamanho da lista de produtos: " + listaDeProdutos.size());
        System.out.println("Produto do índice 1: " + listaDeProdutos.get(1).getNome());
    }

    public static void ex2() {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        Produto produto1 = new Produto();
        produto1.setNome("Amêndoas cobertas com chocolate");
        produto1.setPreco(5.5);
        produto1.setQuantidade(100);

        Produto produto2 = new Produto();
        produto2.setNome("Caderno");
        produto2.setPreco(12.9);
        produto2.setQuantidade(1);

        Produto produto3 = new Produto();
        produto3.setNome("Caneta");
        produto3.setPreco(7.9);
        produto3.setQuantidade(3);

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        for (Produto produto : listaDeProdutos){
            System.out.println(produto);
        }
    }

    public static void ex3() {
        Produto meuProduto = new Produto("Caneta", 5.5);
        System.out.println(meuProduto);
    }

    public static void ex4() {
        ProdutoPerecivel perecivel = new ProdutoPerecivel("Amêndoa", 5.5, "01/09/2024");
        System.out.println(perecivel);
        System.out.println(perecivel.getDataValidade());
    }
}
