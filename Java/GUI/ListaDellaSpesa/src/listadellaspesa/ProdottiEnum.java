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
public enum ProdottiEnum {
    PANE(0.5f),
    PIZZA(2),
    ACQUA(0.5f),
    SALE(1),
    FARINA(1),
    BEVANDE(3),
    PESCE(4),
    CARNE(5),
    LATTE(1);
    
    private ProdottiEnum(float prezzo){
        this.prezzo = prezzo;
    }
    
    private float prezzo;

    public float getPrezzo() {
        return prezzo;
    }
    
    public String info(ProdottiEnum x){
        return x.toString().toLowerCase() + " EUR: " + x.prezzo;
    }   
}
