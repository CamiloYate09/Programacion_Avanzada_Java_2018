/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author Kernel-2018
 */
public class Main {
    
    // crear objetos de tipo Empleados 
    
    public static void main(String[] args) {

         Empleado emplado1 = new Empleado("Camilo", 25, 25.0000,"2147522", "carrear 7 a");
    Empleado emplado2 = new Empleado("Andres Delgado", 27, 35.0000,"22356", "carrear 12 a 20");
    
    emplado1.VerDatos();
    
    emplado2.VerDatos();
    
    
    
    
    //**********************************************
    
    //creando un objeto con la clase que tiene herencia multibple
    
    Empleado nuevoInstancia = new Empleado("Nuevo Objeto", 999, 2.555, "2563","carrea 7");
    
    nuevoInstancia.VerDatos();
    nuevoInstancia.gripa();// estos dos metodos son de la interfaz
    nuevoInstancia.tos();// estos dos metodos son de la interfaz
    
    
    }
    
}
