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
public class Programador extends Informaticos{
    //utilizando el Polimorfismo Overload
    
    public void sueldo(int horas, double pagoHoras){
        JOptionPane.showMessageDialog(null,"El pago es : "+(pagoHoras*horas));
    }
    
    
    public void datos(String nombre, String apellido){
    
        JOptionPane.showMessageDialog(null,"Nombre es : "+nombre+ "\n Apellido es :"+apellido);
    }
    
    public void laborales(String labores){
    JOptionPane.showMessageDialog(null,"Soy Programador " + "Y me dedico a "+ labores);
    }
    
}
