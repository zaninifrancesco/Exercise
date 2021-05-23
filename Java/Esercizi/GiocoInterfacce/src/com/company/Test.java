package com.company;


import java.util.Scanner;

public class Test {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int x;
        boolean luna;

        do {
            System.out.println("Inizialmente il licantropo è umano o mostro? 1)Umano 2)Mostro ");
            x = scanner.nextInt();
        } while (x != 1 && x != 2);

        Eroe eroe = new Eroe();
        Vampiro vampiro = new Vampiro();

        if (x == 1) {
            luna = true;
        } else {
            luna = false;
        }

        Licantropo licantropo = new Licantropo(luna);

        do {
            System.out.println("Cosa vuoi fare?\n1 -> Fai attaccare il vampiro \n2 -> Fai attaccare l'eroe\n3 -> Fai attaccare il licantropo\n4 -> Vedi chi ha piu' forza\n0. Esci");
            x = scanner.nextInt();
            switch (x) {
                case 1:
                    if (vampiro.getForza() <= 2) {
                        System.out.println("Forza non sufficiente, impossibile attaccare");
                    } else {
                        vampiro.azzanna();
                    }
                    break;
                case 2:
                    if (eroe.getForza() <= 3) {
                        System.out.println("Forza non sufficiente, impossibile attaccare");
                    } else {
                        eroe.combatti();
                    }
                    break;
                case 3:
                    if (licantropo.getForza() <= 2) {
                        System.out.println("Forza non sufficiente, impossibile attaccare");
                    } else {
                        licantropo.azzanna();
                    }
                    break;
                case 4:
                    System.out.println("La forza del licantropo corrisponde a -> " + licantropo.getForza() + "\nLa forza del vampiro corrisponde a -> " + vampiro.getForza() + "\nLa forza dell'eroe corrisponde a -> " + eroe.getForza());
                    break;
            }
        } while (x != 0);
    }
}
