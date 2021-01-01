package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        Circolo circolo = new Circolo(5);

        int r;

        do{
            System.out.println("1. Aggiungi un nuovo partecipante\n" +
                               "2. Aggiungi una disciplina a un partecipante\n" +
                               "3. Vedi il costo della retta di un partecipante\n" +
                               "4. Controlla se un partecipante è iscritto al circolo");
            r = scan.nextInt();
            switch (r){
                case 1:
                    String nome;
                    System.out.print("Inserire il nome: ");
                    nome = scan.next();
                    circolo.aggiungiPart(new Partecipante(nome));
                    System.out.println("Aggiunto correttamente");
                    break;
                case 2:
                    //TODO: Aggiungi una disciplina a un singolo partecipnte
                    System.out.print("Selezionare a cui si vuole aggiungere una disciplina: ");
                    for(int i = 0; i < circolo.getContPart(); i++){
                        System.out.println(circolo.getPartecipante()[i].getNome());
                    }
                    nome = scan.next();
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
