package br.com.alura.atividades.polimorfismo;

public class ContaBancaria {

    protected double saldo;

    public void depositar(double deposito){
        saldo += deposito;
    }
    public void consultarSaldo(){
        System.out.println("Seu saldo disponivel é de " + saldo);
    }

    public void sacar(double sacar){
        if(saldo >= sacar) {
            saldo -= sacar;
            System.out.println("Seu saldo disponivel agora é de: " + saldo);
        }else{
            System.out.println("Vocè não tem saldo suficiente");
        }
    }
}
