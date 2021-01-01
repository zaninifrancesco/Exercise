package com.company;

public class Partecipante {
    private String nome;
    private int rettaMensile;
    private String[] discipline = new String[100];
    private int cont = 0;

    public Partecipante(String nome, int retta){
        this.nome = nome;
        this.rettaMensile = retta;
    }

    public void aggiungiDisciplina(String disc){
        if(cont < discipline.length){
            discipline[cont] = disc;
            cont++;
        }
    }

    public String getNome(){
        return this.nome;
    }

    public int getRettaMensile() {
        return this.rettaMensile;
    }

    public String[] getDiscipline(){
        return discipline;
    }

    public void setRettaMensile(int costo){
        this.rettaMensile += costo;
    }


}
