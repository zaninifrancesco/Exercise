package com.company;

import java.util.Arrays;

public class ListaSpesa {

    private Prodotto[] prodotto;
    private Alimentari[] alimentari;
    private NonAlimentari[] nonAlimentari;
    private float CostoTot;
    private boolean tesseraFedelta;
    private int contProd;

    public ListaSpesa(int maxProd){
        alimentari = new Alimentari[maxProd];
        nonAlimentari = new NonAlimentari[maxProd];
        prodotto = new Prodotto[maxProd];
    }

    public void aggiungiProd(Prodotto prod){
        if(contProd < prodotto.length){
            prodotto[contProd] = prod;
            contProd++;
        }
    }

    public int getContProd() {
        return this.contProd;
    }

    public boolean isTesseraFedelta() {
        return this.tesseraFedelta;
    }

    public void setTesseraFedelta(boolean tesseraFedelta) {
        this.tesseraFedelta = tesseraFedelta;
    }

    public Prodotto[] getProdotto(){
        return prodotto;
    }

    public Alimentari[] getAlimentari() {
        return alimentari;
    }

    public NonAlimentari[] getNonAlimentari() {
        return nonAlimentari;
    }

    public void vediLista(){
        for(int i = 0; i < contProd; i++){
            System.out.println("Descrizione prodotto: " + prodotto[i].getDescrizione() + "\n" +
                    "Prezzo prodotto: " + prodotto[i].getPrezzo());
        }
    }
}
