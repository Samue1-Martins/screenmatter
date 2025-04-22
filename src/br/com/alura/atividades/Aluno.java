package br.com.alura.atividades;

public class Aluno {
    String nome;
    int idade;

    void exbirInformacoesAluno(){
        System.out.println("O nome do aluno é: " + nome);
        System.out.println("O aluno " + nome + " tem " + idade + " anos.");
    }
}
