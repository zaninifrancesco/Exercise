/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadellaspesa;

/**
 *
 * @author Francesco
 */
class Carta {
    
    private String numeroCarta;
    private float saldo;

    public Carta(String numeroCarta, float saldo) {
        this.numeroCarta = numeroCarta;
        this.saldo = saldo;
    }

    public String getNumeroCarta() {
        return numeroCarta;
    }

    public void setNumeroCarta(String numeroCarta) {
        this.numeroCarta = numeroCarta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
    
}
