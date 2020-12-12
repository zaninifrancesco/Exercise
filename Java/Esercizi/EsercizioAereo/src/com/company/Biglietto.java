package com.company;

public class Biglietto {

    private String localita;
    private String data;
    private Aereo aereo;

    public Biglietto(String location, String date, Aereo airplane){
        this.aereo = airplane;
        this.data = date;
        this.localita = location;
    }

    public Biglietto(String location, String date){
        this.localita = location;
        this.data = date;
        this.aereo = null;
    }

    public String showInfo(){
        String mess = "LOCALITA: " + this.localita + "\nDATA: " + this.data + "\nAEREO: " + aereo.getId();
        if(aereo.getCompagniaAerea() != null){
            mess += "\nCompagnia: " + aereo.getCompagniaAerea();
        }
        return mess;
    }

    public String getLocalita() {
        return localita;
    }

    public String getData() {
        return data;
    }

    public Aereo getAereo() {
        return aereo;
    }

    public void setAereo(Aereo aereo) {
        this.aereo = aereo;
    }
}
