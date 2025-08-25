package model;

import strategy.MultaProfessor;

public class Professor extends Usuario {
    private String email;
    public Professor(String nome, String email) {
        super(nome, new MultaProfessor());
        setEmail(email);
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
}
