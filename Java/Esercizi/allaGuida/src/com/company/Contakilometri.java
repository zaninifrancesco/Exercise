package com.company;

public class Contakilometri {

    private float kmTraveled;

    public Contakilometri(){
        this.kmTraveled = 0;
    }

    public void incrementa(float km){
        this.kmTraveled += km;
    }

    public String lettura(){
        return "Si sono percorsi " + this.kmTraveled + ". ";
    }

    public float getKmTraveled() {
        return kmTraveled;
    }
}
