package br.com.alura.atividades.polimorfismo;

public class TestePolimorfismo {
    public static void main(String[] args) {

        // 1 - Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.
        ModeloCarro carroTeste = new ModeloCarro();

        carroTeste.setModelo("Ferrari");
        carroTeste.setPlaca(1254);
        carroTeste.definirPrecos(120.000, 10.000, 500.000);
        carroTeste.calcularMenorPreco();
        carroTeste.calcularMaiorPreco();
        carroTeste.exibirInfo();

        // 2 - Crie uma classe Animal com um metodo emitirSom(). Em seguida, crie duas subclasses: Cachorro e Gato, que herdam da classe Animal. Adicione o metodo emitirSom() nas subclasses, utilizando a anotação @Override para indicar que estão sobrescrevendo o metodo. Além disso, adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.

        Gato jerry = new Gato();

        jerry.setNome("Jerry");
        jerry.arranharMoveis();
        jerry.emitirSom();

        Cachorro pit = new Cachorro();
        pit.setNome("pit");
        pit.abanarRabo();
        pit.emitirSom();

        // 3 - Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um metodo específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.

        ContaBancaria conta1 = new ContaBancaria();

        conta1.depositar(2000);
        conta1.sacar(500);
        conta1.consultarSaldo();

        ContaCorrente conta2 = new ContaCorrente();

        conta2.depositar(5000);
        conta2.sacar(1000);
        conta2.cobrarTarifaMensal();
        conta2.consultarSaldo();

    // 4 - Crie uma classe NumerosPrimos com métodos como verificarPrimalidade() e listarPrimos(). Em seguida, crie duas subclasses, VerificadorPrimo e GeradorPrimo, que herdam da classe NumerosPrimos. Adicione um metodo específico para cada uma das subclasses, como verificarSeEhPrimo() para o VerificadorPrimo e gerarProximoPrimo() para o GeradorPrimo.

        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificadorEhPrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);
    }



}
