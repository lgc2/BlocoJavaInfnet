package br.edu.infnet;

public class SegundoTeste {
	public static void main(String[] args) {
		
		// input
		float qtde = Float.valueOf(args[0]);
		
		// processamento
		if (qtde % 2 == 0) {
			System.out.println("O valor " + qtde + " é par.");
		} else {
			System.out.println("O valor " + qtde + " é ímpar.");
		}
	}

}
