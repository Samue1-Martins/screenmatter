package br.com.alura.atividades;

public class Desafios {
    public static void main(String[] args) {
//         1- Crie uma classe br.com.alura.atividades.Pessoa com um metodo que exibe Olá, mundo! no console.

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "samuel";
        pessoa1.hello();


        // 2 - Crie uma classe br.com.alura.atividades.Calculadora com um metodo que recebe um número como parâmetro e retorna o dobro desse número.

        Calculadora calc = new Calculadora();
        calc.dobroDoValor(10);
        System.out.println(calc.dobroDoValor());

        // 3 - Crie uma classe br.com.alura.atividades.Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.

        Musica musica1 = new Musica();
        musica1.artista = "Kendrick Lamar";
        musica1.titulo = "Silent Hill";
        musica1.anoLancamento = 2024;

        musica1.avalia(8);
        musica1.avalia(8);
        musica1.avalia(8);

        musica1.exibeFichaTecnica();
        System.out.println(musica1.pegaMedia());

        // 4 - Crie uma classe br.com.alura.atividades.Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.

        Carro ferrari = new Carro();
        ferrari.modelo = "Pagani";
        ferrari.ano = 2008;
        ferrari.cor = "amarela";

        ferrari.exibirFichaTecnica();
        ferrari.calcularIdade(2025);

        // 5 - Crie uma classe br.com.alura.atividades.Aluno com atributos nome, idade, e um metodo para exibir informações. Crie uma instância da classe br.com.alura.atividades.Aluno, atribua valores aos seus atributos e utilize o metodo para exibir as informações.

        Aluno aluno1 = new Aluno();
        aluno1.nome = "samuel";
        aluno1.idade = 22;

        aluno1.exbirInformacoesAluno();

        //

        // 1 - Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico). Implemente métodos getters e setters para os atributos privados.

        ContaBancaria cliente1 = new ContaBancaria();

        cliente1.setTitular("Lorenas");
        cliente1.setSaldo(20.000);
        cliente1.setNumeroConta(12345);
        cliente1.exibirFchaTecnica();

        // 2 - Crie uma classe IdadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um metodo verificarIdade que imprime se a pessoa é maior de idade ou não.

        idadePessoa novaPessoa = new idadePessoa();
        novaPessoa.setIdade(18);
        novaPessoa.setNome("Fernana Montenegro");

        novaPessoa.exibirPessoa();
        novaPessoa.maiorOuMenorDeIdade();

        // 3 - Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um metodo aplicarDesconto que recebe um valor percentual e reduz o preço do produto.

        Produto produto1 = new Produto();

        produto1.setNome("Monitor");
        produto1.setPrecoOriginal(1.355);
        produto1.setPercentualDesconto(15);

        produto1.exibirFichaTecnica();

        // 4 - Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um metodo calcularMedia que retorna a média das notas do aluno.

        Livro livro1 = new Livro();

        livro1.setAutor("Sam michael");
        livro1.setTitulo("A vida como ela é");
        livro1.exibirDetalhes();

    }

}


























