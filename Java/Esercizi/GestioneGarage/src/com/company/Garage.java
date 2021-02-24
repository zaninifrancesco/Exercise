package com.company;

public class Garage {
    private int nPosti = 0;
    private boolean ePieno;
    private Veicolo[] veicoli;
    
    public Garage(int num){
        veicoli = new Veicolo[num];
    }
    
    public void aggiungiVeicolo(Veicolo veicolo){
        if(nPosti < veicoli.length){
            veicoli[nPosti] = veicolo;
            nPosti++;
        }
        else{
            ePieno = true;
        }
    }
    
    public void ritiraVeicolo(int id){
        boolean trovato = false;
        int j = 0;
        for(int i = 0; i < nPosti; i++){
            if(veicoli[i].getId() == id){
                veicoli[i].calcolaCosto();
                trovato = true;
                j = i;
            }
        }
        if(trovato){
            for(int i = j; i < nPosti - 1; i++){
                veicoli[i].costo = veicoli[i + 1].costo;
                veicoli[i].id = veicoli[i + 1].id;
                veicoli[i].ore = veicoli[i + 1].ore;
            }
            nPosti--;
        }
    }

    public int trovaVeicolo(int id){
        boolean trovato = false;
        int i;
        for(i = 0; i < nPosti; i++){
            if(veicoli[i].getId() == id){
                trovato = true;
            }
        }
        return i;
    }
    
    public Veicolo[] getVeicoli(){
        return this.veicoli;
    }

    public void showInfo(){
        if(nPosti != 0){
            for(int i = 0; i < nPosti; i++){
                System.out.println("Costo Veicolo: "veicoli[i].costo + " Id: " + veicoli[i].id);
            }
        }
        else{
            System.out.println("Non ci sono veicoli");
        }
    }

    public boolean isePieno() {
        return ePieno;
    }

    public int getnPosti(){
        return this.nPosti;
    }
}
