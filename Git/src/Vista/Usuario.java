/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import javax.swing.JOptionPane;

import Controlador.User;
import javax.swing.JOptionPane;

/**
 *
 * @author SISTEMAS CORP
 */
public class Usuario {

    public void menu() {
        User metodos = new User();
        int opcion;
        opcion = Integer.parseInt(JOptionPane
                .showInputDialog(null, "MENU \n"
                        + "1. Agregar Persona \n"
                        + "2. Listar Persona \n"
                        + "3. Salir \n",
                        this));

        do {
            switch (opcion) {
                case 1:
                    String nombre = JOptionPane
                            .showInputDialog(null, "INGRESE UN NOMBRE");
                    metodos.agregarPersona(nombre);
                    System.out.println(metodos.listaPersonas());
                    break;
                case 2:
                    System.out.println(metodos.listaPersonas());
                    break;
                case 3:
                    opcion = 3;
                    break;
                default:
                   // opcion = 3;
                    break;
            }
        } while (opcion != 3);

    }

}
