package br.com.alura.atividades;

public class ContaBancaria {

    String titular;
    private int numeroConta;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirFchaTecnica(){
        System.out.println(getTitular());
        System.out.println(getNumeroConta());
        System.out.println(getSaldo());
    }
}
