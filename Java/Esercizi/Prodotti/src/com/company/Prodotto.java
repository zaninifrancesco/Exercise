package com.company;

public class Prodotto {
    private int barCode;
    private String descrizione;
    private float prezzo;

    public Prodotto(int codice, String descr, float price){
        this.barCode = codice;
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

    public void applicaSconto(int perc){
        this.prezzo -= (perc / 100) * this.prezzo;
    }

}
