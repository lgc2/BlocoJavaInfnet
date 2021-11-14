package br.edu.infnet.dominio;

import br.edu.infnet.auxiliar.Matricula;

public class Aluno extends Pessoa {

    private int matriculaDoAluno;
    private float mensalidade;

    public Aluno() {
        Matricula matricula = new Matricula();
        this.matriculaDoAluno = matricula.setMatricula();
    }

    public float calcularSalarioLiquido(){return 0.0f;}

    public void impressao() {
        System.out.printf("%d) %s - matrícula número %d\n",
                this.getPosicao(),
                this.getNome(),
                this.getMatriculaDoAluno()
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

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }
}


