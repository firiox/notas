package com.mycompany.notas;

/**
 *
 * @author he_fa
 */
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
//import java.awt.*;
import java.awt.event.*;
public class Ventana extends JFrame implements ActionListener {
    JMenuBar barra;
    JMenu menu1;
    JMenuItem guardar;
    JMenuItem abrir;
    JTextArea notasArea;
    JScrollPane scrollP1;
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
        scrollP1 = new JScrollPane(notasArea);
        scrollP1.setBounds(0,0,300,200);
        add(scrollP1);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
        Ventana vPrincipal = new Ventana();
        vPrincipal.setBounds(0,0,400,400);
        vPrincipal.setLocationRelativeTo(null);
        
    }
}
