package br.com.alura.atividades;

public class Produto {
    private String nome;
    private double precoOriginal;
    private int percentualDesconto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoOriginal() {
        return precoOriginal;
    }

    public void setPrecoOriginal(double precoOriginal) {
        this.precoOriginal = precoOriginal;
    }

    public void setPercentualDesconto(int percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public double aplicarDesconto(){
        double formula = ((double) percentualDesconto / 100) * precoOriginal;
        double novoPreco = precoOriginal - formula;
        return novoPreco;
    }

    public void exibirFichaTecnica(){
        System.out.println(getNome());
        System.out.println(getPrecoOriginal());
        System.out.println("Preço original: " + getPrecoOriginal() + ". Preço com desconto "  + aplicarDesconto());
    }
}
