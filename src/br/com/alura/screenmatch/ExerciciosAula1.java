package br.com.alura.screenmatch;
import br.com.alura.screenmatch.modelos.*;

import java.util.ArrayList;

public class ExerciciosAula1 {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Iasmin");
        pessoa1.setIdade(21);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Isabelle");
        pessoa2.setIdade(21);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Marcelo");
        pessoa3.setIdade(51);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista de pessoas: " + listaDePessoas.size());
        System.out.println("Primeira pessoa: " + listaDePessoas.get(0));

        System.out.println("\nLista de pessoas:");
        for (Pessoa pessoa : listaDePessoas){
            System.out.println(pessoa);
        }
    }

}
