/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekenen;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class RekenVenster extends JFrame implements ActionListener {
    
    JTextField tekstGetal1, tekstGetal2, tekstResultaat;
    JComboBox<String> operator;
    JButton    rekenen;
    
    Font bigFont = new Font("Comic Sans MS", Font.BOLD, 36);

    
    public RekenVenster() {
        initGui();
    }
    
    final public void initGui() {
        // 
        //
        tekstGetal1    = new JTextField("0",10);
        tekstGetal2    = new JTextField("0",10);
        tekstResultaat = new JTextField("0",10);
        //
        operator  = new JComboBox<String>();
        operator.setFont(bigFont);
        String[] operaties = { "+", "-", "x", "/" };
        for ( String operatie : operaties)
            operator.addItem(operatie);
        //
        rekenen   = new JButton("rekenen");
        rekenen.addActionListener(this);
        //
        this.setLayout(new GridLayout(5,1,0,0));
        this.add(maakPaneel(tekstGetal1));
        this.add(maakPaneel(tekstGetal2));
        this.add(maakPaneel(operator));
        this.add(maakPaneel(rekenen));
        this.add(maakPaneel(tekstResultaat));
        //
               
    }
    
    public JPanel maakPaneel( Component component) {
        component.setFont(bigFont);
        component.setBackground(Color.YELLOW);
        JPanel paneel = new JPanel();
        paneel.add(component);
        paneel.setBackground(Color.GREEN);
        return paneel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        long getal1 = Long.parseLong(tekstGetal1.getText());
        long getal2 = Long.parseLong(tekstGetal2.getText());
        long resultaat=0;
        //
        switch ( operator.getItemAt(operator.getSelectedIndex()) ) {
            case "+" :  resultaat = getal1 + getal2;
                        break;
            case "-" :  resultaat = getal1 - getal2;
                        break;
            case "x" :  resultaat = getal1 * getal2;
                        break;
            case "/" :  resultaat = getal1 / getal2;
                        break;
        }
        //
        tekstResultaat.setText(String.valueOf(resultaat));
    }
}
