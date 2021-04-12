/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstgui;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author francesco
 */
public class FirstGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        JButton button = new JButton();

        
        panel.add(label);
        panel.add(button);
        
        
        
        Container c = frame.getContentPane();
        c.add(panel);
        
        frame.setSize(600, 500);
        
        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
