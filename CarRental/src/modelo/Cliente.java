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
public class Cliente {
    
    private int cli_id;
    private String cli_nombre;
    private String cli_apellido;
    private String cli_cedula;
    private String cli_direccion;
    private String cli_licencia;
    private ArrayList tarjetas;
    private ArrayList contratos;

    public Cliente() {
        tarjetas= new ArrayList<Tarjeta>();
        contratos = new ArrayList<Contrato>();
    }
    
    
}
