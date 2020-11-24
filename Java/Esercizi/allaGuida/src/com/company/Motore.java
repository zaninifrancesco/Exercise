package com.company;

public class Motore {
    private float kmL;
    private boolean status;

    public Motore(float km){
        this.kmL = km;
        this.status = false;
    }

    public float getKmL() {
        return kmL;
    }

    public void setKmL(float kmsulitro){
        this.kmL = kmsulitro;
    }

    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean newStatus){
        this.status = newStatus;
    }

}
