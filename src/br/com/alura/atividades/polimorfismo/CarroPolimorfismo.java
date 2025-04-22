package br.com.alura.atividades.polimorfismo;

public class CarroPolimorfismo {
    private String modelo;
    private double primeirAno;
    private double segundoAno;
    private double terceiroAno;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definirPrecos(double primeirAno, double segundoAno, double terceiroAno) {
        this.primeirAno = primeirAno;
        this.segundoAno = segundoAno;
        this.terceiroAno = terceiroAno;
    }

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço Ano 1: " + primeirAno);
        System.out.println("Preço Ano 2: " + segundoAno);
        System.out.println("Preço Ano 3: " + terceiroAno);
        System.out.println("Menor Preço: " + calcularMenorPreco());
        System.out.println("Maior Preço: " + calcularMaiorPreco());
    }

    public double calcularMenorPreco(){
        double menorPreco = primeirAno;
        if (segundoAno < menorPreco){
            menorPreco = segundoAno;
        }
        if (terceiroAno < menorPreco){
            menorPreco = terceiroAno;
        }
        return menorPreco;
    }

    public double calcularMaiorPreco(){
        double maiorPreco = primeirAno;
        if (segundoAno > maiorPreco){
            maiorPreco = segundoAno;
        }
        if (terceiroAno > maiorPreco){
            maiorPreco = terceiroAno;
        }
        return maiorPreco;
    }
}
