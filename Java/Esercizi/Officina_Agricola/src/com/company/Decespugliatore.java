package com.company;

public class Decespugliatore extends Attrezzatura{

    private boolean accElettrica;

    public Decespugliatore(int nOrdine, String marca, boolean accElettrica, int nLav){
        super(nOrdine, marca, nLav);
        this.accElettrica = accElettrica;
    }



}
