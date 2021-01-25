package com.company;

public class Social {
    private int nFollower;
    private int nSeguiti;

    public Social(int numeroFollower, int numeroSeguiti){
        this.nFollower = numeroFollower;
        this.nSeguiti = numeroSeguiti;
    }

    public void aggiungiFollower(){
        this.nFollower++;
    }

    public void seguiQualcuno(){
        this.nSeguiti++;
    }


    public int getnSeguiti() {
        return nSeguiti;
    }

    public int getnFollower() {
        return nFollower;
    }


}
