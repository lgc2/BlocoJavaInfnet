package br.edu.infnet.testes;

import br.edu.infnet.auxiliar.Constante;
import br.edu.infnet.dominio.Professor;
import br.edu.infnet.dominio.Pessoa;
import br.edu.infnet.dominio.Aluno;

import java.util.Scanner;

public class TP02Teste {

    private static Pessoa[] pessoas;

    public static void main(String[] args) {
        pessoas = new Pessoa[Constante.QTDE];

        Scanner in = new Scanner(System.in);

        String opcao = null;

        int index = 0;

        do {
            System.out.println("*************MENU*************");
            System.out.println("[1] Cadastrar Professor");
            System.out.println("[2] Cadastrar Aluno");
            System.out.println("[3] Consultar um");
            System.out.println("[4] Consultar todos");
            System.out.println("[9] Sair");
            System.out.println("******************************");
            System.out.println("Informe a opção desejada: ");

            opcao = in.next();

            switch (opcao) {
                case "1":
                    if(index < Constante.QTDE) {
                        Professor professor = new Professor();

                        System.out.println("Informe o seu nome: ");
                        professor.setNome(in.next());

                        System.out.println("Informe a sua idade:");
                        professor.setIdade(in.nextInt());

                        System.out.println("Informe o seu salário:");
                        professor.setSalario(in.nextFloat());

                        System.out.println("Informe o seu bônus:");
                        professor.setBonus(in.nextFloat());

                        System.out.println("Informe o seu desconto:");
                        professor.setDesconto(in.nextFloat());

                        professor.setPosicao(index);

                        pessoas[index] = professor;

                        System.out.println("-----------------------------------------");
                        System.out.println("Professor cadastrado com sucesso:");
                        pessoas[index].impressao();
                        System.out.println("-----------------------------------------");

                        index++;
                    } else {
                        System.out.println("Lista cheia!!!");
                    }
                    break;

                case "2":
                    if(index < Constante.QTDE) {
                        Aluno aluno = new Aluno();

                        System.out.println("Informe o seu nome: ");
                        aluno.setNome(in.next());

                        System.out.println("Informe a sua idade:");
                        aluno.setIdade(in.nextInt());

                        String modalidade;
                        do {
                            System.out.println("Informe a modalidade - EAD ou Presencial:");
                            modalidade = in.next();
                            aluno.setMensalidade(modalidade);
                        } while(!"EAD".equalsIgnoreCase(modalidade) && !"Presencial".equalsIgnoreCase(modalidade));

                        aluno.setPosicao(index);

                        pessoas[index] = aluno;

                        System.out.println("-----------------------------------------");
                        System.out.println("Aluno cadastrado com sucesso:");
                        pessoas[index].impressao();
                        System.out.println("-----------------------------------------");

                        index++;
                    } else {
                        System.out.println("Lista cheia!!!");
                    }
                    break;

                case "3":
                    System.out.print("Informe o código do docente/discente: ");
                    int codigo = in.nextInt();
                    if(codigo >= 0 && codigo < index) {
                        pessoas[codigo].impressao();
                    } else {
                        System.out.println("Número de cadastro informado é inválido!");
                    }
                    break;

                case "4":
                    for(int i = 0; i < index; i++) {
                        pessoas[i].impressao();
                    }
                    break;

                case "9":
                    System.out.println("Saindo!!!");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while(!"9".equals(opcao));

        System.out.println("Terminou!!!");

        in.close();
    }


}
