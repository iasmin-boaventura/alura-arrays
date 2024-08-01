package br.com.alura.screenmatch.modelos;

public class Produto {
    private String nome;
    private double preco;
    private double quantidade;

    public Produto(){

    }

    public Produto(String nome, double preco){
        setNome(nome);
        setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return getNome() + ", R$" + getPreco();
    }
}
