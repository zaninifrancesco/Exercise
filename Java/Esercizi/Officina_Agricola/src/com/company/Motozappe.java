package com.company;

public class Motozappe extends Attrezzatura{

    private int nRuote;

    public Motozappe(int nOrdine, String marca, int nLav, int nRuote){
        super(nOrdine, marca, nLav);
        this.nRuote = nRuote;
    }

    public int getnRuote() {
        return nRuote;
    }
}
