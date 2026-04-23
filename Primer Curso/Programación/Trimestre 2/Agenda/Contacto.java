package Agenda;

import java.util.ArrayList;

public class Contacto {

	private int id;
	private String nombre;
	private String apellido;
	private ArrayList<Telefono> telefonos = new ArrayList<Telefono>();
	
	private static int contactoSgte = 1;
	
	//Constructor del contacto ------------------
	public Contacto(String nombre, String apellido) {
		this.id = contactoSgte++;
		this.nombre = nombre;
		this.apellido = apellido;
	}//constructor
	
	//Getters ----------------------------------
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellido;
	}
	public static int getContactoSgte() {
		return contactoSgte;
	}
	public ArrayList<Telefono> getTelefono() {
		return telefonos;
	}

	//Setters ----------------------------------
	public void setTelefono(Telefono telefono) {
		this.telefonos.add(telefono);
	}

	//To String --------------------------------
	@Override
	public String toString() {
		return "Nuevo contacto ------ \nID = " + id + ", \nNombre = " + nombre + ", \nApellidos = " + apellido + ", \n" + telefonos;
	}
	
}//class
