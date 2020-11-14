package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String modello;
        int id;
        String compagniaAerea;
        String localita;
        String data;

        System.out.print("Inserire la data del biglietto: ");
        data = scan.next();
        System.out.print("Inserire la localita: ");
        localita = scan.next();
        System.out.print("Insierisci il modello dell'aereo: ");
        modello = scan.next();
        System.out.print("Inserisci l'id dell'aereo : ");
        id = scan.nextInt();


        Aereo aereo1 = new Aereo(modello, id);

        System.out.print("Inserisci la compagnia dell'aereo: ");
        compagniaAerea = scan.next();
        aereo1.setCompagniaAerea(compagniaAerea);

        Biglietto biglietto1 = new Biglietto(localita, data);

        biglietto1.setAereo(aereo1);


        Biglietto biglietto2 = new Biglietto(localita, data, aereo1);
        Biglietto bigliettocopia2 = new Biglietto(biglietto2.getLocalita(), biglietto2.getData(), biglietto2.getAereo());

        System.out.println("-----BIGLIETTO 2-----" + "\n" + biglietto2.showInfo());
        System.out.println("-----BIGLIETTO COPIA2-----" + "\n" + bigliettocopia2.showInfo());

        System.out.print("Inserisci la compagnia dell'aereo " + bigliettocopia2.getAereo().getId() + ": ");
        compagniaAerea = scan.next();
        bigliettocopia2.getAereo().setCompagniaAerea(compagniaAerea);

        System.out.println("-----BIGLIETTO 2-----" + "\n" + biglietto2.showInfo());
        System.out.println("-----BIGLIETTO COPIA2-----" + "\n" + bigliettocopia2.showInfo());



    }
}
