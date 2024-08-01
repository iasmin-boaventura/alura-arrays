package br.com.alura.screenmatch.modelos;

public class Retangulo implements Forma {
    private double lado;

    public Retangulo(double lado){
        setLado(lado);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }
}
