package br.com.alura.screenmatch;

import br.com.alura.screenmatch.modelos.*;
import java.util.ArrayList;

public class ExerciciosAula3 {
    public static void main(String[] args) {
        ex6();
    }

    public static void ex1() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Ingred");
        strings.add("Iasmin");
        strings.add("Isabelle");
//        strings.forEach(irmas -> System.out.println(irmas));
        strings.forEach(System.out::println);
    }

    public static void ex2() {
        Cachorro shy = new Cachorro();
        shy.setNome("Shy");
        shy.setRaca("Lhasa Apso");
        shy.setPorte("Pequeno");

        Animal animal = (Animal) shy;
    }

    public static void ex3() {
        Cachorro shy = new Cachorro();
        shy.setNome("Shy");
        shy.setRaca("Lhasa Apso");
        shy.setPorte("Pequeno");

        if (shy instanceof Cachorro){
            Animal animal = (Animal) shy;
        } else {
            System.out.println("Não é um cachorro");
        }
    }

    public static void ex4() {
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

        double media = 0;

        for (Produto produto : listaDeProdutos){
            media += produto.getPreco();
            System.out.println(produto.getNome() + " - " + produto.getPreco());
        }

        System.out.println("Média: " + media / listaDeProdutos.size());
    }

    public static void ex5() {
        Circulo circulo = new Circulo(10);
        Retangulo retangulo = new Retangulo(11);

        ArrayList<Forma> listaDeFormas = new ArrayList<>();
        listaDeFormas.add(circulo);
        listaDeFormas.add(retangulo);

        for (Forma forma : listaDeFormas){
            System.out.println("Área: " + forma.calcularArea());
        }
    }

    public static void ex6() {
        ContaBancaria conta1 = new ContaBancaria(123455, 600);
        ContaBancaria conta2 = new ContaBancaria(654321, 1000);
        ContaBancaria conta3 = new ContaBancaria(98765, 350);

        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();
        listaDeContas.add(conta1);
        listaDeContas.add(conta2);
        listaDeContas.add(conta3);

        ContaBancaria maiorSaldo = listaDeContas.get(0);

        for (ContaBancaria conta : listaDeContas){
            if (conta.getSaldo() > maiorSaldo.getSaldo()) {
                maiorSaldo = conta;
            }
        }

        System.out.println("Conta com maior saldo: " + maiorSaldo.getNumeroConta());
        System.out.println("Saldo: R$" + maiorSaldo.getSaldo());

    }
}
