package com.company;

public class Instagram extends Social{

    private int nStorie = 0;
    private int nPost = 0;

    public Instagram(int numeroFollower, int numeroSeguiti) {
        super(numeroFollower, numeroSeguiti);
    }

    public void aggiungiFollower(){
        super.aggiungiFollower();
    }

    public void seguiQualcuno() {
        super.seguiQualcuno();
    }

    public void postaFoto(){
        nPost++;
    }

    public void postaStoria(){
        this.nStorie++;
    }

    public int getnStorie() {
        return this.nStorie;
    }
}
