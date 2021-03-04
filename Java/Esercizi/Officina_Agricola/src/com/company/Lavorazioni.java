package com.company;

public class Lavorazioni {
    private String nomeLav;
    private float costoLav;

    public Lavorazioni(String tipoLavorazione, float costoLavorazione){
        this.costoLav = costoLavorazione;
        this.nomeLav = tipoLavorazione;
    }

    public float getCostoLav() {
        return costoLav;
    }
}
