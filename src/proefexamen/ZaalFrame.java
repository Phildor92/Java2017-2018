/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proefexamen;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;
import java.lang.Exception;

/**
 *
 * @author Philip Evans
 */
public class ZaalFrame extends JFrame implements ActionListener {
    BorderLayout bl = new BorderLayout();
    JPanel p1 = new JPanel();
    JPanel p1_sp1_Film = new JPanel();
    JPanel p1_sp2_Cap = new JPanel();
    JPanel p1_sp3_Bez = new JPanel();
    JPanel p2 = new JPanel();
    JButton okButton = new JButton("OK");
    JButton cancelButton = new JButton("Annuleer");
    int zaalnr;
    CineView cv;
    
    public ZaalFrame(int nr, CineView cv){
        this.cv = cv;
        this.zaalnr = nr;
        setTitle("ZAAL " + zaalnr);
        setSize(200,300);
        setLayout(bl);   
        p1.setLayout(new GridLayout(3,1));
        p1_sp1_Film.setLayout(new FlowLayout(FlowLayout.LEFT));
        p1_sp1_Film.add(new JLabel("Film: "));
        p1_sp1_Film.add(new JTextField(CineView.zalen[zaalnr].getFilm()));
        
        p1_sp2_Cap.setLayout(new FlowLayout(FlowLayout.LEFT));
        p1_sp2_Cap.add(new JLabel("Capaciteit: "));
        p1_sp2_Cap.add(new JTextField("" + CineView.zalen[zaalnr].getCapaciteit()));
        
        p1_sp3_Bez.setLayout(new FlowLayout(FlowLayout.LEFT));
        p1_sp3_Bez.add(new JLabel("Bezet: "));
        p1_sp3_Bez.add(new JTextField("" + CineView.zalen[zaalnr].getBezet()));
        
        p1.add(p1_sp1_Film);
        p1.add(p1_sp2_Cap);
        p1.add(p1_sp3_Bez);
        add(p1, BorderLayout.CENTER);
        
        
        okButton.addActionListener(this);
        
        cancelButton.addActionListener(this);
        p2.add(okButton);
        p2.add(cancelButton);
        
        add(p2, BorderLayout.SOUTH);
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("OK")){
           try{
               validateInput();
               CineView.zalen[zaalnr].setFilm(((JTextField)(p1_sp1_Film.getComponent(1))).getText());
               CineView.zalen[zaalnr].setCapaciteit(Integer.parseInt(((JTextField)(p1_sp2_Cap.getComponent(1))).getText()));
               CineView.zalen[zaalnr].setBezet(Integer.parseInt(((JTextField)(p1_sp3_Bez.getComponent(1))).getText()));
               cv.repaint();
               this.dispose();
           } catch (Exception ex) {
               System.out.println(ex.getMessage());
               System.out.println(ex.getStackTrace());
           }
        } else {
            this.dispose();
        }
    }

    private void validateInput() throws Exception {
        String filmText = ((JTextField)(p1_sp1_Film.getComponent(1))).getText();
        int capaciteit = Integer.parseInt(((JTextField)(p1_sp2_Cap.getComponent(1))).getText());
        int bezet = Integer.parseInt(((JTextField)(p1_sp3_Bez.getComponent(1))).getText());
        if(bezet > capaciteit || bezet < 0 || capaciteit < 0)
        throw new Exception();
    }
}
