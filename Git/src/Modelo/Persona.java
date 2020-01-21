/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 * 
 * @author ASUS
 */
public class Persona {
    
    String nombre= "";
    String apellidos= "";
    int cedula;
    int edad;
    int telefono;
    String direccion;
    char genero;
    boolean estadocivil;

    public Persona(int cedula, int edad, int telefono, String direccion, char genero, boolean estadocivil) {
        this.cedula = cedula;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
        this.genero = genero;
        this.estadocivil = estadocivil;
    }

    public Persona(String stalin, String sarango, int i, int i0, int i1, String la41, char c, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public char getGenero() {
        return genero;
    }

    public boolean isEstadocivil() {
        return estadocivil;
    }
    
    
    
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setEstadocivil(boolean estadocivil) {
        this.estadocivil = estadocivil;
    }
    
    
    

}
