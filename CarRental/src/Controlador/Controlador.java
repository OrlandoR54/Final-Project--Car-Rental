/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import basesdistribuidas.BasesDistribuidas;
import ec.edu.ups.conexion.Conexion;
import ec.edu.ups.conexion.SentenciasCRUD;
import java.util.ArrayList;
import java.util.List;
import modelo.Catalogo_Vehiculo;
import modelo.Cliente;
import modelo.Contrato;
import modelo.FacturaCabecera;
import modelo.FacturaDetalle;
import modelo.Usuario;
import modelo.Vehiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author ISRA ALVA
 */
public class Controlador {
 
    private List<Vehiculo> vehiculos;
    private Usuario usuario;
    private Cliente cliente;
    private List<Catalogo_Vehiculo>  catalogo;
    private Contrato contrato;
    private FacturaCabecera facturaCabecera;
    private FacturaDetalle facturaDetalle;
    private Conexion con;
 
    public Controlador(){
        vehiculos = new ArrayList<Vehiculo>();
        catalogo=new ArrayList<Catalogo_Vehiculo>();
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    
    public void addVehiculo(Vehiculo vehiculo){
        this.vehiculos.add(vehiculo);
    }
    
    public void guardaVehiculo(int veh_codigo, String veh_placa, int veh_kilometraje, String veh_color, String veh_estado, String veh_tipo){
        Vehiculo vehiculo = new Vehiculo();
        
        vehiculo.setVeh_codigo(veh_codigo);
        
        vehiculo.setVeh_kilometraje(veh_kilometraje);
       
        
        this.addVehiculo(vehiculo);
    }

    @SuppressWarnings("empty-statement")
    public List<Catalogo_Vehiculo> getCatalogo() {
        
        
        List<Catalogo_Vehiculo> catalogo= new ArrayList<Catalogo_Vehiculo>();             
		String sql="   select c.cate_nombre,c.cate__precio_dia_controlado,c.cate__precio_adicional_km,v.veh_placa,v.veh_color,mo.mod_nombre,m.mar_nombre\n" +
"   from ren_categorias c , ren_vehiculos v, ren_marcas m ,ren_modelos mo\n" +
"   where c.cate_id=v.ren_categorias_cate_id and m.mar_id=mo.ren_marcas_mar_id and v.ren_modelos_mod_id=mo.mod_id";
		System.out.println(sql);
		
        
 
            try {
			Conexion con = new Conexion();;

			
		   SentenciasCRUD s = new SentenciasCRUD();
        
        con.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
        con.setUsername("DBCARENTAL");
        con.setPassword("dbcarrental");
        con.Conectar();
               if (con.getConexion() != null){
            System.out.println("Base de datos conectada");
           
		    
			PreparedStatement ps= con.prepareStatement(sql);
			    ResultSet rs=ps.executeQuery();
		    while(rs.next())
		    {
		        
		        
		        Catalogo_Vehiculo c = new Catalogo_Vehiculo();
                        c.setCategoria(rs.getString("cate_nombre").trim());
                       c.setTarifa_kilometraje(rs.getDouble("cate__precio_dia_controlado"));
                       c.setKilometraje_adicional(rs.getDouble("cate__precio_adicional_km"));
                       c.setPlaca(rs.getString("veh_placa").trim());
                       c.setColor(rs.getString("veh_color").trim());
                       c.setModelo(rs.getString("mod_nombre").trim());
                       c.setMarca(rs.getString(" mar_nombre").trim());
                       
                       
		      
		        catalogo.add(c);
		        
		    }

		}    
		} catch (Exception e) {
		    e.printStackTrace();
		} finally {
			con.CerrarConexion();;
		}

		return catalogo;
	}
	
   
    

    public void setCatalogo(List<Catalogo_Vehiculo> catalogo) {
        this.catalogo = catalogo;
    }
    
    public void addCatalogo(Catalogo_Vehiculo Catalogo) {
	catalogo.add(Catalogo);
}

}
