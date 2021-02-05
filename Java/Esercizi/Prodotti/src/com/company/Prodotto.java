package com.company;

public class Prodotto {
    protected int barCode;
    protected String descrizione;
    protected float prezzo;

    public Prodotto(String descr, float price){
        //this.barCode = codice;
        this.descrizione = descr;
        this.prezzo = price;
    }


    public int getBarCode() {
        return this.barCode;
    }

    public String getDescrizione() {
        return this.descrizione;
    }

    public float getPrezzo() {
        return this.prezzo;
    }

    public void applicaSconto(float perc){
        this.prezzo -= (perc / 100) * this.prezzo;
    }

}
