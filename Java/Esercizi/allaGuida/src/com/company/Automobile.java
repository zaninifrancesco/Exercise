package com.company;

public class Automobile {

    private Motore motore;
    private Contakilometri contakilometri;
    private Automobile auto;
    private Serbatoio serbatoio;
    private Boolean isOn = false;

    public void setConsumo(float consumo){
        motore.setConsumo(consumo);
    }

    public void riempiBenzina(){
        serbatoio.riempiSerbatoio();
    }

    public void accendere(){
        this.isOn = true;
    }
    public void viaggia(int km){
        contakilometri.incrementa(km);

    }

}
