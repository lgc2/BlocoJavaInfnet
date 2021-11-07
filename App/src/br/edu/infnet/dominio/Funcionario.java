package br.edu.infnet.dominio;

import br.edu.infnet.auxiliar.Constante;

public class Funcionario {

    public String nome;
    public int idade;
    public float salario;
    public float bonus;
    public float desconto;

    protected int posicao;


    public Funcionario() { // Construtor padrão
        this.nome = "Fantasma";
    }

    public Funcionario(String nome, int idade) { // Construtor
        this.nome = nome; // this --> representa o objeto, substitui o nome do objeto
        this.idade = idade;
    }

    public Funcionario(String nome, int idade, float salario) {
        this(nome, idade); // Está chamando o construtor de cima que possui 2 parâmetros, String e int
        this.salario = salario;
    }

    private float calcularSalarioLiquido() {
        return salario + bonus - desconto;
    }

    private String obterSituacao(float salarioLiquido) {
        String situacao = salarioLiquido > Constante.VALOR ? "Rico" : "Pobre";

        return situacao;
    }

    public void impressao() {
        float calculoSalarial = calcularSalarioLiquido();

        System.out.printf("[%d] %s - %d anos || R$%.2f : %s\n",
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
                ", bonus=" + bonus +
                ", desconto=" + desconto +
                '}';
    }
}
