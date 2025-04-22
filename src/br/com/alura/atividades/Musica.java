package br.com.alura.atividades;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void avalia (double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }

    void exibeFichaTecnica(){
        System.out.println(titulo);
        System.out.println(artista);
        System.out.println(anoLancamento);
        System.out.println(avaliacao);
    }
    double pegaMedia(){
        return avaliacao / numAvaliacoes;
    }
}