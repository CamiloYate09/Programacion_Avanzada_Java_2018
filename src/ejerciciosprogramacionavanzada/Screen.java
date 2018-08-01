/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosprogramacionavanzada;

/**
 *
 * @author Kernel-2018
 */
public class Screen {
    
    public static void main(String[] args) {
        int i = 1;
        
        System.out.println(i++ + Screen.doWork(i));
        System.out.println(i);
    }
    public static int doWork(int i){
    
        System.out.println(i++);
        return i;
    }
}
