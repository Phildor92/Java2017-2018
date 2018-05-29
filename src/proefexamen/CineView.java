/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proefexamen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Philip Evans
 */
public class CineView extends JFrame implements ActionListener {
    public static Zaal[] zalen = new Zaal[5];
    private String[] filmnamen = new String[]{"The Da Vinci Code", "Mission Impossible 3", "Inside Man", "Freedomland", "Iron Man"};
    
    public CineView(){
        super();
        
        
        
        for(int i = 0; i<zalen.length; i++){
            zalen[i] = new Zaal(i+1, (i+1)*100, filmnamen[i]);
        }
        BorderLayout bl = new BorderLayout();
        setSize(800,500);
        
        JMenuBar mb = new JMenuBar();
        JMenu CineViewMenu = new JMenu("CineView");
        JMenu ZalenMenu = new JMenu("Zalen");
        JMenu BannerMenu = new JMenu("Banner");
        
        JMenuItem jmi = new JMenuItem("Quit");
        jmi.addActionListener(this);
        CineViewMenu.add(jmi);
        for(int i = 0; i<5; i++){
            jmi = new JMenuItem("Zaal " + (i+1));
            jmi.setActionCommand(jmi.getActionCommand() + " menu");
            jmi.addActionListener(this);
            ZalenMenu.add(jmi);
        }
        jmi = new JMenuItem("On");
        jmi.addActionListener(this);
        BannerMenu.add(jmi);
        
        jmi = new JMenuItem("Off");
        jmi.addActionListener(this);
        BannerMenu.add(new JMenuItem("Off"));
        
        mb.add(CineViewMenu);
        mb.add(ZalenMenu);
        mb.add(BannerMenu);
        
        //special method to add menubars, instead of "add"
        setJMenuBar(mb);
        
        
        GridLayout gl = new GridLayout(2,1);
        JPanel p1 = new JPanel();
        p1.setSize(100,400);
        p1.setLayout(new GridLayout(2,1));
        
        JTextField reclameField = new JTextField();
        p1.add(reclameField);
        
        JPanel p2 = new JPanel();
        for(int i = 0; i<zalen.length; i++){
            JButton b = new JButton("Zaal " + zalen[i].getZaalnr());
            b.setActionCommand(b.getActionCommand() + " increment");
            b.addActionListener(this);
            p2.add(b);
        }
        p1.add(p2);
        
        setLayout(bl);
        add(p1,BorderLayout.SOUTH);
        JPanel backgroundPanel = new JPanel();
        backgroundPanel.setBackground(Color.BLUE);
        add(backgroundPanel);
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        switch(e.getActionCommand()){
            case "Zaal 1 increment":
            case "Zaal 2 increment": 
            case "Zaal 3 increment": 
            case "Zaal 4 increment": 
            case "Zaal 5 increment": zalen[Integer.parseInt(e.getActionCommand().substring(5,6))-1].reserveer(1);break;
            case "Zaal 1 menu":
            case "Zaal 2 menu":
            case "Zaal 3 menu":
            case "Zaal 4 menu":
            case "Zaal 5 menu": ZaalFrame zf = new ZaalFrame(Integer.parseInt(e.getActionCommand().substring(5,6))-1, this);break;
            
        }
        repaint();
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.setFont(new Font("Comic Sans Ms", Font.PLAIN, 30));
        g.drawChars("Reservatie zalen".toCharArray(), 0, "Reservatie zalen".length(), 50, 90);
        for(int i = 0; i<zalen.length; i++){
            int y = 100+i*50;
            zalen[i].grafiek(g, 20, y, 40, 500, y+30);
        }
    }
}
