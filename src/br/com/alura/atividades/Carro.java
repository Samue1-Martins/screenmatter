package br.com.alura.atividades;

public class Carro {
    String modelo;
    int ano;
    String cor;
    int idadeCarro;

    void exibirFichaTecnica(){
        System.out.println("O modelo do carro é: " + modelo);
        System.out.println("O ano do carro é: " + ano);
        System.out.println("A cor do carro é: " + cor);
    }

    void calcularIdade(double anoAtual ){
        idadeCarro += anoAtual;
        idadeCarro -= ano;
        System.out.println("A idade do carro é de " + idadeCarro + " anos.");
    }

}
