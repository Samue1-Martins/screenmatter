package br.com.alura.atividades.polimorfismo;

public class Cachorro extends Animal {
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void abanarRabo(){
        System.out.println(nome + " está abanando o rabo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au au");
    }
}
