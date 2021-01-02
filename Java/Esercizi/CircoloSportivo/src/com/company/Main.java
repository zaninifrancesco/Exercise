package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        Circolo circolo = new Circolo(5);

        int r;

        do{
            System.out.println("1. Aggiungi un nuovo partecipante\n" +
                               "2. Vedi tutti gli iscritti al circolo ad una certa disciplina\n" +
                               "3. Vedi il costo della retta di un partecipante\n" +
                               "4. Controlla se un partecipante è iscritto al circolo");
            r = scan.nextInt();
            switch (r){
                case 1:
                    String nome, sel;
                    System.out.print("Inserire il nome: ");
                    nome = scan.next();
                    circolo.aggiungiPart(new Partecipante(nome));
                    System.out.print("Quante discipline pratica " + nome + ": ");
                    int n = scan.nextInt();
                    System.out.println("Nuoto\nGinnastica\nBodyBuilding");
                    for(int i = 0; i < n; i++){
                        sel = scan.next();
                        circolo.getPartecipante()[circolo.getContPart()].aggiungiDisciplina(sel);
                        circolo.calcolaCosto(circolo.getPartecipante()[circolo.getContPart()]);
                    }
                    System.out.println("Aggiunto correttamente");
                    break;
                case 2:
                    System.out.print("Inserire la disciplina: ");
                    sel = scan.next();
                    circolo.stampaLista(sel);
                    break;
                case 3:
                    System.out.print("Inserisci il nome del partecipante di cui vuoi vedere la retta: ");
                    nome = scan.next();
                    System.out.print("La retta è di: " + circolo.vediRetta(nome));
                    break;
                case 4:
                    System.out.print("Inserire il nome per verificare se è iscritto alla lista: ");
                    nome = scan.next();
                    System.out.print(circolo.trovaNome(nome));
                    break;
            }
        }while(r != 0);
    }
}
