package br.edu.infnet.dominio;

public abstract class Pessoa {

    private String nome;
    private int idade;

    private int posicao;

    public abstract void impressao();

    @Override
    public String toString() {
        return "{" +
                "nome=\"" + nome + "\"" +
                ", idade=" + idade +
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

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int index) {
        this.posicao = index;
    }
}
