package br.com.alura.screenmatch.modelos;

public class ContaBancaria {
    private long numeroConta;
    private double saldo;

    public ContaBancaria(long numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public long getNumeroConta() {
        return numeroConta;
    }
}
