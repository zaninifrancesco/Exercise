package com.company;

public class Supporto {
    private String nome;
    private int prezzo;
    private int spazio;

    public Supporto(String name, int prezzo, int spazio){
        this.nome = name;
        this.prezzo = prezzo;
        this.spazio = spazio;
    }

    public int getPrezzo(){
        return this.prezzo;
    }

    public int getSpazio(){
        return this.spazio;
    }

    public String getNome(){
        return this.nome;
    }
}
