package com.company;

public class Partecipante {
    private String nome;
    private int rettaMensile;
    private String[] discipline = new String[3];
    private int cont = 0;
    private boolean postoDisp = true;

    public Partecipante(String nome, int retta){
        this.nome = nome;
        this.rettaMensile = retta;
    }

    public boolean aggiungiDisciplina(String disc){
        if(cont < discipline.length){
            discipline[cont] = disc;
            cont++;
        }
        else{
            postoDisp = false;
        }
        return postoDisp;
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

    public boolean getPostoDisp() {
        return postoDisp;
    }
}
