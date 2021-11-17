package br.edu.infnet.dominio;

public class Empresa {

    private String nome;
    private String sobrenome;
    private String ultimoNome;

    public String getNome() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.ultimoNome.toUpperCase().charAt(0));
        sb.append("., ");
        sb.append(this.nome.toUpperCase());
        sb.append(" ");
        sb.append(this.sobrenome.toLowerCase());
        sb.append(".");

        return sb.toString();
    }

    public void setNome(String nome) {
        int posInicial = nome.indexOf(" "); // Recuperando a posição do primeiro espaço
        int posFinal = nome.lastIndexOf(" "); // Recuperando a posição do último espaço

        this.nome = nome.substring(0, posInicial);
        this.sobrenome = nome.substring(posInicial, posFinal).trim(); // (posInicial + 1, posFinal)
        this.ultimoNome = nome.substring(posFinal).trim(); // (posFinal + 1)
    }

    public void impressao() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return getNome();
    }
}
