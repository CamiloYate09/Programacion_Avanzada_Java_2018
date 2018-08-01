/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import Herencia.Persona;
import javax.swing.JOptionPane;

/**
 *
 * @author Camilo Yate
 *
 * Subclase que hereda
 */
public class Empleado extends Persona implements Emfermo {

    double sueldo;
    String telefono, direccion;

    public Empleado(String nombre, int edad, double sueldo, String telefono,
             String direccion) {
        super(nombre, edad);
        this.sueldo = sueldo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    @Override
    public void VerDatos() {
        JOptionPane.showMessageDialog(null, "Nombre :" + nombre + "\n Edad: " + edad
                + "\n Sueldo: " + sueldo + "\n Telefono:" + telefono + "\n Direcccion:"
                + direccion , "Datos del Empleado", JOptionPane.INFORMATION_MESSAGE);

    }
    
    
    
    //sobreescribir los metodos de la clase Emfemro
    //hay que implementar todos los metodos que esten en la interfaz
    
    @Override
    public void tos(){
    JOptionPane.showMessageDialog(null,"Hola, estoy emfermo");
    }
    
    @Override
    public void gripa(){
    
    JOptionPane.showMessageDialog(null, "Y tambien tengo gripa");}

}
