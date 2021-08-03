package br.edu.infnet.testes;

import java.util.Scanner;

public class SegundoTeste {
	public static void main(String[] args) {
		
		// input com Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o seu nome: ");
		String nome = input.next();
		
		System.out.println("Informe a sua idade: ");
		int idade = input.nextInt();
		
		System.out.println("Informe o seu salário: ");
		float salario = input.nextFloat();
		
		// input
		int qtde = Integer.valueOf(args[0]);
		
		// processamento
		if (qtde % 2 == 0) {
			System.out.println("O valor " + qtde + " é par.");
		} else {
			System.out.println("O valor " + qtde + " é ímpar.");
		}
		
		
		//FOR
		//for(inicializacao;condicao;incremento) {}
		for(int i = 0; i < qtde; i++) {
			System.out.println((i + 1) + " --> " + "FOR: " + nome + " - " + idade + " - " + salario);
		}
		
		
		//WHILE
		int j = 0;
		while (j < qtde) {
			System.out.println((j + 1) + " --> " + "WHILE: " + nome + " - " + idade + " - " + salario);
			j++;
		}
		
		//DO/WHILE
		int k = 0;
		do {
			System.out.println((k + 1) + " --> " + "DO/WHILE: " + nome + " - " + idade + " - " + salario);
			k++;
		}
		while (k < qtde);
		
		
		input.close();
		
		
	}

}
