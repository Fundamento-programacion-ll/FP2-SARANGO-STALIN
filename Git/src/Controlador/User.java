/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import java.util.ArrayList;

/**
 * 
 * @author  ASUS
 */
public class User {

    public boolean listaPersonas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void agregarPersona(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
public class user {
    
    ArrayList listaPersonas = 
            new ArrayList<String>();
    
    public String agregarPersona(
    String nombre
    ){
        listaPersonas.add(nombre);
        
        return "Persona agregada correctamente," 
                + nombre;
    }
    
    public String listaPersonas(){
        String lista = "";           
        for (int i = 0; i < listaPersonas.size(); i++) {
            System.out.println(listaPersonas.get(i));
            lista += listaPersonas.get(i).toString() + "\n";
        }                
        return lista;
    }
    
    
    
    
}
}
