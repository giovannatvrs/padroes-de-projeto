package model;

import strategy.MultaAluno;

public class Aluno extends Usuario{
    private int matricula;
    public Aluno(String nome, int matricula) {
        super(nome, new MultaAluno());
        setMatricula(matricula);
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }
}
