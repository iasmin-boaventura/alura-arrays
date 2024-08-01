package br.com.alura.screenmatch.principal;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Macunaíma", 1969);
        meuFilme.avalia(10);
        Filme outroFilme = new Filme("A Escolha Perfeita", 2012);
        outroFilme.avalia(9);
        Filme maisFilme = new Filme("Truque de Mestre", 2013);
        maisFilme.avalia(8);

        Serie minhaSerie = new Serie("The Big Bang Theory", 2007);

        ArrayList<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(meuFilme);
        listaDeTitulos.add(maisFilme);
        listaDeTitulos.add(outroFilme);
        listaDeTitulos.add(minhaSerie);

        for (Titulo item : listaDeTitulos) {
            System.out.println(item);
            if (item instanceof Filme filme) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorAtor = new ArrayList<>();
        buscaPorAtor.add("Iasmin");
        buscaPorAtor.add("Yasmim");
        buscaPorAtor.add("Erika");

        Collections.sort(buscaPorAtor);
        System.out.println(buscaPorAtor);

        //Ordem alfabética
        Collections.sort(listaDeTitulos);
        System.out.println(listaDeTitulos);

        //Ordenando por ano
        listaDeTitulos.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println(listaDeTitulos);
    }
}
