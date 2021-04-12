/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessons.Liste;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author francesco
 */
public class ListeAvanzate {

    public static void main(String[] args) {

        Persona p1 = new Persona("Luca", "Coraci", 22);
        Persona p2 = new Persona("Mario", "Rossi", 13);
        Persona p3 = new Persona("Mario", "Verdi", 54);
        Persona p4 = new Persona("Gino", "Rovereti", 76);

        List<Persona> persone = new LinkedList<>();

        persone.add(p1);
        persone.add(p2);
        persone.add(p3);
        persone.add(p4);

        for (Persona persona : persone) {
            System.out.println("Persona: " + persona);
        }

        Persona persona_da_cercare = new Persona("Mario", "Verdi", 54);

        if (persone.contains(persona_da_cercare)) {
            System.out.println("Si ho trovato la persona che stavi cercando");
        } else {
            System.out.println("non esiste questa persona");
        }
        
        Map<String, Persona> mappaPerNome = new HashMap<>(); //insieme di coppie: chiavi-valore

    }
}
