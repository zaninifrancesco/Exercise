package com.company;

import java.util.Scanner;

public class Test {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        UfficioPostale ufficio = new UfficioPostale(3);

        ufficio.aggiungiSportelli(new Sportello("Invio Pacchi", true));
        ufficio.aggiungiSportelli(new Sportello("Estratto Conto", true));
        ufficio.aggiungiSportelli(new Sportello("Pagamento Bolletta", true));


        int r;

        do{

            System.out.println("0. Nuovo cliente allo sportello <" + ufficio.getSportelli()[0].getTipo_sportello() + "> n.0 APERTO: " + ufficio.getSportelli()[0].isAperto());
            System.out.println("1. Nuovo cliente allo sportello <<" + ufficio.getSportelli()[1].getTipo_sportello() + ">> n.1 APERTO: " + ufficio.getSportelli()[1].isAperto());
            System.out.println("2. Nuovo cliente allo sportello <<" + ufficio.getSportelli()[2].getTipo_sportello() + ">> n.2 APERTO: " + ufficio.getSportelli()[2].isAperto());

            System.out.println("3. Servi un cliente");
            System.out.println("4. Vedi la lista dei clienti in uno sportello");
            System.out.println("5. Apri o chiudi o uno sportello");

            System.out.println("6. Esci");


            r = scan.nextInt();

            switch (r) {

                case 0:
                    if(ufficio.getSportelli()[0].isAperto()){
                        nuovoCliente(0, ufficio);
                        System.out.println("Cliente aggiunto correttamente");
                    }
                    else{
                        System.out.println("Lo sportello è momentaniamente chiuso");
                    }

                    break;
                case 1:
                    if(ufficio.getSportelli()[1].isAperto()){
                        nuovoCliente(1, ufficio);
                        System.out.println("Cliente aggiunto correttamente");
                    }
                    else{
                        System.out.println("Lo sportello è momentaniamente chiuso");
                    }
                    break;
                case 2:
                    if(ufficio.getSportelli()[2].isAperto()){
                        nuovoCliente(2, ufficio);
                        System.out.println("Cliente aggiunto correttamente");
                    }
                    else{
                        System.out.println("Lo sportello è momentaniamente chiuso");
                    }
                    break;
                case 3:
                    System.out.println("Su quale sportello vuoi servire un cliente?");
                    int scelta = scan.nextInt();

                    switch (scelta){
                        case 0:
                            if(ufficio.getSportelli()[0].controlloCodaVuota()){
                                System.out.println("Quanto chili pesa il pacco del cliente: " + ufficio.getSportelli()[0].getPrimoCliente().getNome());
                                float peso = scan.nextFloat();
                                float costo = peso * 4;
                                System.out.println("Il pacco costa " + costo);
                                System.out.println("Vuoi pagare?");
                                String risp = scan.next();
                                if(risp.equals("si")){
                                    if(ufficio.getSportelli()[0].serviCliente(costo)){
                                        System.out.println("Pacco inviato correttamente");
                                    }
                                    else{
                                        System.out.println("Non hai abbastanza soldi");
                                    }
                                }else{
                                    System.out.println("Ok");
                                }

                                richiestaUscita(0, ufficio);
                            }
                            else{
                                System.out.println("Non ci sono clienti in questo sportello");
                            }
                            break;
                        case 1:
                            if(ufficio.getSportelli()[1].controlloCodaVuota()){
                                System.out.println("Estratto conto del cliente " + ufficio.getSportelli()[1].getPrimoCliente().getNome());
                                System.out.println(ufficio.getSportelli()[1].getPrimoCliente().getSaldo_depositato());
                                richiestaUscita(1, ufficio);
                            }
                            else{
                                System.out.println("Non ci sono clienti in questo sportello");
                            }
                            break;
                        case 2:
                            if(ufficio.getSportelli()[2].controlloCodaVuota()){
                                System.out.println("Costo bolletta del cliente : " + ufficio.getSportelli()[2].getPrimoCliente().getNome());
                                float costo = scan.nextFloat();
                                ufficio.getSportelli()[2].serviCliente(costo);
                                richiestaUscita(2, ufficio);
                            }
                            else{
                                System.out.println("Non ci sono clienti in questo sportello");
                            }
                            break;
                    }

                    break;

                case 4:
                    System.out.println("Su quale sportello vuoi vedere la lista?");
                    scelta = scan.nextInt();

                    if(ufficio.getSportelli()[scelta].controlloCodaVuota()){
                        ufficio.getSportelli()[scelta].vediLista();
                    }
                    else{
                        System.out.println("Non ci sono clienti al momento su questo sportello");
                    }
                    break;

                case 5:

                    System.out.println("Quale sportello bisogna chiudere / aprire");
                    scelta = scan.nextInt();

                    if(ufficio.getSportelli()[scelta].isAperto()){
                        ufficio.getSportelli()[scelta].setAperto(false);
                    }
                    else{
                        ufficio.getSportelli()[scelta].setAperto(true);
                    }

            }

        }while (r != 6);

    }

    public static void nuovoCliente(int nSportello, UfficioPostale ufficio){

        System.out.println("Nome: ");
        String nome = scan.next();
        System.out.println("Saldo: ");
        float saldo = scan.nextFloat();
        System.out.println("Saldo depositato: ");
        float saldo_depositato = scan.nextFloat();

        ufficio.getSportelli()[nSportello].aggiungiallaCoda(new Cliente(nome, saldo, saldo_depositato));

    }

    public static void richiestaUscita(int nSportello, UfficioPostale uf){
        System.out.println("Vuoi uscire dalla coda?");
        String sc = scan.next();
        if(sc.equals("si")){
            System.out.println("il cliente " + uf.getSportelli()[0].getPrimoCliente().getNome() + " è uscito");
            uf.getSportelli()[0].rimuoviCliente();
        }
    }
}
