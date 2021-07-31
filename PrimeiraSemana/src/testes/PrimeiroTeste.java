package testes;

public class PrimeiroTeste {
	
	private static String nome;
	private static String sobrenome;
	private static int idade;
	private static float salario;
	private static boolean java;
	private static int mesesDeTrabalho;
	
	
	
	// private | protected | public
	// package/default
	private static boolean validar(int qtde) {
		/*
		if(qtde == 6) {
			return true;
		} else {
			return false;
		}
		*/
		return qtde == 6;
			
	}
	
	private static int calcularAnoNascimento(int minhaIdade) {
		return 2021 - minhaIdade; 
	}
	
	private static float calcularSalarioTotal(float salario, int qtdeMes) {
		return salario * qtdeMes;
	}
	
	private static String definirSituacao(int aIdade) {
		if(aIdade < 50) {
			return "Iniciante";
		}
		return "Veterano";
	}
	
	private static String definirStatus(float osalarioTotal) {
		if(osalarioTotal > 1000) {
			return "Estável";
		}
		return "Instável";
	}
	
	private static void tratarParametros(String[] argumentos) {
		nome = argumentos[0];
		sobrenome = argumentos[1];
		idade = Integer.valueOf(argumentos[2]);
		salario = Float.valueOf(argumentos[3]);
		java = Boolean.valueOf(argumentos[4]);
		mesesDeTrabalho = Integer.valueOf(argumentos[5]);
	}
		
	public static void main(String[] args) {
		System.out.println("Hello, World!");
		//System.out.println(args.length);

		//tipo nomeVariavel = atribuicao;
		//if(args.length == 6){
		if(validar(args.length)) {

			tratarParametros(args);
			/*
			// input
			String nome = args[0];
			String sobrenome = args[1];
			int idade = Integer.valueOf(args[2]);
			float salario = Float.valueOf(args[3]);
			boolean java = Boolean.valueOf(args[4]);
			int mesesDeTrabalho = Integer.valueOf(args[5]);
			*/
			
			// processamento
			int anoNascimento = calcularAnoNascimento(idade);
			float salarioTotal = calcularSalarioTotal(salario, mesesDeTrabalho);
			String situacao = definirSituacao(idade);
			String status = definirStatus(salarioTotal);
						
			// output
			System.out.println("Nome: " + nome);
			System.out.println("Sobrenome: " + sobrenome);
			System.out.println("Idade: " + idade);
			System.out.println("Ano de nascimento: " + anoNascimento);
			System.out.println("Salario: " + salario);
			System.out.println("Salario total: " + salarioTotal);
			System.out.println("DevJava: " + java);
			System.out.println("Situação: " + situacao);
			System.out.println("Status: " + status);
		} 
		
		else{
			System.out.println("Deu ruim.");
		}
	}

}
