package com.company;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        Officina of = new Officina(10);

        int soldi, r;

        System.out.println("Quanti soldi hai: ");
        soldi = scan.nextInt();

        do{
            System.out.println("""
                    1. Aggiungi un decespugliatore
                    2. Aggiungi un tosaerba
                    3. Aggiungi una motozappa
                    4. Paga la lavorazione di un attrezzo
                    5. Vedi la lista dei macchinari
                    0. Esci""");
            r = scan.nextInt();
            switch (r){
                case 1:
                    System.out.println("Numero ordine: ");
                    int nOrdine = scan.nextInt();
                    System.out.println("Marca: ");
                    String marca = scan.next();
                    System.out.println("L'accellerazione è elettrica?");
                    boolean acc = scan.hasNext();
                    System.out.println("Quante lavorazioni servono: ");
                    int nLav = scan.nextInt();
                    of.aggiungiMacchinario(new Decespugliatore(nOrdine, marca, acc, nLav));
                    for(int i = 0; i < nLav; i++){
                        System.out.println("Tipo della " + i + 1 + " lavorazione: ");
                        String tipo = scan.next();
                        System.out.println("Costo: ");
                        float costo = scan.nextFloat();
                        of.getAttrezzi()[of.getCont() - 1].aggiungiLavorazione(new Lavorazioni(tipo, costo));

                    }
                    System.out.println("Macchinario aggiunto correttamente");
                    break;
                case 2:
                    System.out.println("Numero ordine: ");
                    nOrdine = scan.nextInt();
                    System.out.println("Marca: ");
                    marca = scan.next();
                    System.out.println("Quante lavorazioni servono: ");
                    nLav = scan.nextInt();
                    System.out.println("Numero ruote: ");
                    int nRuote = scan.nextInt();
                    of.aggiungiMacchinario(new Tosaerba(nOrdine, marca, nLav, nRuote));
                    for(int i = 0; i < nLav; i++){
                        System.out.println("Tipo della " + i + 1 + " lavorazione: ");
                        String tipo = scan.next();
                        System.out.println("Costo: ");
                        float costo = scan.nextFloat();
                        of.getAttrezzi()[of.getCont() - 1].aggiungiLavorazione(new Lavorazioni(tipo, costo));

                    }
                    System.out.println("Macchinario aggiunto correttamente");
                case 3:
                    System.out.println("Numero ordine: ");
                    nOrdine = scan.nextInt();
                    System.out.println("Marca: ");
                    marca = scan.next();
                    System.out.println("Quante lavorazioni servono: ");
                    nLav = scan.nextInt();
                    System.out.println("Numero ruote: ");
                    nRuote = scan.nextInt();
                    of.aggiungiMacchinario(new Motozappe(nOrdine, marca, nLav, nRuote));
                    for(int i = 0; i < nLav; i++){
                        System.out.println("Tipo della " + i + 1 + " lavorazione: ");
                        String tipo = scan.next();
                        System.out.println("Costo: ");
                        float costo = scan.nextFloat();
                        of.getAttrezzi()[of.getCont() - 1].aggiungiLavorazione(new Lavorazioni(tipo, costo));

                    }
                    System.out.println("Macchinario aggiunto correttamente");
                case 4:
                    System.out.println("Numero ordine del veicolo che si vuole ritirare: ");
                    int id = scan.nextInt();
                    int index = of.trovaVeicolo(id);
                    System.out.println("Si deve pagare: " + of.getAttrezzi()[index].costoRiparazione);
                    System.out.println("Paga\n1.Si\n2.No");
                    int sel = scan.nextInt();
                    if(sel == 1){
                        if(soldi >= of.getAttrezzi()[index].costoRiparazione){
                            of.ritiraMacchina(id);
                            System.out.println("Macchinario ritirato");
                        }
                    }
                    break;

                case 5:
                    of.vediLista();
                    break;

            }
        }while(r != 0);



    }
}
