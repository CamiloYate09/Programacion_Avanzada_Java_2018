/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author Camilo Yate
 * Superclase
 * 
 * //CLASES Y METODOS ABSTRACTOS
 * 
 */
public abstract class Persona {

    String nombre;
    int edad;
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    
    
    //Metodo Abstracto// no lleva cuerpo el metodo
    abstract public void VerDatos();


    
}
