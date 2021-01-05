package com.company;

public class Partecipante {
    private String nome;
    private int rettaMensile = 0;
    private String[] discipline = new String[3];    //Array di stringhe di dimensione 3 tante quante sono le discipline possibili
    private int cont = 0;

    public Partecipante(String nome){
        this.nome = nome;
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
