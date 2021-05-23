package com.company;

public class Vampiro implements Mostro {

    protected int forza;

    public Vampiro() {
        forza = 15;
    }

    public void azzanna() {
        forza = forza - 2;
    }

    public int getForza() {
        return forza;
    }

}
