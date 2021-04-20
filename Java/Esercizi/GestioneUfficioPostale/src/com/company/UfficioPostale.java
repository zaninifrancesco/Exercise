package com.company;

public class UfficioPostale {

    private Sportello[] sportelli;
    private int nSportelli;
    private int cont = 0;

    public UfficioPostale(int nSportelli) {
        sportelli = new Sportello[nSportelli];
    }

    public void aggiungiSportelli(Sportello sportello) {
        if (cont < sportelli.length) {
            sportelli[cont] = sportello;
            cont++;
        }
    }

    public Sportello[] getSportelli() {
        return sportelli;
    }
}
