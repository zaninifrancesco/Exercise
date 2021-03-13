package com.company;

public class Motociclo extends Veicolo{
    
    public Motociclo(int orario, int id){
        super(orario, id);
    }
    
    public void calcolaCosto(){
        float costoOra = 2;

        if(this.ore >= 24){
            costoOra = 20;
            this.costo += costoOra;
        }
        this.costo += costoOra * this.ore;
    }
    
}
