/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessons.Liste;

/**
 *
 * @author francesco
 */
public class Persona {

    private String nome;
    private String cognome;
    private int eta;

    public Persona(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    @Override
    public String toString() {
        return this.nome + " di età " + this.eta; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {

        

        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Persona)) { //obj = oggetto della classe Persona passato nei parametri
            return false;
        }
        
        Persona p = (Persona) obj;

        if (this.nome.equals(p.getNome()) && this.cognome.equals(p.getCognome()) && this.eta == p.getEta()) {
            return true;
        } else {
            return false;
        }

    }

}
