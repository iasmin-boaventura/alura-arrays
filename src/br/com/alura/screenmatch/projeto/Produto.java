package br.com.alura.screenmatch.projeto;

public class Produto implements Comparable<Produto> {
    private String descricao;
    private double preco;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return getDescricao() + " - R$" + getPreco();
    }

    @Override
    public int compareTo(Produto o) {
        return Double.valueOf(this.preco).compareTo(Double.valueOf(o.preco));
    }
}
