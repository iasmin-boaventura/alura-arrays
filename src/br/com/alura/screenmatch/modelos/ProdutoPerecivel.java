package br.com.alura.screenmatch.modelos;

public class ProdutoPerecivel extends Produto{
    private String dataValidade;

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public ProdutoPerecivel(String nome, double preco, String dataValidade){
        super(nome, preco);
        this.dataValidade = dataValidade;
    }
}
