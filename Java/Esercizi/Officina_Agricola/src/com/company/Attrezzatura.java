package com.company;

public class Attrezzatura {

    protected int nOrdine;
    protected String marca;
    protected float costoRiparazione;
    protected Lavorazioni listaLavorazioni[];
    protected int contLav;

    public Attrezzatura(int nOrdine, String marca, int nLavorazioni){
        this.marca = marca;
        this.nOrdine = nOrdine;
        listaLavorazioni = new Lavorazioni[nLavorazioni];
        contLav = 0;
    }

    public void aggiungiLavorazione(Lavorazioni lav){
        if(contLav < listaLavorazioni.length){
            listaLavorazioni[contLav] = lav;
            costoRiparazione += listaLavorazioni[contLav].getCostoLav();
            contLav++;
        }
    }



}
