package br.edu.infnet.dominio;

import br.edu.infnet.auxiliar.Matricula;

public class Aluno extends Pessoa {

    private int matriculaDoAluno;
    private String modalidadeDoAluno;
    private float mensalidade;

    public Aluno() {
        Matricula matricula = new Matricula();
        this.matriculaDoAluno = matricula.setMatricula();
    }

    public void impressao() {
        System.out.printf("%d) %s - matrícula número %d - mensalidade: R$ %.2f\n",
                this.getPosicao(),
                this.getNome(),
                this.getMatriculaDoAluno(),
                this.getMensalidade()
        );
    }

    @Override
    public String toString() {
        return "Sou o aluno " + this.getNome();
    }

    public int getMatriculaDoAluno() {
        return matriculaDoAluno;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(String modalidadeDoAluno) {
        this.modalidadeDoAluno = modalidadeDoAluno;
        if("EAD".equalsIgnoreCase(modalidadeDoAluno)) {
            this.mensalidade = 481.00f;
        } else if ("Presencial".equalsIgnoreCase(modalidadeDoAluno)) {
            this.mensalidade = 1200.00f;
        } else {
            System.out.println("Modalidade informada não existe!");
        }
    }
}


