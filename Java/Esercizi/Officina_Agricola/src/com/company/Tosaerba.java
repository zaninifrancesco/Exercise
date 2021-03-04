package com.company;

public class Tosaerba extends Attrezzatura{

    private int nRuote;

    public Tosaerba(int nOrdine, String marca, int nLav, int nRuote){
        super(nOrdine, marca, nLav);
        this.nRuote = nRuote;
    }

    public int getnRuote() {
        return nRuote;
    }
}
