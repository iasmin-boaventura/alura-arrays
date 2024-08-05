package br.com.alura.screenmatch.projeto;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Produto> listaDeCompras = new ArrayList<>();
        Produto produto = new Produto();
        CartaoDeCredito conta;
        Scanner kb = new Scanner(System.in);
        int op = 1;

        System.out.println("======= LISTA DE COMPRAS =======");
        System.out.print("Informe seu limite: R$");
        conta = new CartaoDeCredito(kb.nextDouble());
        System.out.println();

        while (op != 3) {

            menu();

            System.out.print("Opção: ");
            op = kb.nextInt();

            switch (op) {
                case 1:
                    produto = informarCompra();

                    if (conta.comprar(produto)) {
                        System.out.println("Compra realizada com sucesso!");
                    } else {
                        System.out.println("Limite insuficiente. Seu limite disponível é R$" + conta.getSaldo());
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.println("=".repeat(34));
                    System.out.println("Limite total: R$" + conta.getLimite());
                    System.out.println("Limite disponível: R$" + conta.getSaldo());
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        conta.exibirExtrato();

    }

    public static Produto informarCompra() {
        Produto produto = new Produto();
        Scanner sc = new Scanner(System.in);

        System.out.println("\n============ COMPRA ============");

        System.out.print("Descrição: ");
        produto.setDescricao(sc.nextLine());

        System.out.print("Valor: R$");
        produto.setPreco(sc.nextDouble());

        return produto;
    }

    public static void menu() {
        System.out.println("\n============= MENU =============");
        System.out.println("  1. Realizar Compra");
        System.out.println("  2. Consultar Saldo");
        System.out.println("  3. Sair");
        System.out.println("=".repeat(34));
    }
}
