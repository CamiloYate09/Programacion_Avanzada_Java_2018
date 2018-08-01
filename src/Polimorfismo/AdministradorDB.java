/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

import javax.swing.JOptionPane;

/**
 *
 * @author Kernel-2018
 */
public class AdministradorDB {
    
       public void sueldo(double sueldo){
        JOptionPane.showMessageDialog(null,"El pago es : "+sueldo);
    }
    
    
    public void datos(String nombre){
    
        JOptionPane.showMessageDialog(null,"Nombre es : "+nombre);
    }
    
    public void laborales(String labores){
    JOptionPane.showMessageDialog(null,"Soy Programador " + "Y me dedico a" + labores);
    }
    
}
