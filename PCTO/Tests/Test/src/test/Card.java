/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Objects;

/**
 *
 * @author francesco
 */
public class Card {
    
    private String cardNumber;
    private String cardPin;
    private int moneyAmount;

    public Card(String cardNumber, String cardPin, int moneyAmount) {
        this.cardNumber = cardNumber;
        this.cardPin = cardPin;
        this.moneyAmount = moneyAmount;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardPin() {
        return cardPin;
    }

    public void setCardPin(String cardPin) {
        this.cardPin = cardPin;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    @Override
    public String toString() {
        return "\ncardNumber=" + cardNumber + "\ncardPin=" + cardPin + "\nmoneyAmount=" + moneyAmount;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        
        if(!(obj instanceof Card)){
            return false;
        }
        
        Card card = (Card) obj;
        
        if(this.cardNumber.equals(card.getCardNumber()) && this.cardPin.equals(card.cardPin) && this.moneyAmount == card.moneyAmount){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    
    
    
    
    
            
    

}
