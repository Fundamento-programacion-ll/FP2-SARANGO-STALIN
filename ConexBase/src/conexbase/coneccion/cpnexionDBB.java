/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conexbase.coneccion;

import com.mysql.jdbc.Connection;
import conexbase.conector;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author Lordbot
 */
public class cpnexionDBB {
    public static void main(String[] args) {
        
        

    /**
     * @param args the command line arguments
     */
    
        
        PreparedStatement ps = null;
        conector stringConexion = new conector();
        stringConexion.getConxion();
        
        
        
        String insert =
"insert into "
+ "articulos(nombre,descripcion,precio) "
+ "values(?,?,?) ";
        
        try {
            ps = stringConexion
                    .getConxion()
                    .prepareStatement(insert);
            ps.setString(1, "X box");
            ps.setString(2, "Consola");
            ps.setInt(3, 500);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(cpnexionDBB.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
}
    
    



