package com.company;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String name = "name";
        int numAccount = 0;
        int amount = 0;

        int n;

        System.out.println("----------CONTO NUMERO 1-----");
        load(name, numAccount, amount);
        Account conto1 = new Account(name, numAccount, amount);

        System.out.println("----------CONTO NUMERO 2-----");
        load(name, numAccount, amount);
        Account conto2 = new Account(name, numAccount, amount);

        do {
            System.out.println("Selezione l'account su cui operare\n1. " + conto1.getNumAccount() + "\n2. " + conto2.getNumAccount() + "\n0. FINE");
            n = scanner.nextInt();

            switch (n) {
                case 1:
                    operation(conto1);
                    break;
                case 2:
                    operation(conto2);
                    break;
            }
        }while (n != 0);
    }

    public static void load(String name, int numAccount, int amount){
        System.out.print("Inserisci il nome: ");
        name = scanner.next();
        System.out.print("Inserisci il numero dell'account: ");
        numAccount = scanner.nextInt();
        System.out.print("Inseirsci il saldo attuale: ");
        amount = scanner.nextInt();
    }

    public static void operation(Account conto){
        int r;
        do {
            System.out.println("Cosa vuoi fare? \n1. Saldo\n2. Preleva\n3. Deposita\n4. Show Info\n0. Exit");
            r = scanner.nextInt();
            switch (r){
                case 1:
                    System.out.println("SALDO ATTUALE: " + conto.getAmount());
                    break;
                case 2:
                    int x = scanner.nextInt();
                    if(x > conto.getAmount()){
                        System.out.println("You don't have enough money to withdrawn");
                    }else {
                        conto.prelieva(x);
                    }
                    break;
                case 3:
                    conto.deposita(scanner.nextInt());
                    break;
                case 4:
                    conto.showAccountInfo();
                    break;
            }
        }while (r != 0);

    }
}
