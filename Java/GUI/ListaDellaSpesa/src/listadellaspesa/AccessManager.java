/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadellaspesa;

import java.util.LinkedList;

/**
 *
 * @author Francesco
 */
public class AccessManager {
    
    private static LinkedList<Utente> listaUtenti = new LinkedList<Utente>();
    
    public static void registraUtente(Utente pers){
        listaUtenti.add(pers);
    }
    
    public static void vediLista(){
        System.out.println(listaUtenti.getLast().toString());
    }
    
    public static boolean utentePresente(Utente a){
        return listaUtenti.contains(a);
    }
    
    public static Utente login(String email, String password){
        for (Utente utente : listaUtenti) {
            if(utente.getEmail().equals(email) && utente.getPassword().equals(password)){
                return utente;
            }
        }
        return null;
    }
    
    
}
