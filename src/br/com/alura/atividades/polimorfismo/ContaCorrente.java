package br.com.alura.atividades.polimorfismo;

public class ContaCorrente extends ContaBancaria{
    private double tarifaMensal = 25;

    public void cobrarTarifaMensal() {
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal de " + tarifaMensal + " cobrada. Saldo atual: " + saldo);
    }
}
