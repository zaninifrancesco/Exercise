package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        float salario;
        String nome;
        int ruolo;
        String dipartimento;
        int id;

        salario = scan.nextFloat();
        nome = scan.next();
        ruolo = scan.nextInt();
        dipartimento = scan.next();
        id = scan.nextInt();
        dipendente dipendente = new dipendente(salario, nome, ruolo, dipartimento, id);

        salario = scan.nextFloat();
        nome = scan.next();
        ruolo = scan.nextInt();
        dipartimento = scan.next();
        id = scan.nextInt();
        dipendente dipendente1 = new dipendente(salario, nome, ruolo, dipartimento, id);
        int sel;

        do{
            System.out.println("Su quale dipendente vuoi operare: \n1. " + dipendente.getNome() + "\n2. " + dipendente1.getNome() + "\n3. MEDIA");
            sel = scan.nextInt();

            switch (sel){
                case 1:
                    operazioni(dipendente);
                    break;
                case 2:
                    operazioni(dipendente1);
                    break;
                case 3:
                    float media = (dipendente.getStipendio() + dipendente1.getStipendio() / 2);
                    System.out.println("La media tra " + dipendente.getStipendio() + " e " + dipendente1.getStipendio() + " = " + media);

            }

        }while(sel != 0);


    }

    public static void operazioni(dipendente dip){
        int r;
        do{
            System.out.println("Cosa vuoi fare?\n1. Cambiare il dipartimento\n2. Aumentare lo stipendio\n3. Show info");
            r = scan.nextInt();
            switch (r){
                case 1:
                    if(Objects.equals(dip.getDipartimento(), "Amministrazione")){
                        dip.cambiaDipartimento();
                    }
                    else{
                        System.out.println("NON E' AMMINISTRAZIONE");
                    }
                    break;
                case 2:
                    if(dip.getRuolo() > 10){
                        dip.aumentaStipendio(10);
                    }
                    else{
                        dip.aumentaStipendio(20);
                    }
                case 3:
                    dip.showInfo();
            }
        }while (r != 0);
    }

}
