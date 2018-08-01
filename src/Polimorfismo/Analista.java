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
public class Analista extends Informaticos{
    
       public void sueldo(int horas, double pagoHoras, double incentivos){
        JOptionPane.showMessageDialog(null,"El pago es : "+(pagoHoras*horas)+ incentivos);
    }
    
    
    public void datos(String nombre, String apellido, String direccion){
    
        JOptionPane.showMessageDialog(null,"Nombre es : "+nombre
                + "\n Apellido es :"
                +apellido
                +"\n Direccion "+ direccion);
    }
    
    public void laborales(String labores ,int horas){
    JOptionPane.showMessageDialog(null,"Soy Programador "
            + "Y me dedico a" + labores
           +" Y Trabajos " +horas+ "Horas");
    }
    
}
