/*
Classe ListaSpesa contenente due array di oggetti, Alimentari[] e NonAlimentari[], in cui andranno inseriti
tutti i prodotti
La classe dispone anche di due contatori per contari il numero di prodotti alimentari e non inseriti
Dispone di diversi metodo per la gestione dei singoli attributi
 */
package com.company;

public class ListaSpesa {
    private Alimentari[] alimentari;    //Dichiarazione dei due array
    private NonAlimentari[] nonAlimentari;
    private int contAlim, contNonAlim = 0;

    public ListaSpesa(int maxProd){
        alimentari = new Alimentari[maxProd];   //Inizializzazione degli array data la dimensione max
        nonAlimentari = new NonAlimentari[maxProd];
    }

    public void aggiungiProd(Alimentari alim){
        if(contAlim <= alimentari.length){  //Metodo per aggiungere prodotti Alimentari se è disponibile spazio nell'array
            alimentari[contAlim] = alim;
            contAlim++;     //aumento contatore ogni volta che viene inserito un prodotto
        }
    }

    public void aggiungiProd(NonAlimentari nonAlim){
        if(contNonAlim <= nonAlimentari.length){
            nonAlimentari[contNonAlim] = nonAlim;   //Stesso metodo pero con parametri differenti
            contNonAlim++;
        }
    }



    public Alimentari[] getAlimentari() {
        return alimentari;
    }

    public NonAlimentari[] getNonAlimentari() {
        return nonAlimentari;
    }

    public int getContAlim() {
        return contAlim;
    }

    public int getContNonAlim() {
        return contNonAlim;
    }


    public String vediLista(){
        String msg = "";

        if(contAlim > 0) {  //Controlla se il contatore alimentare è maggiore di 0 cosi da stampare tutti i prodotti
            msg += "Prodotti alimentari: \n";
            for (int i = 0; i < contAlim; i++) {
                msg += alimentari[i].info() + "\n";
            }
        }
        else{
            msg += "Nessun prodotto alimentare\n";
        }

        if(contNonAlim > 0) {
            msg += "Prodotti non alimentari: \n";
            for (int i = 0; i < contNonAlim; i++) {
                msg += nonAlimentari[i].info() + "\n";
            }
        }
        else{
            msg += "Nessun prodotto non alimentare\n";
        }

        return msg;
    }

    public float costoTot(){
        float costoTot = 0;     //Metodo per calcolare il costo totale della lista sommando i costi dei rispettivi array

        for(int i = 0; i < contAlim; i++){
            costoTot += alimentari[i].getPrezzo();
        }
        for(int i = 0; i < contNonAlim; i++){
            costoTot += nonAlimentari[i].getPrezzo();
        }

        return costoTot;
    }

}
