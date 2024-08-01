package br.com.alura.screenmatch.modelos;

public class Circulo implements Forma {
    private double raio;

    public Circulo(double raio){
        setRaio(raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return 3.14 * (this.raio * this.raio);
    }
}
