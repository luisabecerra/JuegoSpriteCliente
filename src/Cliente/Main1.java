/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Usuario9
 */
public class Main1 {
  
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Cliente");
        frame.setSize(new Dimension(250,250));
        frame.add(new TableroCliente1());//adicionando el panel
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
}
