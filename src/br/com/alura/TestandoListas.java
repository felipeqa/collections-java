package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestandoListas {
    public static void main(String[] args) {
        String aula1 = "EStou Conhecendo mais listas";
        String aula2 = "Modelando a classe aulas";
        String aula3 = "Aula Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.forEach(aula -> {
            System.out.println("FOREACH: " + aula);
        });

        aulas.remove(0);

        System.out.println(aulas);

        for (String aula : aulas) {

            System.out.println("AULA: " + aula);
        }
        Collections.sort(aulas);
        System.out.println(aulas);

    }
}
