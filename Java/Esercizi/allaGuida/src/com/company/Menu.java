package com.company;

import java.util.Scanner;

public class Menu {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Automobile auto = new Automobile(new Motore(5), new Contakilometri(), new Serbatoio(50));
        int r;
        int s;

        do{
            if(!auto.getStatus()){
                System.out.println("1. Accendi il motore\n2. Definisci il consumo del motore");
                r = scan.nextInt();

                switch (r){
                    case 1:
                        auto.accendi();
                        break;
                    case 2:
                        System.out.print("Inserire il nuovo consumo: ");
                        float kmsuL = scan.nextFloat();
                        auto.setKm(kmsuL);
                        break;
                }
            }
            else{
                System.out.println("3. Rifornisci benzina\n4. Viaggia\n5. Controlla dati automobile\n6. Spegni il motore\n7. Esci");
                r = scan.nextInt();
            }

            switch (r){
                case 3:
                    System.out.print("1. fare il pieno\n2. rifornimento personalizzato");
                    s = scan.nextInt();
                    switch (s){
                        case 1:
                            auto.faiPieno();
                            break;
                        case 2:
                            System.out.print("Di quanto vuoi rifornire la benzina:");
                            float amount = scan.nextFloat();
                            auto.rifornisciBenzina(amount);
                            break;
                    }
                case 4:
                    System.out.print("Di quanti km vuoi viaggiare: ");
                    float km = scan.nextFloat();
                    auto.viaggia(km);
                    break;
                case 5:
                    System.out.println(auto.stradaPercorsa());
                    break;
                case 6:
                    auto.spegni();
                    break;
            }

        }while (r != 7);

    }
}
