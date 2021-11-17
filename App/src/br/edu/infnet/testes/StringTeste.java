package br.edu.infnet.testes;

public class StringTeste {

    public static void main(String[] args) {

        // Os métodos da String não afetam o texto orginal, eles o transformam em um novo texto.

        String nome = "Luiz Gustavo Coutinho Carvalho";
        String nome2 = " Luiz Gustavo Coutinho Carvalho ";
        String nome3 = " Francisca";

        System.out.println("Nome: " + nome);
        //

        System.out.println("Nome: [" + nome2 + "]");
        System.out.println("Nome: [" + nome2.trim() + "]"); // Trim cortou espaços no início e no fim da String
        System.out.println("Primeiras 5 letras do usuário: " + nome3.substring(0, 5)); //errado pois tem espaço no início
        System.out.println("Primeiras 5 letras do usuário: " + nome3.trim().substring(0, 5));

    }

}

// System.out.println("Nome: " + nome.charAt(3));
//
//        String nomeUp = nome;
//
//        System.out.println("Nome: " + nome.toUpperCase());
//        System.out.println("Nome: " + nome);
//        System.out.println("");
//
//        System.out.println("Nome: " + nomeUp.toUpperCase());
//        System.out.println("Nome: " + nomeUp);
//        System.out.println("");
//
//        System.out.println("Nome: " + nomeUp.toLowerCase());
//        System.out.println("Nome: " + nomeUp);
//        System.out.println("");
//
//        nomeUp = nome.toUpperCase();
//        System.out.println("Nome: " + nomeUp);
//        System.out.println("");
//
//        if(nome.equals(nomeUp)) {
//            System.out.println("Luiz... = LUIZ... --> s/ ignoreCase: V");
//        } else {
//            System.out.println("Luiz... = LUIZ... --> s/ ignoreCase: F");
//        }
//
//        if(nome.equalsIgnoreCase(nomeUp)) {
//            System.out.println("Luiz... = LUIZ... --> c/ ignoreCase: V");
//        } else {
//            System.out.println("Luiz... = LUIZ... --> c/ ignoreCase: F");
//        }

//        System.out.println("Nome: " + nome.indexOf("u"));
//        System.out.println("Nome: " + nome.lastIndexOf("u"));
//        System.out.println("Nome: " + nome.indexOf(" "));
//        System.out.println("Nome: " + nome.lastIndexOf(" "));


//        System.out.println("Nome: " + nome.substring(3)); // Pega a partir do índice 3
//        System.out.println("Nome: " + nome.substring(3, 8)); // Pega a partir do índice 3 e um antes do end (7)
//        System.out.println("Nome: " + nome.substring(0, 4)); // Luiz
//        System.out.println("Nome: " + nome.substring(5, 12)); // Gustavo
//        System.out.println("Nome: " + nome.substring(13, 21)); // Coutinho
//        System.out.println("Nome: " + nome.substring(22, 30)); // Carvalho
//        System.out.println("Nome: " + nome.substring(22)); // Carvalho