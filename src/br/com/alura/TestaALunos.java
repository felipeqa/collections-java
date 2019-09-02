package br.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaALunos {
    public static void main(String[] args) {

        //conjunto não adiciona item igual
        Set<String> alunos = new HashSet<>();
        alunos.add("Felipe Rodrigues");
        alunos.add("Oliveira Rodrigues");
        alunos.add("Andre Rodrigues");
        alunos.add("Mayara Rodrigues");
        alunos.add("ROsangela Rodrigues");
        alunos.add("Antonio Rodrigues");
        alunos.add("Felipe Rodrigues");

        boolean pauloEstaMAtriculado = alunos.contains("Felipe Rodrigues");
        System.out.println(pauloEstaMAtriculado);
        alunos.remove("Felipe Rodrigues");

        for (String aluno: alunos) {
            System.out.println(aluno);
        }

        System.out.println(alunos);

        //foreach lambda
        alunos.forEach( aluno -> {
            System.out.println("Aluno: " + aluno);
        });

        //Transformando um conjunto em uma lista
        List<String> alunosEmLista = new ArrayList<>(alunos);
        System.out.println(alunosEmLista.get(0));

    }
}
