package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        float salario;
        String nome;
        String ruolo;

        salario = scan.nextFloat();
        nome = scan.next();
        ruolo = scan.next();

        dipendente epico = new dipendente(salario, nome, ruolo);

        if(epico.getRuolo().equals("Dirigente")){
            System.out.println("EPICOSISSIMO");
            epico.modificaStipendio(20);
        }
        else{
            epico.modificaStipendio(10);
        }
        System.out.println("STIPENDIO ORA: " + epico.getSalario());


    }
}
