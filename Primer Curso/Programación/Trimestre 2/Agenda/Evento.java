package Agenda;

import java.util.Date;

public class Evento {

	private String nombre;
	private Date fecha;
	private String notas;
	
	//Getters ----------
	public String getNombre() {
		return nombre;
	}
	public Date getFecha() {
		return fecha;
	}
	public String getNotas() {
		return notas;
	}
	
	//Setters -----------
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public void setNotas(String notas) {
		this.notas = notas;
	}
	
	//toString
	@Override
	public String toString() {
		return "Evento ---- \nNombre = " + nombre + ", \nFecha = " + fecha + ", \nNotas = " + notas;
	}
	
	
	
}//class
