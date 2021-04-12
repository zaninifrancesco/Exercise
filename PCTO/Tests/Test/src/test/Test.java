/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author francesco
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Card> cards = new LinkedList<>();
        
        Card c = new Card("1", "69", 100);
        Card c1 = new Card("2", "69", 100);
        Card c2 = new Card("3", "69", 100);
        Card c3 = new Card("4", "69", 100);
        Card c4 = new Card("5", "69", 100);
        
        System.out.println(c.toString());
        
        
        cards.add(c);
        cards.add(c1);
        cards.add(c2);
        cards.add(c3);
        cards.add(c4);
        
        for (Card card : cards) {
            System.out.println(card);
        }
        
        if(cards.contains(new Card("5", "69", 100))){
            System.out.println("\n\nCARD FOUND");
        }
        
        
    }
    
}
