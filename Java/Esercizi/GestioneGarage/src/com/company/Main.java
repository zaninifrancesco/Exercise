package com.company;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Garage g = new Garage(5);
        int r;

        System.out.println("Quanti soldi hai? ");
        float soldi = scan.nextFloat();

        do{
            System.out.println("1. Aggiungi una Moto\n" +
                    "2. Aggiungi una auto\n" +
                    "3. Ritira un veicolo\n" +
                    "4. Vedi la lista del garage\n" +
                    "5. Vedi quanti soldi hai\n" +
                    "6. Esci");
            r = scan.nextInt();

            switch (r){
                case 1:
                    System.out.println("Id: ");
                    int id = scan.nextInt();
                    System.out.println("Quante ore si deve stare nel parcheggio: ");
                    int orario = scan.nextInt();
                    if(g.isePieno()){
                        System.out.println("Garage pieno");
                    }
                    else {
                        g.aggiungiVeicolo(new Motociclo(orario, id));
                        g.getVeicoli()[g.getnPosti() - 1].calcolaCosto();
                        System.out.println("Veicolo aggiunto correttamente");
                    }
                    break;

                case 2:
                    System.out.println("Id: ");
                    id = scan.nextInt();
                    System.out.println("Quante ore si deve stare nel parcheggio: ");
                    orario = scan.nextInt();
                    if(g.isePieno()){
                        System.out.println("Garage pieno");
                    }
                    else {
                        g.aggiungiVeicolo(new Automobile(orario, id));
                        g.getVeicoli()[g.getnPosti() - 1].calcolaCosto();
                        System.out.println("Veicolo aggiunto correttamente");
                    }
                    break;

                case 3:
                    System.out.println("Indicare l'id del veicolo che si deve ritirare: ");
                    id = scan.nextInt();

                    int index = g.trovaVeicolo(id);




                    System.out.println("Bisogna pagare: " + g.getVeicoli()[index - 1].costo);
                    System.out.println("1. Paga\n2. Non pagare");
                    int s = scan.nextInt();

                    switch (s){
                        case 1:
                            if(soldi >= g.getVeicoli()[index - 1].costo){
                                g.ritiraVeicolo(id);
                                System.out.println("Veicolo ritirato");
                                soldi -= g.getVeicoli()[index - 1].costo;
                            }
                            else{
                                System.out.println("Non hai abbastanza soldi");
                            }
                            break;
                        case 2:
                            break;
                    }
                    break;
                case 4:
                    g.showInfo();
                    break;
                case 5:
                    System.out.println("Hai " + soldi + " euro");
                    break;
            }
        }while(r != 6);
    }
}
