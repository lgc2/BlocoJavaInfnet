package br.edu.infnet.dominio;

import br.edu.infnet.auxiliar.Constante;

public abstract class Pessoa {

    private String nome;
    private int idade;
    private float salario;

    private int posicao;


    public Pessoa() { // Construtor padrão
        this.nome = "Fantasma";
    }

    public Pessoa(String nome, int idade) { // Construtor
        this.nome = nome; // this --> representa o objeto, substitui o nome do objeto
        this.idade = idade;
    }

    public Pessoa(String nome, int idade, float salario) {
        this(nome, idade); // Está chamando o construtor de cima que possui 2 parâmetros, String e int
        this.salario = salario;
    }

    public abstract float calcularSalarioLiquido();

    private String obterSituacao(float salarioLiquido) {
        String situacao = salarioLiquido > Constante.VALOR ? "Rico" : "Pobre";

        return situacao;
    }

    public void impressao() {
        float calculoSalarial = calcularSalarioLiquido();

        System.out.printf("%d) %s - %d anos || R$%.2f : %s\n",
                posicao,
                nome,
                idade,
                calculoSalarial,
                obterSituacao(calculoSalarial)
        );
    }

    @Override
    public String toString() {
        return "{" +
                "nome=\"" + nome + "\"" +
                ", idade=" + idade +
                ", salario=" + salario +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int index) {
        this.posicao = index;
    }
}
