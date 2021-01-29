package com.company;

public class Tiktok extends Social{

    private int nTiktok = 0;

    public Tiktok(int numeroFollower, int numeroSeguiti) {
        super(numeroFollower, numeroSeguiti);
    }

    public void postaUnTiktok(){
        this.nTiktok++;
    }

    public int getnTiktok(){
        return this.nTiktok;
    }


}
