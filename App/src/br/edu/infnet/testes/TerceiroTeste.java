package br.edu.infnet.testes;

import br.edu.infnet.auxiliar.Constante;

import java.util.Scanner;

public class TerceiroTeste {
	
	private static String[] nomes;

//	private final static int QTDE_ALUNOS = 10;
	
	private static void impressao(int posicao){
		System.out.println("---------------------------------");
		System.out.println("Aluno: {" + posicao + "} " + nomes[posicao]);
		System.out.println("---------------------------------");
	}
	
	public static void main(String[] args) {

		int qtde = Integer.valueOf(args[0]);

		if(qtde < Constante.QTDE_ALUNOS) {
			nomes = new String[qtde];
			
			Scanner in = new Scanner(System.in);

			String opcao = null;
			int indiceDeCadastro = 0;

			do {
				System.out.println("[1] Cadastrar");
				System.out.println("[2] Consultar um");
				System.out.println("[3] Consultar todos");
				System.out.println("[4] Sair");
				System.out.print("Informe a opção desejada: ");

				opcao = in.next();

				switch (opcao) {
					case "1":
						if(indiceDeCadastro < qtde) {
							System.out.println("Informe o seu nome: ");
							nomes[indiceDeCadastro] = in.next();
							System.out.println("Nome cadastrado com sucesso. Cadastro número: " + indiceDeCadastro);
							indiceDeCadastro++;
						} else {
							System.out.println("Lista cheia!!!");
						}
						break;

					case "2":
						System.out.print("Informe o número do cadastro: ");
						int posicao = in.nextInt();
						if(posicao >= 0 && posicao < indiceDeCadastro) {
							impressao(posicao);
						} else {
							System.out.println("Número de cadastro informado é inválido!");
						}
						break;

					case "3":
						for(int i = 0; i < indiceDeCadastro; i++) {
							impressao(i);
						}
						break;

					case "4":
						System.out.println("Saindo!!!");
						break;

					default:
						System.out.println("Opção inválida");
						break;
				}

			} while(!"4".equals(opcao));

			in.close();

			System.out.println("Quantidade: " + qtde);
			
		} else {
			System.out.println("Esta quantidade é superior ao número máximo!!!");
		}
	}

}
