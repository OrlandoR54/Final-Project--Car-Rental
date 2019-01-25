/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Timestamp;

/**
 *
 * @author israelchuchuca
 */
public class Contrato {
    private int codigo_con;
    private Cliente cliente_con;
    private Timestamp horaEntrega_con;
    private Timestamp horaDevolucion_con;
    private Double kilometro_extra_con;
    private Boolean tanqueGasolina_con;
    private Double garantia_con;
    private Vehiculo vehiculo_con;
}
