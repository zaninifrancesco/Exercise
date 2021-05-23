/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadellaspesa;

import java.util.Objects;

/**
 *
 * @author Francesco
 */
public class Utente {
    
    private String username;
    private String password;
    private Carta carta;
    private String email;

    public Utente(String username, String password, Carta carta, String email) {
        this.username = username;
        this.password = password;
        this.carta = carta;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getSaldoCarta() {
        return carta.getSaldo();
    }
    
    public void setSaldoCarta(float num){
        carta.setSaldo(num);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Carta getCarta() {
        return carta;
    }

    

    @Override
    public String toString() {
        return "Persona { " + 
                "\n\tusername = \t" + username + 
                ", \n\tpassword = \t" + password + 
                ", \n\tsaldo = \tEUR " + carta.getSaldo() + 
                "\n\tNumero carta \t" + carta.getNumeroCarta() + 
                "\n\tEmail = \t" + email + "\n}\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Utente other = (Utente) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }

    
    
    
    
}
