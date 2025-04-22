package br.com.alura.atividades.polimorfismo;

public class Gato extends Animal {
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void arranharMoveis() {
        System.out.println(nome + " está fazendo barulho.");
    }

    @Override
    public void emitirSom() {
        System.out.println("grr, grr, grr");
    }
}
