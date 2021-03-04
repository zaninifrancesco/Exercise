package com.company;

public class Officina {
    private int nPosti;
    private int cont;
    private Attrezzatura[] attrezzi;
    private boolean ePieno;
    private float costoTot;

    public Officina(int nPosti){
        this.nPosti = nPosti;
        attrezzi = new Attrezzatura[nPosti];
        cont = 0;
        ePieno = false;
        costoTot = 0;
    }

    public int getnPosti() {
        return nPosti;
    }

    public void aggiungiMacchinario(Attrezzatura attr){
        if(cont < nPosti){
            attrezzi[cont] = attr;
            costoTot += attr.costoRiparazione;
            cont++;
        }
        else {
            ePieno = true;
        }
    }

    public boolean isPieno() {
        return ePieno;
    }

    public float getCostoTot() {
        return costoTot;
    }

    public void vediLista(){
        if(cont != 0){
            for(int i = 0; i < nPosti; i++){
                System.out.println(
                        "numeroLavorazione: " + attrezzi[i].nOrdine + "\n" +
                                "Costo Riparazione: " + attrezzi[i].costoRiparazione + "\n" +
                                "Marca: " + attrezzi[i].marca
                );
            }
        }
        else {
            System.out.println("Nessuna macchina nella lista");
        }

    }

    public Attrezzatura[] getAttrezzi(){
        return this.attrezzi;
    }

    public void ritiraMacchina(int id){
        boolean trovato = false;
        int i;
        int trv = 0;
        for(i = 0; i < nPosti; i++){
            if(attrezzi[i].nOrdine == id){
                trovato = true;
                for(int l = 0; l < nPosti - 1; l++){
                    attrezzi[l].listaLavorazioni = attrezzi[l + 1].listaLavorazioni;
                    attrezzi[l].contLav = attrezzi[l + 1].contLav;
                    attrezzi[l].costoRiparazione = attrezzi[l + 1].costoRiparazione;
                    attrezzi[l].marca = attrezzi[l + 1].marca;
                    attrezzi[l].nOrdine = attrezzi[l + 1].nOrdine;
                }
                nPosti--;
            }
        }
    }

    public int getCont(){
        return cont;
    }

    public int trovaVeicolo(int id){
        int i, x = 0;
        for(i = 0; i < nPosti; i++){
            if(attrezzi[i].nOrdine == id){
                 x = i;
            }
        }
        return x;
    }


}
