/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basesdistribuidas;

import ec.edu.ups.conexion.Conexion;
import ec.edu.ups.conexion.SentenciasCRUD;
import modelo.Licencia;

/**
 *
 * @author oracle
 */
public class BasesDistribuidas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion con = new Conexion();
        SentenciasCRUD s = new SentenciasCRUD();
        
        con.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
        con.setUsername("arc");
        con.setPassword("arc");
        con.Conectar();
        
        if (con.getConexion() != null){
            System.out.println("Base de datos conectada");
            
            //Se consulta los datos de un empleado
            //s.ConsultarEmployees(con, "1");
            Licencia licencia = new Licencia();
            
            s.InsertarLicencia(licencia);
            
            //Se inserta el nuevo pais
            //s.InsertarPais(con, "EC", "ECUADOR", 2);
            
            
            //Se consulta los datos del pais
           // s.ConsultarPais(con, "EC");
            
            //Se elimina los datos del pais
           // s.EliminarPais(con, "EC");
            
            //Se cierra la conexion a la base de datos al finalizar la ejecucion del programa
            con.CerrarConexion();
        }
    }
}
