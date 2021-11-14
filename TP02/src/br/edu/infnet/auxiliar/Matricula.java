package br.edu.infnet.auxiliar;

public class Matricula {

    private static int matricula;

    public int setMatricula() {
        if(matricula == 0) {
            return this.matricula = 1;
        } else {
            return this.matricula = matricula + 1;
        }
    }
}
