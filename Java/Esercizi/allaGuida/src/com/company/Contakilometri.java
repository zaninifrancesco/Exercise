package com.company;

public class Contakilometri {

    private float kmTraveled;

    public Contakilometri(int km){
        this.kmTraveled = km;
    }

    public void incrementa(int km){
        this.kmTraveled += km;
    }

    public String lettura(){
        return "Si sono percorsi " + this.kmTraveled + ". ";
    }

}
