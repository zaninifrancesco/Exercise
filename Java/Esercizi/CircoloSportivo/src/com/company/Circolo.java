package com.company;

public class Circolo {

    //Array di oggetti Partecipante di nome part
    private Partecipante[] part;
    private int contPart;

    //Costruttore in cui assegno la dimensione massima dell'array
    public Circolo(int nMax){
        part = new Partecipante[nMax];
    }

    //Metodo per aggiunge un nuovo partecipante all'array di partecipanti fino alla dimensione massima, aumentando il contatore
    public void aggiungiPart(Partecipante partec){
        if(contPart < part.length){
            part[contPart] = partec;
            contPart++;
        }
    }

    //Metodo per calcolare il costo da aggiungere alla retta mensile in base alla disciplina scelta
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

    //Metodo per vedere la retta di un singolo partecipante dato il nome
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

    public String trovaNome(String nome){      //Metodo per controllare se è presente un nome nella lista
        int i = 0;
        boolean trovato = false;
        String msg = "";
        while (!trovato || i <= contPart){  //ciclo while che viene eseguito finche non viene trovato il nome o finche non viene raggiunto il contatore dei partecipanti
            if(part[i].getNome().equals(nome)){
                trovato = true;
                msg = part[i].getNome() + " è iscritto al circolo";
            }
            else{
                msg = "Nome non trovato";
                i++;
            }
        }
        return msg; //messaggio di ritorno che puo variare se il partecipante è iscritto alla lista o no
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
