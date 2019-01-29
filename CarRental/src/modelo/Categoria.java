/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author israelchuchuca
 */
public class Categoria {
    
    private int cat_id;
    private String cat_nombre;
    private double precio_diario_controlado;
    private double precioKmExtra;
    private String catMarca;
    private String catModelo;
    private ArrayList vehiculos;

    public Categoria() {
        vehiculos= new ArrayList<Vehiculo>();
    }

    //GETTERS Y SETTERS
    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    public String getCat_nombre() {
        return cat_nombre;
    }

    public void setCat_nombre(String cat_nombre) {
        this.cat_nombre = cat_nombre;
    }

    public double getPrecio_diario_controlado() {
        return precio_diario_controlado;
    }

    public void setPrecio_diario_controlado(double precio_diario_controlado) {
        this.precio_diario_controlado = precio_diario_controlado;
    }

    public double getPrecioKmExtra() {
        return precioKmExtra;
    }

    public void setPrecioKmExtra(double precioKmExtra) {
        this.precioKmExtra = precioKmExtra;
    }

    public String getCatMarca() {
        return catMarca;
    }

    public void setCatMarca(String catMarca) {
        this.catMarca = catMarca;
    }

    public String getCatModelo() {
        return catModelo;
    }

    public void setCatModelo(String catModelo) {
        this.catModelo = catModelo;
    }

    public ArrayList getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public String toString() {
        return "Categoria{" + "cat_id=" + cat_id + ", cat_nombre=" + cat_nombre + ", precio_diario_controlado=" + precio_diario_controlado + ", precioKmExtra=" + precioKmExtra + ", catMarca=" + catMarca + ", catModelo=" + catModelo + ", vehiculos=" + vehiculos + '}';
    }
}
