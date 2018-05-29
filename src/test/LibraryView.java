/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Philip Evans
 */
public class LibraryView extends JFrame {
    public LibraryView() {
    setBounds(100,100,640,480);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());

    JMenuBar b1 = new JMenuBar();
    JMenu m1 = new JMenu("Test");
    JMenuItem i1 = new JMenuItem("Item1");

    m1.add(i1); // ADDED
    b1.add(m1); // ADDED

    this.setJMenuBar(b1);

    pack(); // ADDED
    setVisible(true); // MOVED
}
}
