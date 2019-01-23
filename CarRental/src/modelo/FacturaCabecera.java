/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author israelchuchuca
 */
public class FacturaCabecera {
    
    private int fac_cab_id;
    private int fac_cab_num_factura;
    private Date fac_cab_fecha;
    private double fac_cab_iva;
    private double fac_cab_total;
    private ArrayList facturaDetalles;

    public FacturaCabecera() {
        
        facturaDetalles= new ArrayList<FacturaDetalle>();
    }
    
    
}
