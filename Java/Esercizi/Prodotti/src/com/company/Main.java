package com.company;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ListaSpesa lista = new ListaSpesa(5);
        int r = 0;

        System.out.println("Hai la carta fedelta?\n1. Si\n2. No");
        int d = scan.nextInt();

        if(d == 1){
            lista.setTesseraFedelta(true);
        }
        else {
            lista.setTesseraFedelta(false);
        }

        do{

            System.out.println("""
                    Cosa vuoi fare?
                    1. Aggiungi un prodotto alimentare
                    2. Aggiungi un prodotto non alimentare
                    3. Vedi la lista della spesa""");

            r = scan.nextInt();

            switch (r){
                case 1:
                    System.out.println("Descrizione prodotto: ");
                    String descr = scan.next();
                    System.out.println("Prezzo " + descr + ": ");
                    float prezzo = scan.nextFloat();
                    System.out.println("Data scadenza, GG/MM/YY");
                    int g = scan.nextInt();
                    int m = scan.nextInt();
                    int y = scan.nextInt();
                    Data data = new Data(g, m, y);
                    lista.aggiungiProd(new Alimentari(descr, prezzo, data));
                    System.out.println("Prodotto alimentare aggiunto correttamente!");

                    if(lista.isTesseraFedelta()){
                        lista.getAlimentari()[lista.getContProd()].applicaScontx(data);
                    }
                    break;

                case 2:
                    System.out.println("Descrizione prodotto: ");
                    descr = scan.next();
                    System.out.println("Prezzo " + descr + ": ");
                    prezzo = scan.nextFloat();
                    System.out.println("Materiale: ");
                    String mat = scan.next();
                    lista.aggiungiProd(new NonAlimentari(descr, prezzo, mat));
                    System.out.println("Prodotto non alimentare aggiunto correttamente!");

                    if(lista.isTesseraFedelta()){
                        lista.getNonAlimentari()[lista.getContProd()].applicaScontx();
                    }
                    break;
                case 3:
                    if(lista.getContProd() == 0){
                        System.out.println("Non ci sono prodotti nella lista");
                    }
                    else{
                        lista.vediLista();
                    }
                    break;
            }



        }while (r != 0);

    }
}
