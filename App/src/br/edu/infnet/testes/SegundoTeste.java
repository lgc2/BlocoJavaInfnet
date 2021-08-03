package br.edu.infnet.testes;

public class SegundoTeste {
	public static void main(String[] args) {
		
		// input
		int qtde = Integer.valueOf(args[0]);
		
		// processamento
		if (qtde % 2 == 0) {
			System.out.println("O valor " + qtde + " é par.");
		} else {
			System.out.println("O valor " + qtde + " é ímpar.");
		}
		
		/*
		if(qtde == 1) {
			System.out.println("LG");
		} else {
			if(qtde == 2) {
				System.out.println("LG");
				System.out.println("LG");
			} else {
				if(qtde == 3) {
					System.out.println("LG");
					System.out.println("LG");
					System.out.println("LG");
				}
			}
		
		}
		*/
		
		
		//FOR
		//for(inicializacao;condicao;incremento) {}
		for(int i = 0; i < qtde; i++) {
			System.out.println((i + 1) + " --> " + "FOR: Luiz Gustavo Coutinho Carvalho");
		}
		
		
		//WHILE
		int j = 0;
		while (j < qtde) {
			System.out.println((j + 1) + " --> " + "WHILE: Luiz Gustavo Coutinho Carvalho");
			j++;
		}
		
		//DO/WHILE
		int k = 0;
		do {
			System.out.println((k + 1) + " --> " + "DO/WHILE: Luiz Gustavo Coutinho Carvalho");
			k++;
		}
		while (k < qtde);
		
		
		
		
		
	}

}
