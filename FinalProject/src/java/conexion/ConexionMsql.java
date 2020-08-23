/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class ConexionMsql {
    public static ConexionMsql instance;
    private Connection cnn;
    
    private ConexionMsql(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn= DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pedidos","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionMsql.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConexionMsql.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static synchronized ConexionMsql getInstance(){
        if(instance==null){
            instance= new ConexionMsql();
        }
        return instance;
    }
    public Connection getcnn(){
        return cnn;
    }
    public void cerrarConexion(){
        instance= null;
    }
}
