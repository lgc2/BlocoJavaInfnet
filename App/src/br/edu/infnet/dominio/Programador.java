package br.edu.infnet.dominio;

public class Programador extends Funcionario{

    private boolean fullstack;
    private String linguagem;

    public Programador() {
        this.setNome("Javeiro");
    }

    public Programador(String nome, int idade) {
        this.setNome(nome);
        this.setIdade(idade);
    }

    public Programador(String nome, int idade, float salario, boolean fullstack, String linguagem) {
        this(nome, idade);
        this.setSalario(salario);
        this.fullstack = fullstack;
        this.linguagem = linguagem;
    }
    private float calcularSalarioFullstack() {
        return fullstack ? 1500 : 500;
    }

    private float calcularSalarioLinguagem() {
        return "java".equalsIgnoreCase(linguagem) ? 2000 : 750;
    }

    public float calcularSalarioLiquido() {
        return this.getSalario() + this.calcularSalarioFullstack() + this.calcularSalarioLinguagem();
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
                this.getNome(),
                this.getIdade(),
                calculoSalarial,
                obterSituacao(calculoSalarial)
        );
    }

    public boolean getFullstack() {
        return fullstack;
    }

    public void setFullstack(boolean fullstack) {
        this.fullstack = fullstack;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    @Override
    public String toString() {
        return "Sou o programador " + this.getNome();
    }
}
