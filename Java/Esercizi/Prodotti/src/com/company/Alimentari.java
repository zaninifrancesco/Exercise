package com.company;

public class Alimentari extends Prodotto {      //Parola chiave Extends per indicare il fatto che sia una sottoclasse

    private Data dataScadenza;      //Istanza della classe Data.java per indicare la data di scadenza

    public Alimentari(String descr, float price, Data dataScad){
        super(descr, price);        //Uso la parola chiave super per andare a inizializzare gli attributi nella superclasse
        this.dataScadenza = dataScad;
    }


    public void applicaScontx(Data dataOggi){
        float perc = 5;     //Inizialmente lo sconto base è del 5% però se la differenza tra la data di scadenza
                            //e la data attuale è minore di 10 diventa il 20%

        if(dataScadenza.getDifference(dataOggi) <= 10){
            perc = 20;
        }
        super.applicaSconto(perc);  //Richiamo il metodo nella superclasse attraverso la parola chiave super passando come
                                    //parametro la percentuale
    }

}
