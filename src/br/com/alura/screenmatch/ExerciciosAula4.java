package br.com.alura.screenmatch;

import br.com.alura.screenmatch.modelos.Titulo;
import java.util.*;

public class ExerciciosAula4 {
    public static void main(String[] args) {
       ex5();
    }

    public static void ex1() {
        ArrayList<Integer> listaDeInt = new ArrayList<>();

        for (int i = 20; i > 1; i -= 2) {
            listaDeInt.add(i);
        }

        System.out.println(listaDeInt);

        Collections.sort(listaDeInt);
        System.out.println("Lista ordenada: " + listaDeInt);
    }

    public static void ex2() {
        Titulo titulo = new Titulo("A", 1999);
        Titulo titulo2 = new Titulo("Z", 2000);
        Titulo titulo3 = new Titulo("Q", 2001);

        ArrayList<Titulo> titulos = new ArrayList<>();

        titulos.add(titulo);
        titulos.add(titulo2);
        titulos.add(titulo3);

        System.out.println(titulos);

        titulos.sort(Comparator.comparing(Titulo::getTitulo));
        System.out.println("Ordenados: " + titulos);
    }

    public static void ex3() {
        Titulo titulo = new Titulo("A", 1999);
        Titulo titulo2 = new Titulo("Z", 2000);
        Titulo titulo3 = new Titulo("Q", 2001);

        ArrayList<Titulo> titulos = new ArrayList<>();

        System.out.println(titulos);

        Collections.sort(titulos);
        System.out.println("Ordenados: " + titulos);
    }

    public static void ex4() {
        List<Integer> listaArrayList = new ArrayList<>();
        listaArrayList.add(10);
        listaArrayList.add(20);
        listaArrayList.add(30);

        List<Integer> listaLinkedList = new ArrayList<>();
        listaLinkedList.add(40);
        listaLinkedList.add(50);
        listaLinkedList.add(60);

        System.out.println("ArrayList: " + listaArrayList);
        System.out.println("LinkedList: " + listaLinkedList);
    }

    public static void ex5() {
        List<Integer> listaPolimorfismo;

        listaPolimorfismo = new ArrayList<>();
        listaPolimorfismo.add(10);
        listaPolimorfismo.add(20);

        System.out.println(listaPolimorfismo);

        listaPolimorfismo = new LinkedList<>();
        listaPolimorfismo.add(30);
        listaPolimorfismo.add(40);

        System.out.println(listaPolimorfismo);
    }
}
