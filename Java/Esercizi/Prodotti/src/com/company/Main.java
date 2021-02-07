/*
Per questo programma ho deciso di utilizzare una Super Classe di nome Prodotto.java
Questa superclasse comprende i metodi e gli attributi comuni come possono essere il prezzo
e una descrizione. Dopodichè ho creato due sottoclassi: Alimentari.java e NonAlimentari.java
Queste sottoclassi estendono la superclasse prodotto in quanto devono soltato aggiungere determinati
metodi e attributi mentre il loro comportamento principale è comune in tutti e due.
Ho creato la classe ListaSpesa.java che comprende due array di oggetti, rispettivamente Alimentari[]
e NonAlimentari[] con i relativi metodi aggiungi e get.
 */


package com.company;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        ListaSpesa lista = new ListaSpesa(5);   //Istanza della classe ListaSpesa
        int r = 0;

        System.out.println("Hai la carta fedelta?\n1. Si\n2. No");
        int d = scan.nextInt();     //Controlla se il cliente ha la tessera fedeltà per applicare tutti gli sconti



        System.out.println("Inserisci la data di oggi: ");
        int g = scan.nextInt();
        int m = scan.nextInt();         //Inserimento data per controllare la data di scadenza e applicare gli sconti
        int y = scan.nextInt();

        Data dataOggi = new Data(g, m, y);  //Istanza della classe Data che indica la data odierna


        do{

            System.out.println("""
                    Cosa vuoi fare?
                    1. Aggiungi un prodotto alimentare
                    2. Aggiungi un prodotto non alimentare     
                    3. Vedi la lista della spesa
                    4. Vedi il costo totale
                    0. Esci""");        //Menu di scelta

            r = scan.nextInt();

            switch (r){
                case 1:
                    System.out.println("Descrizione prodotto: ");
                    String descr = scan.next();
                    System.out.println("Prezzo " + descr + ": ");
                    float prezzo = scan.nextFloat();
                    System.out.println("Data scadenza, GG/MM/YY");
                    g = scan.nextInt();
                    m = scan.nextInt();
                    y = scan.nextInt();             //Varaibili di appoggio per istanziare l'oggetto data di scadenza
                    Data data = new Data(g, m, y);
                    lista.aggiungiProd(new Alimentari(descr, prezzo, data));        //Richiamo il metodo per aggiungere un prodotto
                    System.out.println("Prodotto alimentare aggiunto correttamente!");

                    if(d == 1){  //Controllo per vedere se ha la tessera per applicare gli sconti
                        lista.getAlimentari()[lista.getContAlim() - 1].applicaScontx(dataOggi); //Applica lo sconto dell'ultimo prodotto aggiunto

                    }
                    break;

                case 2:
                    System.out.println("Descrizione prodotto: ");
                    descr = scan.next();
                    System.out.println("Prezzo " + descr + ": ");
                    prezzo = scan.nextFloat();
                    System.out.println("Materiale: ");
                    String mat = scan.next();
                    lista.aggiungiProd(new NonAlimentari(descr, prezzo, mat));  //metodo per aggiungere un prodotto non alimentare
                    System.out.println("Prodotto non alimentare aggiunto correttamente!");

                    if(d == 1){
                        lista.getNonAlimentari()[lista.getContNonAlim() - 1].applicaScontx();
                    }
                    break;

                case 3:
                    System.out.println(lista.vediLista());  //Metodo per vedere tutti i prodotti messi nella lista
                    break;
                case 4:
                    System.out.println(lista.costoTot());
                    break;
            }

        }while (r != 0);
    }
}
