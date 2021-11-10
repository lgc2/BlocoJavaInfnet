package br.edu.infnet.testes;

import br.edu.infnet.auxiliar.Constante;
import br.edu.infnet.dominio.Administrativo;

import java.util.Scanner;

public class TP03Teste {

    private static Administrativo[] administrativos;

    public static void main(String[] args) {
        administrativos = new Administrativo[Constante.QTDE];

        Scanner in = new Scanner(System.in);

        String opcao = null;

        int index = 0;

        do {
            System.out.println("[1] Cadastrar");
            System.out.println("[2] Consultar um");
            System.out.println("[3] Consultar todos");
            System.out.println("[4] Sair");
            System.out.print("Informe a opção desejada: ");

            opcao = in.next();

            switch (opcao) {
                case "1":
                    if(index < Constante.QTDE) {
                        Administrativo adm = new Administrativo();

                        System.out.println("Informe o seu nome: ");
                        adm.setNome(in.next());

                        System.out.println("Informe a sua idade:");
                        adm.setIdade(in.nextInt());

                        System.out.println("Informe o seu salário:");
                        adm.setSalario(in.nextFloat());

                        System.out.println("Informe o seu bônus:");
                        adm.setBonus(in.nextFloat());

                        System.out.println("Informe o seu desconto:");
                        adm.setDesconto(in.nextFloat());

                        administrativos[index] = adm;

                        System.out.println("------------------------");
                        System.out.println("Funcionário cadastrado com sucesso:");
                        administrativos[index].impressao();
                        System.out.println("------------------------");

                        index++;
                    } else {
                        System.out.println("Lista cheia!!!");
                    }
                    break;

                case "2":
                    System.out.print("Informe o código do funcionário: ");
                    int codigo = in.nextInt();
                    if(codigo >= 0 && codigo < index) {
                        administrativos[codigo].impressao();
                    } else {
                        System.out.println("Número de cadastro informado é inválido!");
                    }
                    break;

                case "3":
                    for(int i = 0; i < index; i++) {
                        administrativos[i].impressao();
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

        System.out.println("Terminou!!!");

        in.close();
    }


}
