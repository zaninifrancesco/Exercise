/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessons.Strings;

import java.util.Scanner;

/**
 *
 * @author francesco
 */
public class StringsLessons {
    

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          
          
         
//        String bruh = "epico bruh";
//        
//        int index = bruh.indexOf("b");
//        
//        String command = "up:2,up:5,left:2,down:1";
//        
//        //up = W Left = a, right = d, down = s
//        
//        command = command.toUpperCase();
//        
//        
//        String[] commands = command.split(",");
//        
//        for (String ccc : commands) {   //foreach
//            System.out.println("COMANDO: " + ccc);
//            String istr[] = ccc.split(":");
//            
//            if(istr[0].equals("UP")){
//                for (int i = 0; i < Integer.parseInt(istr[1]); i++) {
//                    System.out.println("W");
//                }
//            }
//            
//            if(istr[0].equals("LEFT")){
//                for (int i = 0; i < Integer.parseInt(istr[1]); i++) {
//                    System.out.println("A");
//                }
//            }
//            
//            if(istr[0].equals("DOWN")){
//                for (int i = 0; i < Integer.parseInt(istr[1]); i++) {
//                    System.out.println("S");
//                }
//            }
//            
//               
//        }
//        
//        
//        String tel1 = "07-11111111";
//        
//        if(tel1.matches("\\b06(-|\\s)?[0-9]{8}\\b")){
//            System.out.println("Il numero è valido");
//        }
//        else{
//            System.out.println("Il numero non è valido");
//        }
//        
//        index = tel1.indexOf("-");
//        
//        
//        String a = tel1.substring(index + 1, tel1.length());
//        
//        System.out.println(a);

        
        System.out.println("Inserisci la mail: ");
        
        String contatto = scan.next();
        
        
        String a[] = contatto.split("@");
        
        System.out.println("Nickname: " + a[0]);
        
        String b[] = a[1].split("\\.");
        
        System.out.println("Dominio: " + b[0]);
        
        System.out.println("Estensione: ." + b[1]);
        
        
        
        

        
        
    }
    
}
