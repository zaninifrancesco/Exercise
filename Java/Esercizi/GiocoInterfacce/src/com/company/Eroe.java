package com.company;

public class Eroe implements Umano {

    protected int forza;

    public Eroe() {
        forza = 10;
    }

    public void combatti() {
        forza = forza - 3;
    }

    public int getForza() {
        return forza;
    }
}