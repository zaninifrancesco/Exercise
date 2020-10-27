package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String nome;
        int prezzo;
        int spazio;
        nome = scan.next();
        spazio = scan.nextInt();
        prezzo = scan.nextInt();
        Supporto supporto1 = new Supporto(nome, prezzo, spazio);
        nome = scan.next();
        spazio = scan.nextInt();
        prezzo = scan.nextInt();
        Supporto supporto2 = new Supporto(nome, prezzo, spazio);
        nome = scan.next();
        spazio = scan.nextInt();
        prezzo = scan.nextInt();
        Supporto supporto3 = new Supporto(nome, prezzo, spazio);

        int min = supporto1.getPrezzo();


        if((supporto1.getPrezzo() < supporto2.getPrezzo()) && (supporto1.getPrezzo() < supporto3.getPrezzo())){
            min = supporto1.getPrezzo();
            show(supporto1);
        }
        if(min > supporto3.getPrezzo()){
            min = supporto2.getPrezzo();
            show(supporto2);
        }
        else{
            show(supporto3);
        }

    }

    public static void show(Supporto epico){
        System.out.println("NOME: " + epico.getNome() + "\nPREZZO: " + epico.getPrezzo() + "\nSPAZIO: " + epico.getSpazio());
    }

}
