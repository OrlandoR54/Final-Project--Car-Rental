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

	public int getCli_id() {
		return cli_id;
	}

	public void setCli_id(int cli_id) {
		this.cli_id = cli_id;
	}

	public String getCli_nombre() {
		return cli_nombre;
	}

	public void setCli_nombre(String cli_nombre) {
		this.cli_nombre = cli_nombre;
	}

	public String getCli_apellido() {
		return cli_apellido;
	}

	public void setCli_apellido(String cli_apellido) {
		this.cli_apellido = cli_apellido;
	}

	public String getCli_cedula() {
		return cli_cedula;
	}

	public void setCli_cedula(String cli_cedula) {
		this.cli_cedula = cli_cedula;
	}

	public String getCli_direccion() {
		return cli_direccion;
	}

	public void setCli_direccion(String cli_direccion) {
		this.cli_direccion = cli_direccion;
	}

	public String getCli_licencia() {
		return cli_licencia;
	}

	public void setCli_licencia(String cli_licencia) {
		this.cli_licencia = cli_licencia;
	}

	public ArrayList getTarjetas() {
		return tarjetas;
	}

	public void setTarjetas(ArrayList tarjetas) {
		this.tarjetas = tarjetas;
	}

	public ArrayList getContratos() {
		return contratos;
	}

	public void setContratos(ArrayList contratos) {
		this.contratos = contratos;
	}
    
    
    
}
