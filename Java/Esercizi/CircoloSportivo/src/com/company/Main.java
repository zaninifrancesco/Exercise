package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Circolo circolo = new Circolo(5);
        Partecipante persona = new Partecipante("Francesco");
        Partecipante persona1 = new Partecipante("Alessio");

        int r;

        do{
            System.out.println("1. Aggiungi un nuovo partecipante\n" +
                               "2. Aggiungi una disciplina a un partecipante\n" +
                               "3. Vedi il costo della retta di un partecipante\n" +
                               "4. Controlla se un partecipante è iscritto al circolo");
            r = scan.nextInt();
            switch (r){
                case 1:
                    //TODO: Aggiungi un partecipante
                    break;
                case 2:
                    //TODO: Aggiungi una disciplina a un singolo partecipnte
                    break;
                case 3:
                    //TODO: Costo retta singolo part
                    break;
                case 4:
                    //TODO: Controlla se un partecipante è iscritto
                    break;
            }
        }while(r != 0);
    }
}
