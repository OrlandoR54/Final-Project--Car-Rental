/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Esta clase permite conectarse a una base de datos por
 * medio de una driver
 * @author oracle
 */
public class Conexion {
    
    private String username;
    private String password;
    private String url;
    private Connection conexion=null;

    public void Conectar(){
        
        
        try{
            
            // registers Oracle JDBC driver - though this is no longer required
            // since JDBC 4.0, but added here for backward compatibility
            
            //Class.forName("oracle.jdbc.OracleDriver");
            
            this.setConexion(DriverManager.getConnection(this.getUrl(),this.getUsername(), this.getPassword()));
        }
        /*catch(ClassNotFoundException e){
            e.printStackTrace();
        }*/
        catch(SQLException e){
            e.printStackTrace();
        }
                
    }
    
    
    public void CerrarConexion(){
        try{
                if (this.getConexion() != null && !this.getConexion().isClosed()){
                    this.getConexion().close();
                }
            }
            catch(SQLException e){
                e.printStackTrace();
            }
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
    
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
}
