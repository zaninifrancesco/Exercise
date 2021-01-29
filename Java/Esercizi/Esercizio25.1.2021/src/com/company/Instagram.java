package com.company;

public class Instagram extends Social{

    private int nStorie = 0;
    private int nPost = 0;

    public Instagram(int numeroFollower, int numeroSeguiti, int numeroStorie, int numeroPost) {
        super(numeroFollower, numeroSeguiti);

        this.nPost = numeroPost;
        this.nStorie = numeroStorie;

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

    public int getnPost() {
        return this.nPost;
    }
}
