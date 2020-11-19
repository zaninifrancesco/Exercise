package com.company;

public class Serbatoio {
    private float fuelAmount;
    private float max = 100;
    public Serbatoio(float fuelQuantity){
        this.fuelAmount = fuelQuantity;
    }


    public void consuma(float amount){
        if(amount >= this.fuelAmount){
            this.fuelAmount = 0;
        }
        else{
            this.fuelAmount -= amount;
        }
    }

    public void rifornisci(float amount){
        if(amount >= max){
            this.fuelAmount = max;
        }
        else {
            this.fuelAmount += amount;
        }
    }

    public void riempiSerbatoio(){
        this.fuelAmount = max;
    }

}
