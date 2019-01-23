/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Clase para realizar consultas que se requiere a la base
 * @author oracle
 */
public class SentenciasCRUD {
    
    private ResultSet resultado = null;
    private PreparedStatement psentencia = null;
    
    
    /**
     * Metodo para consultar los datos de un empleado
     * @param con Conexion a la base de datos
     * @param codigo Codigo del empleado de quien se desea presentar los datos
     */
    public void ConsultarEmployees(Conexion con, String codigo){
        
        try{
            psentencia = con.getConexion().prepareStatement("SELECT em_id, em_nombre,em_apellido,em_cedula,em_usuario,em_password "
                        + "FROM DBCARENTAL.empleados "
                        + "WHERE em_id = ?");
            psentencia.setString(1, codigo);
            resultado = psentencia.executeQuery();
            
            //Se presenta el resultado
            while (resultado.next()){
                System.out.println("Empleado "+codigo+":");
                System.out.println("First Name: "+resultado.getString("em_nombre"));
                System.out.println("Last Name: "+resultado.getString("em_apellido"));
                System.out.println("Cedula: "+resultado.getString("em_cedula"));
                System.out.println("Usuario: "+resultado.getString("em_usuario"));
                System.out.println("Password: "+resultado.getString("em_password"));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

    
    /**
     * Metodo para insertar un nuevo pais
     * 
     * @param countryID Identificador del nuevo pais
     * @param countryName Nombre del pais
     * @param regionID Identificador de la region 
     * 
     */
    public void InsertarPais(Conexion con, String countryID, String countryName, int regionID){
        try{
            String sentenciaInsercion = "INSERT INTO Countries VALUES "
                    + "(?,?,?)";
            psentencia = con.getConexion().prepareStatement(sentenciaInsercion);
            psentencia.setString(1, countryID);
            psentencia.setString(2, countryName);
            psentencia.setInt(3, regionID);
            
            //Se ejecuta la sentencia de INSERT
            psentencia.executeUpdate();
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    /**
     * Metodo para eliminar un pais acorde a su identificador
     * @param con Conexion a la base de datos
     * @param countryID Identificador del pais
     */
    public void EliminarPais(Conexion con, String countryID){
        try{
            String sentenciaEliminacion = "DELETE FROM Countries WHERE "
                    + "country_id = ? ";
            psentencia = con.getConexion().prepareStatement(sentenciaEliminacion);
            psentencia.setString(1, countryID);
            
            //Se ejecuta la sentencia de INSERT
            psentencia.executeUpdate();
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    /**
     * Metodo para consultar la informacion de paises
     * @param con Conexion a la base de datos
     * @param countryID Codigo del pais del cual se consulta la informacion
     */
    public void ConsultarPais(Conexion con, String countryID){
        
        try{
            psentencia = con.getConexion().prepareStatement("SELECT country_id, country_name, region_id "
                        + "FROM hr.countries "
                        + "WHERE country_id = ?");
            psentencia.setString(1, countryID);
            resultado = psentencia.executeQuery();
            
            //Se presenta el resultado
            while (resultado.next()){
                System.out.println("*****   Se presentan los datos del pais  *****");
                System.out.println("Codigo pais: "+resultado.getString("country_id"));
                System.out.println("Name pais: "+resultado.getString("country_name"));
                System.out.println("Region id: "+resultado.getString("region_id"));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public ResultSet getResultado() {
        return resultado;
    }

    public void setResultado(ResultSet resultado) {
        this.resultado = resultado;
    }

    public PreparedStatement getPsentencia() {
        return psentencia;
    }

    public void setPsentencia(PreparedStatement psentencia) {
        this.psentencia = psentencia;
    }
   
    
}