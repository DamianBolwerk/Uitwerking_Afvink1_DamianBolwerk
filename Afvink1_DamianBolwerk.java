/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afvink1_damianbolwerk;

import javax.swing.JOptionPane;
import java.util.Scanner; 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author damia
 */
public class Afvink1_DamianBolwerk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println("Hello world");
          // JOptionPane.showMessageDialog(null, "Hello World");
          
         // Scanner user_input = new Scanner( System.in );
         // String name;
         // System.out.print("Enter your  name: ");
         // name = user_input.next( );
          
       
       
          
          //System.out.println("Hello " +name);
          //JOptionPane.showMessageDialog(null, "Hello " +name);
          
       
        
        JFrame mainWindow = new JFrame();
        mainWindow.setPreferredSize(new Dimension(200, 100));
        JLabel label = new JLabel("Label      ");
        JLabel label1 = new JLabel(" ");
        JLabel label2 = new JLabel(" ");
        JTextField text = new JTextField(" ");
        mainWindow.getContentPane().add(label1,BorderLayout.PAGE_START);
        mainWindow.getContentPane().add(label2,BorderLayout.PAGE_END);
        mainWindow.getContentPane().add(label, BorderLayout.LINE_START);
        mainWindow.getContentPane().add(text, BorderLayout.CENTER);
        mainWindow.pack();
        mainWindow.setVisible(true);
        

       
          
          
    }
    
}
