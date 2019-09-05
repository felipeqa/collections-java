package br.com.alura;

public class TestaBuscaAlunosNoCurso {
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

        System.out.println("Busca aluno com a matricula 5443?");
        Aluno alunoRetornado = collectionCurso.buscaMatriculado(5443);
        Aluno alunoRetornado2 = collectionCurso.buscaMatriculadoUsandoMap(5443);

        System.out.println("Aluno: " + alunoRetornado.getNome());
        System.out.println("Aluno: " + alunoRetornado2.getNome());
    }
}
