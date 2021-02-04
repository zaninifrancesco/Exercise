package com.company;

public class Alimentari extends Prodotto {

    private Data dataScadenza;

    public Alimentari(int codice, String descr, float price, int giorno, int mese, int anno){
        super(codice, descr, price);
        dataScadenza = new Data(giorno, mese, anno);
    }

    public Data getDataScadenza() {
        return this.dataScadenza;
    }

    public void applicaSconto(Data dataAttuale){
        int perc = 5;
        if(dataScadenza.getDifference(dataAttuale) <= 10){
            perc = 20;
        }

        super.applicaSconto(perc);

    }

}
