package com.company;

import java.util.Scanner;

public class Test {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        Circolo circolo = new Circolo(5); //Istanza della classe Circolo di nome circolo

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
                    circolo.aggiungiPart(new Partecipante(nome));   //richiamo il metodo aggiungiPart e creo un nuovo oggetto della classe Partecipante e gli passo come attributo del costruttore "nome"
                    System.out.print("Quante discipline pratica " + nome + ": ");
                    int n = scan.nextInt();
                    System.out.println("Nuoto\nGinnastica\nBodyBuilding");
                    for(int i = 0; i < n; i++){
                        sel = scan.next();      //Una volta aggiunto un partecipante chiedo all'utente quale disciplina vuole aggiungere attraverso un ciclo
                        circolo.getPartecipante()[circolo.getContPart()].aggiungiDisciplina(sel);   //seleziono il partecipante con indice uguale al contatore degli iscritti e richiamo la metodo aggiungiDisciplina
                        circolo.calcolaCosto(circolo.getPartecipante()[circolo.getContPart()]); //e dopo di che calcolo il costo della retta mensile richiamando il metodo calcolacosto() della classe circolo
                    }
                    System.out.println("Aggiunto correttamente");
                    break;
                case 2:
                    System.out.print("Inserire la disciplina: ");
                    sel = scan.next();
                    circolo.stampaLista(sel);   //richiamo la funzione stampaLista per stampare la lista di tutti i partecipanti ad una lista
                    break;
                case 3:
                    System.out.print("Inserisci il nome del partecipante di cui vuoi vedere la retta: ");
                    nome = scan.next();
                    System.out.print("La retta è di: " + circolo.vediRetta(nome));  //Richiamo del metodo vediRetta() della classe circolo per vedere la retta di un partecipante dato il nome
                    break;
                case 4:
                    System.out.print("Inserire il nome per verificare se è iscritto alla lista: ");
                    nome = scan.next();
                    System.out.print(circolo.trovaNome(nome)); //Controlla se è presente il nome nella lista degli iscritti al circolo, se non è iscritto verra stampato a video un messaggio
                    break;
            }
        }while(r != 0);
    }
}
