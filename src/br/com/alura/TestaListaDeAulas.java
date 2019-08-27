package br.com.alura;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAulas {
    public static void main(String[] args) {

        ArrayList<Aula> aulas = new ArrayList<>();

        Aula a1 = new Aula("Revistando Aula 1", 20);
        Aula a2 = new Aula("Lista Aula 2", 40);
        Aula a3 = new Aula("Relacionamento Aula 3", 10);

        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);
        Collections.sort(aulas);
        System.out.println(aulas);

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);

        aulas.sort(Comparator.comparing(Aula::getTitulo));
        System.out.println(aulas);
    }
}
