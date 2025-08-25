package model;

import strategy.EstrategiaMulta;

import java.io.Serializable;

public abstract class Usuario{
    protected String nome;
    protected EstrategiaMulta estrategia;

    public Usuario(String nome, EstrategiaMulta estrategia){
        this.nome = nome;
        this.estrategia = estrategia;
    }

    public EstrategiaMulta getEstrategia() {
        return estrategia;
    }

    public double calcularMulta(int diasDeAtraso){
        return estrategia.calcularMulta(diasDeAtraso);
    }

    public String getNome() {
        return nome;
    }


}
