package com.company;
//se è rosso toglie soldi ogni mese se è verde aggiunge soldi | a dic toglie soldi spese di gest
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String name = "name";
        int numAccount = 0;
        int amount = 0;
        int n;
        int mese;
        int percInt = 5;
        int costoGest = 500;

        do {
            System.out.print("In che mese ti trovi: ");
            mese = scanner.nextInt();
            if(mese < 0){
                System.out.println("Il mese non puo essere minore di 1");
            }
        }while (mese < 1 || mese > 12);

        System.out.println("----------CONTO NUMERO 1-----");
        System.out.print("Inserisci il nome: ");
        name = scanner.next();
        System.out.print("Inserisci il numero dell'account: ");
        numAccount = scanner.nextInt();
        System.out.print("Inseirsci il saldo attuale: ");
        amount = scanner.nextInt();
        Account conto1 = new Account(name, numAccount, amount);

        System.out.println("----------CONTO NUMERO 2-----");
        System.out.print("Inserisci il nome: ");
        name = scanner.next();
        System.out.print("Inserisci il numero dell'account: ");
        numAccount = scanner.nextInt();
        System.out.print("Inseirsci il saldo attuale: ");
        amount = scanner.nextInt();
        Account conto2 = new Account(name, numAccount, amount);

        do {
            System.out.println("Selezione l'account su cui operare\n1. " + conto1.getNumAccount() + "\n2. " + conto2.getNumAccount() + "\n0. FINE");
            n = scanner.nextInt();

            switch (n) {
                case 1:
                    operation(conto1, mese, percInt, costoGest);
                    break;
                case 2:
                    operation(conto2, mese, percInt, costoGest);
                    break;
            }
        }while (n != 0);
    }

    public static void operation(Account conto, int mese, int perc, int costoGest){
        int r;
        do {
            System.out.println("Cosa vuoi fare? \n1. Saldo\n2. Preleva\n3. Deposita\n4. Show Info\n5. Aumenta di mese\n0. Exit");
            r = scanner.nextInt();
            switch (r){
                case 1:
                    System.out.println("SALDO ATTUALE: " + conto.getAmount());
                    break;
                case 2:
                    int x = scanner.nextInt();
                    conto.prelieva(x);
                    break;
                case 3:
                    conto.deposita(scanner.nextInt());
                    break;
                case 4:
                    conto.showAccountInfo();
                    break;
                case 5:
                    mese += 1;
                    conto.interessi(perc);

                    if(mese == 12){
                        conto.contiGest(costoGest);
                        System.out.println("HAI PAGATO IL COSTO PER LA GESTIONE DEL CONTO = " + costoGest);
                        mese = 1;
                    }
                    break;
            }
        }while (r != 0);
    }
}
