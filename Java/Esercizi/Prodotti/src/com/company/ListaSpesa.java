package com.company;

public class ListaSpesa {

    private Prodotto[] prodotto;
    private float CostoTot;
    private boolean tesseraFedelta;
    private int contProd;

    public ListaSpesa(int maxProd, boolean haCarta){
        this.tesseraFedelta = haCarta;
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
}
