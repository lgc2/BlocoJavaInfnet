public class PrimeiroTeste {
	// visibilidade tipoRetorno nomeMetodo parametro
	// inteiro = int
	// real = float ou double
	// lógico = boolean
	// texto = String
	// void = não tem um tipo de retorno
	// visibilidades: private, public, protected, package/default
	// args = ["x", "y", "z", "2000", "true"]
	
	public static void main(String[] args){
		System.out.println("Hello, World!");
		System.out.println(args.length);

		//tipo nomeVariavel = atribuicao;
		if(args.length == 6){

			// input
			String nome = args[0];
			String sobrenome = args[1];
			int idade = Integer.valueOf(args[2]);
			float salario = Float.valueOf(args[3]);
			boolean java = Boolean.valueOf(args[4]);
			int mesesDeTrabalho = Integer.valueOf(args[5]);
		
			// processamento
			int anoNascimento = 2021 - idade;
			float recebido = salario * mesesDeTrabalho;

			// output
			System.out.println("Nome: " + nome);
			System.out.println("Sobrenome: " + sobrenome);
			System.out.println("Idade: " + idade);
			System.out.println("Ano de nascimento: " + anoNascimento);
			System.out.println("Salario: " + salario);
			System.out.println("Salario total: " + recebido);
			System.out.println("DevJava: " + java);
		} else{
			System.out.println("Deu ruim.");
		}

				
		
	}
}