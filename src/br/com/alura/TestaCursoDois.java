package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCursoDois {

    public static void main(String[] args) {

        Curso collectionCurso = new Curso("Coleçoes em JAVA", "Instrutor Qualquer");
        List<Aula> aulasImutaveis = collectionCurso.getAulas();
        collectionCurso.adiciona(new Aula("Trabalhando com Collection Aulas", 24));
        collectionCurso.adiciona(new Aula("Coleções em Java", 14));
        collectionCurso.adiciona(new Aula("Linked List em Java", 23));

        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);
        System.out.println(aulas);
        System.out.println(collectionCurso.getTempoTotal());

        System.out.println(collectionCurso);
    }
}
