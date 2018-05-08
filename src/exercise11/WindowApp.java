/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise11;

import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Philip Evans
 */
public class WindowApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Parameters pm = new Parameters();
        pm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel pn1 = new JPanel();
        pn1.setLayout(new BoxLayout(pn1, BoxLayout.X_AXIS));
        
        JButton b1 = new JButton("OK");
        b1.setPreferredSize(new Dimension(30,10));
        b1.addActionListener(new KnopListener());
        
        pn1.add(b1);
        pm.add(pn1);
        
        
        
        
        pm.setSize(300,200);
        pm.setLocation(300,300);
        pm.setTitle("Hello");
        pm.setVisible(true);
        
        
        
        
    }
    
}
