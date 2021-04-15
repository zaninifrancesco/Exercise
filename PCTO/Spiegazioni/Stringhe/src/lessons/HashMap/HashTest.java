/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessons.HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author francesco
 */
public class HashTest {

    public static void main(String[] args) {

        Map<String, Persona> personeByEmailMap = new HashMap<>();

        Persona p1 = new Persona("Luca", "Coraci", "luca.coraci@gmail.com", 13);
        Persona p2 = new Persona("Mario", "Marietti", "mario@libero.it", 21);
        Persona p3 = new Persona("Gino", "Ginotti", "gino@hotmai.com", 44);
        Persona p4 = new Persona("Simone", "Simonelli", "sisi@gmail.com", 55);

        personeByEmailMap.isEmpty();

        //Inserimento entry
        personeByEmailMap.put(p1.getEmail(), p1);
        personeByEmailMap.put(p2.getEmail(), p2);
        personeByEmailMap.put(p3.getEmail(), p3);
        personeByEmailMap.put(p4.getEmail(), p4);

        // Se non trova niente torna null
        //Cerca per chiave e torna il valore
//        personeByEmailMap.remove("sisi@gmail.com"); //rimuove un entry data una chiave
//        System.out.println(personeByEmailMap.get("sisi@gmail.com")); 
        personeByEmailMap.get("mario@libero.it").setSurname("DAISDHSADHSAHFDS");

        for (String key : personeByEmailMap.keySet()) {
            System.out.println("KEY: " + key + ", VALUE: " + personeByEmailMap.get(key).getSurname());
        }
    }

}
