/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author israelchuchuca
 */
public class Vehiculo {
    
    private int veh_codigo;
    private String veh_placa;
    private String veh_color;
    private double veh_kilometraje;
    private String veh_descripcion;
    private String estado;
    private String tipo;
    
    //asociaciones
    
    public Vehiculo(){
        
    }
    
    //GETTERS Y SETTERS

    public int getVeh_codigo() {
        return veh_codigo;
    }

    public void setVeh_codigo(int veh_codigo) {
        this.veh_codigo = veh_codigo;
    }

    public String getVeh_placa() {
        return veh_placa;
    }

    public void setVeh_placa(String veh_placa) {
        this.veh_placa = veh_placa;
    }

    public String getVeh_color() {
        return veh_color;
    }

    public void setVeh_color(String veh_color) {
        this.veh_color = veh_color;
    }

    public double getVeh_kilometraje() {
        return veh_kilometraje;
    }

    public void setVeh_kilometraje(double veh_kilometraje) {
        this.veh_kilometraje = veh_kilometraje;
    }

    public String getVeh_descripcion() {
        return veh_descripcion;
    }

    public void setVeh_descripcion(String veh_descripcion) {
        this.veh_descripcion = veh_descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "veh_codigo=" + veh_codigo + ", veh_placa=" + veh_placa + ", veh_color=" + veh_color + ", veh_kilometraje=" + veh_kilometraje + ", veh_descripcion=" + veh_descripcion + ", estado=" + estado + ", tipo=" + tipo + '}';
    }
}
