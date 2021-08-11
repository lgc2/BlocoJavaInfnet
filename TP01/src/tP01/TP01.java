package tP01;

import java.util.Scanner;

public class TP01 {
	
	private static String[] alunos;
	private static float[] av1;
	private static float[] av2;
	
	private final static int QTDE_ALUNOS = 100;
	
	private static void impressao(int posicao) {
		System.out.printf("Nome do aluno: %s\nNota da AV1: %.2f\nNota da AV2: %.2f\n", 
				alunos[posicao], av1[posicao], av2[posicao]);
		
		float media = (av1[posicao] + av2[posicao]) / 2;
		System.out.printf("Média final : %.2f\n", media);
		
		String situacao;
		if (media < 4) {
			System.out.println("Situação: Reprovado.");
		} else if (media < 7) {
			System.out.println("Situação: Prova final.");
		} else {
			System.out.println("Situação: Aprovado.");
		}
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
				System.out.println("Informe o nome do aluno: ");
				alunos[index] = in.next();
				
				System.out.println("Informe a nota da avaliação 1: ");
				av1[index] = in.nextFloat();
				
				System.out.println("Informe a nota da avaliação 2: ");
				av2[index] = in.nextFloat();
				
				index += 1;
				break;
				
			case "2":
				System.out.println("Informe o código do aluno: ");
				int codigo = in.nextInt();
				
				/*
				System.out.printf("Nome do aluno: %s\nNota da AV1: %.2f\nNota da AV2: %.2f\n", 
						alunos[codigo], av1[codigo], av2[codigo]);
				
				float mediaCaso2 = (av1[codigo] + av2[codigo]) / 2;
				System.out.printf("Média final : %.2f\n", mediaCaso2);
				
				String situacaoCaso2;
				if (mediaCaso2 < 4) {
					System.out.println("Situação: Reprovado.");
				} else if (mediaCaso2 < 7) {
					System.out.println("Situação: Prova final.");
				} else {
					System.out.println("Situação: Aprovado.");
				}
				*/
				impressao(codigo);
				break;
				
			case "3":
				for (int i = 0; i < index; i++) {
					/*
					System.out.printf("Nome do aluno: %s\nNota da AV1: %.2f\nNota da AV2: %.2f\n", 
							alunos[i], av1[i], av2[i]);
					
					float mediaCaso3 = (av1[i] + av2[i]) / 2;
					System.out.printf("Média final : %.2f\n", mediaCaso3);
					
					String situacaoCaso3;
					if (mediaCaso3 < 4) {
						System.out.println("Situação: Reprovado.");
					} else if (mediaCaso3 < 7) {
						System.out.println("Situação: Prova final.");
					} else {
						System.out.println("Situação: Aprovado.");
					}
					
					System.out.println("---------------------------------------");
				*/
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

/*
if ("1".equals(opcao)) {
				System.out.println("Cadastrando...");
			} else if ("2".equals(opcao)) {
				System.out.println("Consultando individual...");
			} else if ("3".equals(opcao)) {
				System.out.println("Consultando turma...");
			} else if ("4".equals(opcao)) {
				System.out.println("Saindo...");
			} else {
				System.out.println("Opção inválida!!!");
			}
*/
//System.out.println("Digite o número da oção desejada: ");
		//int opcao = in.nextInt();
		
		/*
		while (opcao != -1) {
			if (opcao == 1) {
				System.out.println("Informe nome do aluno: ");
				alunos[] = in.next();
			}
		}
		*/
/*
alunos = new String[QTDE_ALUNOS];
av1 = new double[QTDE_ALUNOS];
av2 = new double[QTDE_ALUNOS];

int qtde = 1;




while (opcao != -1) {
	if (opcao == 1) {
		for(int i = 0; i < qtde; i++) {
			System.out.println("Informe o nome do aluno: ");
			alunos[i] = in.next();
		}
	}
} 
*/

/*
if(qtde < QTDE_ALUNOS) {
	alunos = new String[qtde];
	av1 = new double[qtde];
	av2 = new double[qtde];
	
	for(int i = 0; i < qtde; i++) {
		System.out.println("Informe o nome do aluno: ");
		alunos[i] = in.next();
	}
	*/
