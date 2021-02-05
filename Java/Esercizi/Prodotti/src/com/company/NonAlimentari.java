package com.company;

public class NonAlimentari extends Prodotto {

    private String materiale;

    public NonAlimentari(String descr, float price, String mat){
        super(descr, price);
        this.materiale = mat;
    }


    public String getMateriale() {
        return this.materiale;
    }

    public void applicaScontx(){
        int perc = 5;
        if(materiale.equals("carta") || materiale.equals("vetro") || materiale.equals("plastica")){
            perc = 10;
        }
        super.applicaSconto(perc);
    }

}
