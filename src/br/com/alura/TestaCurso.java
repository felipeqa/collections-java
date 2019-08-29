package br.com.alura;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {

        Curso collectionCurso = new Curso("Coleçoes em JAVA", "Instrutor Qualquer");
        List<Aula> aulas = collectionCurso.getAulas();
        System.out.println(aulas);
//        aulas.add(new Aula("Aula de Java", 33));
        System.out.println(aulas);
        collectionCurso.adiciona(new Aula("Trabalhando com Collection Aulas", 24));
        collectionCurso.adiciona(new Aula("Coleções em Java", 14));
        collectionCurso.adiciona(new Aula("Linked List em Java", 23));

        System.out.println(aulas);
    }
}
