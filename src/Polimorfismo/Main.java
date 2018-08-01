/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

/**
 *
 * @author Kernel-2018
 */
public class Main {
    
    
    public static void main(String[] args) {
    Programador p1 = new Programador();
    Analista n1 = new Analista();
    AdministradorDB ad1 = new AdministradorDB();
    
    
    p1.datos("Camilo", "Yate");
    p1.sueldo(320, 2.5000);
    p1.laborales("Ingeniero");
    
    //***************************
    
    n1.datos("Roberto", "Carlos", "Carrera 7 a ");
    n1.sueldo(320, 25.000, 10000);
    n1.laborales("Ingeniero", 320);
    
   //***************************
  
   ad1.datos("Ibo");
   ad1.sueldo(25000.0000);
   ad1.laborales("DBA");
    
        
    }
   
    
    
    
    
}
