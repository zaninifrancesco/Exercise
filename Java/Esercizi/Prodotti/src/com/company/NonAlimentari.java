package com.company;

public class NonAlimentari extends Prodotto {   //Classe NonAlimentari che estende la superclasse Prodotto

    private String materiale;

    public NonAlimentari(String descr, float price, String mat){
        super(descr, price);
        this.materiale = mat;
    }


    public String getMateriale() {
        return this.materiale;
    }

    public void applicaScontx(){
        float perc = 5;
        if(materiale.equals("carta") || materiale.equals("vetro") || materiale.equals("plastica")){
            perc = 10;  //Sconto applicato in base al tipo di materiale del prodotto, se è dei seguenti prodotti la percentuale diventa del 10%
        }
        super.applicaSconto(perc);  //richiamo del metodo della superclasse
    }

}
