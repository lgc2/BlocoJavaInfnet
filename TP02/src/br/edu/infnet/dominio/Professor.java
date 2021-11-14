package br.edu.infnet.dominio;

public class Professor extends Pessoa {

    private float bonus;
    private float desconto;

    public float calcularSalarioLiquido() {
        return getSalario() + bonus - desconto;
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
