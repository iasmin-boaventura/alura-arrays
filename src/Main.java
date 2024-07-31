
import br.com.alura.screenmatch.modelos.*;
import br.com.alura.screenmatch.calculos.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setTitulo("A Escolha Perfeita");
        meuFilme.setAnoLancamento(2012);
        System.out.println("Duração: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.avalia(10);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.exibeFichaTecnica();

        //Seria
        Serie tbbt = new Serie();

        tbbt.setTitulo("The Big Bang Theory");
        tbbt.setTemporadas(8);
        tbbt.setEpisodiosTemporada(20);
        tbbt.setMinutoEpisodio(20);

        tbbt.exibeFichaTecnica();
        System.out.println("Duração: " + tbbt.getDuracaoEmMinutos());

        //Calcula tempo total de vários titulos
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(tbbt);
        calculadora.inclui(meuFilme);

        System.out.println(calculadora.getTempoTotal());

        //Filtra recomendação de classificáveis
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        Episodio episodio = new Episodio();
        filtro.filtra(meuFilme);

        episodio.setSerie(tbbt);
        episodio.setNome("The Bath Item Gift Hypothesis");
        episodio.setNumero(11);
        episodio.setQuantidadeVisualizacoes(1000);

        filtro.filtra(episodio);

        Filme outroFilme = new Filme();
        outroFilme.setTitulo("Macunaíma");
        outroFilme.setDuracaoEmMinutos(110);
        outroFilme.setDiretor("Joaquim Pedro de Andrade");
        outroFilme.setAnoLancamento(1969);
        outroFilme.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getTitulo());
        System.out.println("toString do Filme: " + listaDeFilmes.get(0).toString());

    }
}