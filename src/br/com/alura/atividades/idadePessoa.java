package br.com.alura.atividades;

public class idadePessoa {

    private String nome;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void maiorOuMenorDeIdade(){
        if (idade >= 18){
            System.out.println("Você é maior de idade!");
        }else{
            System.out.println("Você é menor de idade");
        }
    }

    public void exibirPessoa(){
        System.out.println(getNome());
        System.out.println(getIdade());
    }
}
