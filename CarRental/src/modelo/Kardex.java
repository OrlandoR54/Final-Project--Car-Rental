package modelo;

public class Kardex {
	private int karID;
	private String fechaKardex;
	private int vehiculoID;
	private String descripcion;
	private double ingreso;
	private double egreso;
	private double saldoKm;
	private double saldoCostoKm;
	private double saldoTotal;
	
	public Kardex(int karID,
			 	  String fechaKardex,
			 	  int vehiculoID,
			 	  String descripcion,
			 	  double ingreso,
			 	  double egreso,
			 	  double saldoKm,
			 	  double saldoCostoKm,
			 	  double saldoTotal)
	{
		this.karID = karID;
		this.fechaKardex = fechaKardex;
		this.vehiculoID = vehiculoID;
		this.descripcion = descripcion;
		this.ingreso = ingreso;
		this.egreso = egreso;
		this.saldoKm = saldoKm;
		this.saldoCostoKm = saldoCostoKm;
		this.saldoTotal = saldoTotal;
		
	}
	
	public int getKarID() {
		return karID;
	}
	public void setKarID(int karID) {
		this.karID = karID;
	}
	public String getFechaKardex() {
		return fechaKardex;
	}
	public void setFechaKardex(String fechaKardex) {
		this.fechaKardex = fechaKardex;
	}
	public int getVehiculoID() {
		return vehiculoID;
	}
	public void setVehiculoID(int vehiculoID) {
		this.vehiculoID = vehiculoID;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getIngreso() {
		return ingreso;
	}
	public void setIngreso(double ingreso) {
		this.ingreso = ingreso;
	}
	public double getEgreso() {
		return egreso;
	}
	public void setEgreso(double egreso) {
		this.egreso = egreso;
	}
	public double getSaldoKm() {
		return saldoKm;
	}
	public void setSaldoKm(double saldoKm) {
		this.saldoKm = saldoKm;
	}
	public double getSaldoCostoKm() {
		return saldoCostoKm;
	}
	public void setSaldoCostoKm(double saldoCostoKm) {
		this.saldoCostoKm = saldoCostoKm;
	}
	public double getSaldoTotal() {
		return saldoTotal;
	}
	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}
	

}
