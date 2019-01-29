package Vista;

import javax.swing.JLabel;
import javax.swing.table.AbstractTableModel;

public class ModelKardex extends AbstractTableModel {
	// fecha, descripcion, ingreso, egreso
	private JLabel lblFecha;
	private JLabel lblDescripcion;
	private JLabel lblIngreso;
	private JLabel lblEgreso;
	
	public String[] columnas = {"Fecha","Descripcion","Ingreso","Egreso"};
	public Class[] columnasTipos = {String.class,String.class,String.class,String.class,};
	
	public ModelKardex() {
		super();
	}
	

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columnas.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
