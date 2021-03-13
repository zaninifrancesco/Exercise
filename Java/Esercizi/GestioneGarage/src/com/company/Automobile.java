package com.company;

public class Automobile extends Veicolo{
        
    public Automobile(int orario, int id){
        super(orario, id);
    }
    
    public void calcolaCosto(){
        float costoOra = 3;

        if(this.ore >= 24){
            costoOra = 20;
            this.costo += costoOra;
        }
        this.costo += costoOra * this.ore;

    }
    
}
