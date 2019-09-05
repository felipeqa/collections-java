package br.com.alura;

import java.util.Iterator;

public class TestaCursoComALunos2 {

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

        Iterator<Aluno> interador = collectionCurso.getAlunos().iterator();
        while (interador.hasNext()) {
            Aluno aluno = interador.next();
            System.out.println(aluno);

        }

        //Existe o LinkedHashSet só mantem a ordem de adição
        //Existe o TreeSet que necessita de um comparable (implementar a interface ou passar um comparable no construtor)
    }
}
