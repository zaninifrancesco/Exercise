package com.company;

public class Alimentari extends Prodotto {

    private Data dataScadenza;

    public Alimentari(String descr, float price, Data dataScad){
        super(descr, price);
        this.dataScadenza = dataScad;
    }

    public Data getDataScadenza() {
        return this.dataScadenza;
    }

    public void applicaScontx(Data dataAttuale){
        int perc = 5;

        if(dataScadenza.getDifference(dataAttuale) <= 10){
            perc = 20;
        }

        super.applicaSconto(perc);

    }

}
