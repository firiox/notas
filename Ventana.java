
//package com.mycompany.notas;

/**
 *
 * @author favoxv
 */
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
//import java.awt.*;
import java.awt.event.*;
public class Ventana extends JFrame implements ActionListener {
    JMenuBar barra;
    JMenu menu1;
    JMenuItem guardar;
    JMenuItem abrir;
    JTextArea notasArea;
    public void actionPerformed(ActionEvent e){
    }
    public Ventana(){
        setLayout(null);
        //Barra
        barra = new JMenuBar();
        setJMenuBar(barra);
        menu1 = new JMenu("Archivo");
        barra.add(menu1);
        guardar = new JMenuItem("Guardar");
        menu1.add(guardar);
        abrir = new JMenuItem("Abrir");
        menu1.add(abrir);
        //Area
        notasArea = new JTextArea();
        notasArea.setBounds(0,0,300,200);
        add(notasArea);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
        Ventana vPrincipal = new Ventana();
        vPrincipal.setBounds(0,0,400,400);
        vPrincipal.setLocationRelativeTo(null);
        
    }
}
