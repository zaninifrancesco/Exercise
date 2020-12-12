package com.company;

public class Automobile {

    private Motore motore;
    private Contakilometri contakilometri;
    private Serbatoio serbatoio;


    public Automobile(Motore motore, Contakilometri ckm, Serbatoio serbatoio){
        this.motore = motore;
        this.contakilometri = ckm;
        this.serbatoio = serbatoio;
    }

    public void accendi(){
        motore.setStatus(true);
    }

    public void spegni(){
        motore.setStatus(false);
    }

    public boolean getStatus(){
        return motore.getStatus();
    }

    public void viaggia(float km){
        contakilometri.incrementa(km);
        float consumo = km / motore.getKmL();
        serbatoio.consuma(consumo);
    }

    public void rifornisciBenzina(float quantitaBenzina){
        serbatoio.rifornisci(quantitaBenzina);
    }

    public void faiPieno(){
        serbatoio.riempiSerbatoio();
    }

    public String stradaPercorsa(){
        return contakilometri.lettura();
    }
    public void setKm(float km){
        motore.setKmL(km);
    }
}
