package Controlador;

import java.util.ArrayList;
import java.util.List;

import Vista.interfazKardex;
import modelo.Kardex;

public class GestionKardex {
	private List<Kardex> kardexs;
	
	public GestionKardex() {
		kardexs = new ArrayList<>();
	}

	public List<Kardex> getKardexs() {
		return kardexs;
	}

	public void setKardexs(List<Kardex> kardexs) {
		this.kardexs = kardexs;
	}
	
}
