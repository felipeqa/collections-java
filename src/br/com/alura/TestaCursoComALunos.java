package br.com.alura;

import java.util.List;

public class TestaCursoComALunos {

    public static void main(String[] args) {

        Curso collectionCurso = new Curso("Coleçoes em JAVA", "Instrutor Qualquer");

        collectionCurso.adiciona(new Aula("Trabalhando com Collection Aulas", 24));
        collectionCurso.adiciona(new Aula("Coleções em Java", 14));
        collectionCurso.adiciona(new Aula("Linked List em Java", 23));

        Aluno a1 = new Aluno("Felipe Oliveira", 2343);
        Aluno a2 = new Aluno("Mayara ROrigues", 5443);
        Aluno a3 = new Aluno("Rosangela Santos", 1023);

        collectionCurso.matricula(a1);
        collectionCurso.matricula(a2);
        collectionCurso.matricula(a3);


        System.out.println("Imprimindo ALunos: ");

        collectionCurso.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });

        System.out.println("O  aluno " + a1 + " esta matriculado?");
        System.out.println(collectionCurso.estaMAtriculado(a1));

        Aluno felipe = new Aluno("Felipe Oliveira",  2343);

        System.out.println("Esse felipe esta matriculado?");
        System.out.println(collectionCurso.estaMAtriculado(felipe));

        System.out.println("Testar as referencias criando um Felipe Rodrigues usando equals");
        System.out.println(a1.equals(felipe));

        //Obrigatoriamente o seguinte é true

        System.out.println(a1.hashCode() == felipe.hashCode());
    }
}
