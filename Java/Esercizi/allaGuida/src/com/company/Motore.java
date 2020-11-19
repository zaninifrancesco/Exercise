package com.company;

public class Motore {
    private float consumo;


    public void calcolaConsumo(float km, float litri){
        this.consumo = km / litri;
    }


    public float getConsumo() {

        return consumo;
    }

    public void setConsumo(float consumo){
        this.consumo = consumo;
    }
}
