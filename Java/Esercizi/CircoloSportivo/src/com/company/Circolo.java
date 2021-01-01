package com.company;

public class Circolo {

    private Partecipante[] part;
    private int contPart;

    public Circolo(int nMax){
        part = new Partecipante[nMax];
    }

    public void aggiungiPart(Partecipante partec){
        if(contPart < part.length){
            part[contPart] = partec;
            contPart++;
        }
    }

    public void calcolaCosto(Partecipante partec){
        for(int i = 0; i < 3; i++){
            switch (partec.getDiscipline()[i]) {
                case "nuoto" -> partec.setRettaMensile(20);
                case "ginnastica" -> partec.setRettaMensile(40);
                case "bodybuilding" -> partec.setRettaMensile(50);
            }
        }
    }

    public Partecipante[] getPartecipante(){
        return part;
    }

    public int getContPart() {
        return this.contPart;
    }

    public int vediRetta(String nome){
        int i = 0;
        boolean trovato = false;
        int retta = 0;
        while (!trovato || i <= contPart){
            if(part[i].getNome().equals(nome)){
                trovato = true;
                retta = part[i].getRettaMensile();
            }
            else{
                i++;
            }
        }
        return retta;
    }

    public String trovaNome(String nome){
        int i = 0;
        boolean trovato = false;
        String msg = "";
        while (!trovato || i <= contPart){
            if(part[i].getNome().equals(nome)){
                trovato = true;
                msg = part[i].getNome() + " è iscritto al circolo";
            }
            else{
                msg = "Nome non trovato";
                i++;
            }
        }
        return msg;
    }

    public void stampaLista(String sport){
        for(int i = 0; i < contPart; i++) {
            for (int j = 0; j < 3; j++) {
                if (part[i].getDiscipline()[j].equals(sport)){
                    System.out.println("Nome: " + part[i].getNome() + "\n");
                }
            }
        }
    }
}
