/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;

import Modelo.Persona;

/**
 *
 * @author SISTEMAS CORP
 */
public class Git {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona Stalin = new 
        Persona("Stalin", "Sarango", "22005111", 
                24, 
                "222222", "la 41", 'm', true);
        Persona orlando = new Persona("kevin", "jimenez", "0", 0, "0", "la 41", 'm', true);
        Persona jimenez = new Persona("Stalin", "Sarango", "0", 0, "0", "la 41", 'm', true);
        System.out.println(Stalin);
        
    }
    
}
