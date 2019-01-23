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
class Categoria {
    
    private int cate_id;
    private String cate_tipo_vehiculo;
    private int cate_numero_vehiculo; //para que?
    private String cate_por_marca;
    private String cate_por_costo;
    private ArrayList vehiculos;

    public Categoria() {
        vehiculos= new ArrayList<Vehiculo>();
        
    }
    
}
