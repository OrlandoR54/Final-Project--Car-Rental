/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Catalogo_Vehiculo;
import modelo.Categoria;
import modelo.Cliente;
import modelo.Contrato;
import modelo.FacturaCabecera;
import modelo.FacturaDetalle;
import modelo.Usuario;
import modelo.Vehiculo;

/**
 *
 * @author ISRA ALVA
 */
public class Controlador {
 
    private List<Vehiculo> vehiculos;
    private Usuario usuario;
    private Cliente cliente;
    private Catalogo_Vehiculo catalogo;
    private Contrato contrato;
    private FacturaCabecera facturaCabecera;
    private FacturaDetalle facturaDetalle;
 
    public Controlador(){
        vehiculos = new ArrayList<Vehiculo>();
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
    
    public void guardaVehiculo(String veh_placa, double veh_kilometraje, String veh_color, String veh_estado, String veh_tipo,){
        Vehiculo vehiculo = new Vehiculo();
        
        vehiculo.setVeh_placa(veh_placa);
        vehiculo.setVeh_kilometraje(veh_kilometraje);
        vehiculo.setVeh_color(veh_color);
        
        Categoria categoria = new Categoria();
        
        categoria.setCatMarca(veh_placa);
        
        this.addVehiculo(vehiculo);
    }
    
    
}
