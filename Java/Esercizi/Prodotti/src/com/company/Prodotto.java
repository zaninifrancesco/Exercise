/*
SuperClasse Prodotto, contiene gli attrivuti e i metodi comuni

 */


package com.company;

public class Prodotto {
    protected String descrizione;   //Tutti gli attributi sono protected perchè devo essere visti solo dalle clasi nel package
    protected float prezzo;

    public Prodotto(String descr, float price){
        this.descrizione = descr;
        this.prezzo = price;
    }


    public void applicaSconto(float perc){
        this.prezzo -= (perc / 100) * this.prezzo;  //Formula per calcolare uno sconto in base ad una percentuale nei parametri
    }

    public String info(){
        String msg = "";
        msg += "Descrizione Prodotto: " + descrizione + "\n";
        msg += "Prezzo: " + prezzo + "\n";      //Metodo per mostrare le informazioni
        return msg;
    }

    public float getPrezzo() {
        return prezzo;
    }
}
