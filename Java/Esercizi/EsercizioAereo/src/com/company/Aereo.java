package com.company;

public class Aereo {

    private String modello;
    private int id;
    private String compagniaAerea;

    public Aereo(String mod, int identificativo, String comp){
        this.modello = mod;
        this.id = identificativo;
        this.compagniaAerea = comp;
    }

    public Aereo(String mod, int identificativo){
        this.id = identificativo;
        this.modello = mod;
        this.compagniaAerea = null;
    }

    public String showInfo(){
        return "ID: " + this.id + "\nMODELLO: " + this.modello + "\nCOMPAGNIA AEREA: " + this.compagniaAerea + "\n";
    }

    public String getModello() {
        return modello;
    }

    public int getId() {
        return id;
    }

    public String getCompagniaAerea() {
        return compagniaAerea;
    }

    public void setCompagniaAerea(String compagniaAerea) {
        this.compagniaAerea = compagniaAerea;
    }
}
