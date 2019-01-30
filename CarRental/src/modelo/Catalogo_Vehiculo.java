/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author israelchuchuca
 */
public class Catalogo_Vehiculo {
    
    
    private String categoria;	
private double tarifa_kilometraje; 

    public Catalogo_Vehiculo(String categoria, double tarifa_kilometraje, double kilometraje_adicional, String placa, String color, String modelo, String marca, ArrayList categorias) {
        this.categoria = categoria;
        this.tarifa_kilometraje = tarifa_kilometraje;
        this.kilometraje_adicional = kilometraje_adicional;
        this.placa = placa;
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
        this.categorias = categorias;
    }
private double kilometraje_adicional;	
private String placa; 
private String color; 	
private String modelo;	
private String marca;	
private ArrayList categorias;
    

    public Catalogo_Vehiculo() {
       categorias = new ArrayList<Categoria>();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getTarifa_kilometraje() {
        return tarifa_kilometraje;
    }

    public void setTarifa_kilometraje(double tarifa_kilometraje) {
        this.tarifa_kilometraje = tarifa_kilometraje;
    }

    public double getKilometraje_adicional() {
        return kilometraje_adicional;
    }

    public void setKilometraje_adicional(double kilometraje_adicional) {
        this.kilometraje_adicional = kilometraje_adicional;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public ArrayList getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList categorias) {
        this.categorias = categorias;
    }
    
}
