package br.edu.infnet.testes;

import java.util.Scanner;

public class TP01 {
	
	private static String[] alunos;
	private static float[] av1;
	private static float[] av2;
	
	private final static int QTDE_ALUNOS = 100;
	
	private static float media(float av1, float av2) {
		float media = (av1 + av2) / 2;
		return media;
	}
	
	private static void situacao(float media) {
		if (media < 4) {
			System.out.println("Situação: Reprovado.");
		} else if (media < 7) {
			System.out.println("Situação: Prova final.");
		} else {
			System.out.println("Situação: Aprovado.");
		}
	}
	
	private static void impressao(int posicao) {
		System.out.printf("Nome do aluno: %s\nNota da AV1: %.2f\nNota da AV2: %.2f\n", 
				alunos[posicao], av1[posicao], av2[posicao]);
		
		float media = media(av1[posicao], av2[posicao]);
		
		System.out.println("Média final: " + media);
		
		situacao(media);
				
		System.out.println("---------------------------------------");
	}
	
	public static void main(String[] args) {
		alunos = new String[QTDE_ALUNOS];
		av1 = new float[QTDE_ALUNOS];
		av2 = new float[QTDE_ALUNOS];
		
		Scanner in = new Scanner(System.in);
		
		String opcao = null;
				
		int index = 0;
		
		do {
			System.out.println("[1] Registrar as notas de um novo aluno.");
			System.out.println("[2] Consultar boletim de um aluno.");
			System.out.println("[3] Consultar notas da turma.");
			System.out.println("[4] Sair");
			System.out.println("Informe a opção desejada: ");
			
			opcao = in.next();
			
			switch (opcao) {
			case "1":
				if(index < QTDE_ALUNOS) {
					System.out.println("Informe o nome do aluno: ");
					alunos[index] = in.next();
					
					System.out.println("Informe a nota da avaliação 1: ");
					av1[index] = in.nextFloat();
					
					System.out.println("Informe a nota da avaliação 2: ");
					av2[index] = in.nextFloat();
					
					System.out.println("Aluno cadastrado com sucesso.");
					System.out.println("Código de registro do aluno: " + index);
					
					index += 1;
				} else {
					System.out.println("Não é possível inserir um novo registro.");
				}
				break;
				
			case "2":
				System.out.println("Informe o código do aluno: ");
				int codigo = in.nextInt();
				
				if(codigo >= 0 && codigo < index) {
					impressao(codigo);
				} else {
					System.out.println("Código inválido.");
				}
				break;
				
			case "3":
				for (int i = 0; i < index; i++) {
				
					impressao(i);
				}			
				
				System.out.println("***************************************");
				break;
				
			case "4":
				System.out.println("Saindo...");				
				break;
			
			default:
				System.out.println("Opção inválida!!!"); // nenhuma das opções
				break;
			}
			
			
			
		} while(!"4".equals(opcao));
		
		System.out.println("Terminou!!!");		
		
		
		in.close();
								
		}
}
