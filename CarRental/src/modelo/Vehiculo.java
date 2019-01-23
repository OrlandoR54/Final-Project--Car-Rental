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
class Vehiculo {
    
    private int veh_codigo;
    private int veh_placa;
    private String veh_modelo;
    private double veh_kilometraje;
    private char veh_tanque_gasolina;
    private double veh_precio_dia_controlado;
    private double veh_sem_controlado;
    private double veh_precio_adicional_km;
    private double veh_precio_dia_limitado;
    private double veh_precio_sem_ilimitado;
    private String veh_descripcion;
    //asociaciones
    
    public Vehiculo(){
        
    }
    
    //SETTERS
    public void setVeh_codigo(int veh_codigo) {
        this.veh_codigo = veh_codigo;
    }

    public void setVeh_placa(int veh_placa) {
        this.veh_placa = veh_placa;
    }

    public void setVeh_modelo(String veh_modelo) {
        this.veh_modelo = veh_modelo;
    }

    public void setVeh_kilometraje(double veh_kilometraje) {
        this.veh_kilometraje = veh_kilometraje;
    }

    public void setVeh_tanque_gasolina(char veh_tanque_gasolina) {
        this.veh_tanque_gasolina = veh_tanque_gasolina;
    }

    public void setVeh_precio_dia_controlado(double veh_precio_dia_controlado) {
        this.veh_precio_dia_controlado = veh_precio_dia_controlado;
    }

    public void setVeh_sem_controlado(double veh_sem_controlado) {
        this.veh_sem_controlado = veh_sem_controlado;
    }

    public void setVeh_precio_adicional_km(double veh_precio_adicional_km) {
        this.veh_precio_adicional_km = veh_precio_adicional_km;
    }

    public void setVeh_precio_dia_limitado(double veh_precio_dia_limitado) {
        this.veh_precio_dia_limitado = veh_precio_dia_limitado;
    }

    public void setVeh_precio_sem_ilimitado(double veh_precio_sem_ilimitado) {
        this.veh_precio_sem_ilimitado = veh_precio_sem_ilimitado;
    }

    public void setVeh_descripcion(String veh_descripcion) {
        this.veh_descripcion = veh_descripcion;
    }

    //GETTERS
    public int getVeh_codigo() {
        return veh_codigo;
    }

    public int getVeh_placa() {
        return veh_placa;
    }

    public String getVeh_modelo() {
        return veh_modelo;
    }

    public double getVeh_kilometraje() {
        return veh_kilometraje;
    }

    public char getVeh_tanque_gasolina() {
        return veh_tanque_gasolina;
    }

    public double getVeh_precio_dia_controlado() {
        return veh_precio_dia_controlado;
    }

    public double getVeh_sem_controlado() {
        return veh_sem_controlado;
    }

    public double getVeh_precio_adicional_km() {
        return veh_precio_adicional_km;
    }

    public double getVeh_precio_dia_limitado() {
        return veh_precio_dia_limitado;
    }

    public double getVeh_precio_sem_ilimitado() {
        return veh_precio_sem_ilimitado;
    }

    public String getVeh_descripcion() {
        return veh_descripcion;
    }

    //TOSTRING
    @Override
    public String toString() {
        return "Vehiculo{" + "veh_codigo=" + veh_codigo + ", veh_placa=" + veh_placa + ", veh_modelo=" + veh_modelo + ", veh_kilometraje=" + veh_kilometraje + ", veh_tanque_gasolina=" + veh_tanque_gasolina + ", veh_precio_dia_controlado=" + veh_precio_dia_controlado + ", veh_sem_controlado=" + veh_sem_controlado + ", veh_precio_adicional_km=" + veh_precio_adicional_km + ", veh_precio_dia_limitado=" + veh_precio_dia_limitado + ", veh_precio_sem_ilimitado=" + veh_precio_sem_ilimitado + ", veh_descripcion=" + veh_descripcion + '}';
    }   
    
    
    public void anadir_vehiculo(){
        
    }
}
