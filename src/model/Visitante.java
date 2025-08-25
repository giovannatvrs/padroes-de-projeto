package model;

import strategy.MultaVisitante;

public class Visitante extends Usuario{
    public Visitante(String nome) {
        super(nome, new MultaVisitante());
    }
}
