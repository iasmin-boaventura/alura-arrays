package br.com.alura.screenmatch.principal;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.*;

import java.util.ArrayList;

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

        for (Titulo item : listaDeTitulos){
            System.out.println(item);
            if (item instanceof Filme filme) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

//        listaDeTitulos.forEach(System.out::println);
    }
}
