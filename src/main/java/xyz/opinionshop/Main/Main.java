package xyz.opinionshop.Main;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Main{
    
    public static void main(String[] args) {
        JFrame Run = new Inicio();
        Run.setVisible(true);
    }
    
    public static void Caracteristicas(JFrame lugar) {
        lugar.setSize(1000,700);
        lugar.getContentPane().setBackground(Color.white);
        lugar.setResizable(false);
    }
    
    public static void Encabezado(JPanel lugar, JPanel encabezado) {
        encabezado.setSize(1000,60);
        
        lugar.setSize(1000,60);
        lugar.removeAll();
        lugar.add(encabezado);
        lugar.revalidate();
        lugar.repaint();
    }
    
}
