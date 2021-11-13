package br.edu.infnet.testes;

public class StringTeste {

    public static void main(String[] args) {

        // Os métodos da String não afetam o texto orginal, eles o transformam em um novo texto.

        String nome = "Luiz Gustavo Coutinho Carvalho";

        System.out.println("Nome: " + nome);
        System.out.println("Nome: " + nome.charAt(3));

        String nomeUp = nome;

        System.out.println("Nome: " + nome.toUpperCase());
        System.out.println("Nome: " + nome);
        System.out.println("");

        System.out.println("Nome: " + nomeUp.toUpperCase());
        System.out.println("Nome: " + nomeUp);
        System.out.println("");

        System.out.println("Nome: " + nomeUp.toLowerCase());
        System.out.println("Nome: " + nomeUp);
        System.out.println("");

        nomeUp = nome.toUpperCase();
        System.out.println("Nome: " + nomeUp);
        System.out.println("");

        if(nome.equals(nomeUp)) {
            System.out.println("Luiz... = LUIZ... --> s/ ignoreCase: V");
        } else {
            System.out.println("Luiz... = LUIZ... --> s/ ignoreCase: F");
        }

        if(nome.equalsIgnoreCase(nomeUp)) {
            System.out.println("Luiz... = LUIZ... --> c/ ignoreCase: V");
        } else {
            System.out.println("Luiz... = LUIZ... --> c/ ignoreCase: F");
        }

    }
}
