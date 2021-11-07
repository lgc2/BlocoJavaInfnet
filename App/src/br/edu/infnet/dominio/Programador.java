package br.edu.infnet.dominio;

public class Programador extends Funcionario{

    public boolean fullstack;
    public String linguagem;

    public Programador() {
        this.nome = "Javeiro";
    }

    public Programador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Programador(String nome, int idade, float salario, boolean fullstack, String linguagem) {
        this(nome, idade);
        this.salario = salario;
        this.fullstack = fullstack;
        this.linguagem = linguagem;
    }
    private float calcularSalarioFullstack() {
        return fullstack ? 1500 : 500;
    }

    private float calcularSalarioLinguagem() {
        return "java".equalsIgnoreCase(linguagem) ? 2000 : 750;
    }

    private float calcularSalarioLiquido() {
        return this.salario + this.calcularSalarioFullstack() + this.calcularSalarioLinguagem();
    }

    public String obterSituacao(float salarioLiquido) {
        String situacao = "Rico";

        if(salarioLiquido < 50) {
            situacao = "Pobre";
        } else if(salarioLiquido <= 100) {
            situacao = "Classe Média";
        }

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
        return "Sou o programador " + nome;
    }
}
