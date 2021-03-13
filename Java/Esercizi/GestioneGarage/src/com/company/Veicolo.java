package com.company;

//Costo auto = 3€/ora
//Costo moto = 2€/ora

public class Veicolo {
    
    protected int costo;
    protected int ore;
    protected int targa;
    
    public Veicolo(int orario, int id){
        this.targa = id;
        this.ore = orario;
    }
    
    public void calcolaCosto(){}
    
    public int getTarga(){
        return this.targa;
    }

}
