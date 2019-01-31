package Vista;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import modelo.Kardex;

public class ModelKardex extends AbstractTableModel {
	
	public String[] columnas = {"Fecha","Detalle","Ingresos","Egresos","Saldos"};
	
	public Class[] columnasTipos = {String.class,String.class,double.class,JTable.class};
	
	private List<Kardex> datos;
	
    public ModelKardex() {
		// TODO Auto-generated constructor stub
    	super();
    	datos = new ArrayList<Kardex>();
		
	}
    
    public ModelKardex(List<Kardex> datos){
    	super();
    	this.datos = datos;
    	
    }

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columnas.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return datos.size();
	}

	public void setValueAt(Object value,int row,int col) {
		Kardex dato = (Kardex)(datos.get(row));
		switch (col) {
		case 0:
			dato.setFechaKardex((String)value);
			break;
		case 1:
			dato.setDescripcion((String)value);
			break;
		case 2:
			dato.setIngreso((double)value);
			break;
		case 3:
			dato.setEgreso((double)value);
			break;
		case 4:
			dato.setSaldoKm((double)value);
			break;
		case 5:
			dato.setSaldoCostoKm((double)value);
			break;
		case 6:
			dato.setSaldoTotal((double) value);
			break;
		default:
			break;
		}
	}
	public String getColumnName(int col) {
		return columnas[col];
	}
	public Class getColumnClass(int col) {
		return columnasTipos[col];
		
	}
	public Object getValueAt(int row,int col) {
		Kardex dato = (Kardex)(datos.get(row));
		
		switch (col) {
		case 0:
			return dato.getFechaKardex();
		case 1:
			return dato.getDescripcion();
		case 2:
			return dato.getIngreso();
		case 3:
			return dato.getEgreso();
		case 4:
			return dato.getSaldoKm();
		case 5:
			return dato.getSaldoCostoKm();
		case 6:
			return dato.getSaldoTotal();
		default:
			break;
		}
		return new String();
	}
	
}
