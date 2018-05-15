/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise11b;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.*;

/**
 *
 * @author Philip Evans
 */
public class MyPanel extends JPanel {

    public MyPanel() {
        setBorder(BorderFactory.createLineBorder(Color.black));
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(250,200);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);       

        // Draw Text
        g.drawOval(100,100,30,30);
        g.setColor(Color.red);
        g.drawOval(100,100,40,40);
        g.setColor(Color.BLUE);
    }  
}