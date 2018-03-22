package br.usjt.deswebmob.servicedesk.model;

/**
 * Created by Daniel André dos Santos - RA: 816125541
 */

public enum FilaId {
    PROJETO(1, "Novos Projetos"),
    REDES(5, "Redes"),
    SERVIDORES(4, "Servidores"),
    DESKTOPS(7, "Desktops"),
    TELEFONIA(6, "Telefonia"),
    ERP(3, "Manutanção do Sistema ERP"),
    VENDAS(2, "Manutenção do Sistema de Vendas");

    private final int id;
    private final String nome;

    FilaId(int num, String s){
        id = num;
        nome = s;
    }

    public int id(){
        return id;
    }
    public String nome(){
        return nome;
    }
}
