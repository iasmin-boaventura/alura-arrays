package br.com.alura.screenmatch.projeto;

import java.util.*;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Produto> listaDeCompras = new ArrayList<>();

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = getLimite();
    }

    public boolean comprar(Produto produto) {
        if (produto.getPreco() <= getSaldo()){
            listaDeCompras.add(produto);
            this.saldo -= produto.getPreco();
            return true;
        } else {
            return false;
        }
    }

    public void exibirExtrato() {
        System.out.println("\n============= EXTRATO ============");

        System.out.println("Limite total: R$" + getLimite());

        System.out.println("\nCompras:");
        for (Produto produto : listaDeCompras) {
            System.out.println(produto);
        }

        System.out.println("\nLimite disponível: R$" + getSaldo());

        System.out.println("=".repeat(34));
    }
}
