/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPP.Main;

/**
 *
 * @author Camilo Yate
 */
public class Alumno {

    //atributos 
    private int noControl;
    private String email;
    private String nombre;
    private String apellidos;
    
    

    public Alumno(int noControl, String email, String nombre, String apellidos) {
        this.noControl = noControl;
        this.email = email;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public int getNoControl() {
        return noControl;
    }

    public void setNoControl(int noControl) {
        this.noControl = noControl;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "noControl=" + getNoControl() + ", email=" + getEmail() + ", nombre=" + getNombre() + ", apellidos=" + getApellidos() + '}';
    }

}
