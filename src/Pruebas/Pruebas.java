/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

/**
 *
 * @author Kernel-2018
 */
public class Pruebas {
    
    public static void main(String[] args){
        
        try {
            badmethosd();
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("B");
        }
        finally
        {
            System.out.println("c");
        }
        System.out.println("D");
    
    }
    
    public static void badmethosd()
    {
        throw new RuntimeException();
    }
    
}
