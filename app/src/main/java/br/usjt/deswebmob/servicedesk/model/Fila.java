package br.usjt.deswebmob.servicedesk.model;

import java.io.Serializable;

/**
 * Created by Daniel André dos Santos - RA: 816125541
 */

class Fila implements Serializable{
    private int id;
    private String nome;

    public Fila(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Fila(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
