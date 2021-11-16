package br.edu.infnet.dominio;

import br.edu.infnet.auxiliar.Constante;

public class Professor extends Pessoa {

    private float salario;
    private float bonus;
    private float desconto;

    public float calcularSalarioLiquido() {
        return getSalario() + bonus - desconto;
    }

    private String obterSituacao(float salarioLiquido) {
        String situacao = salarioLiquido > Constante.VALOR ? "Rico" : "Pobre";

        return situacao;
    }

    public void impressao() {
        float calculoSalarial = calcularSalarioLiquido();

        System.out.printf("%d) %s - %d anos || R$%.2f : %s\n",
                getPosicao(),
                getNome(),
                getIdade(),
                calculoSalarial,
                obterSituacao(calculoSalarial)
        );
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float valorDoBonus) {
        this.bonus = valorDoBonus;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float valorDoDesconto) {
        this.desconto = valorDoDesconto;
    }

}
