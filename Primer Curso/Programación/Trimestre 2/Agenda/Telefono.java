package Agenda;

import java.util.ArrayList;

public class Telefono {
	
	private TipoTelefono tiptelefono;
	private String numero;
	private String etiqueta;
	
	public Telefono(TipoTelefono tiptelefono, String numero, String etiqueta) {
		this.tiptelefono = tiptelefono;
		this.numero = numero;
		this.etiqueta = etiqueta;
	}//constructor
	
	
	//Getters----------
	public TipoTelefono getTiptelefono() {
		return tiptelefono;
	}
	public void setTiptelefono(TipoTelefono tiptelefono) {
		this.tiptelefono = tiptelefono;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getEtiqueta() {
		return etiqueta;
	}
	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}
	
	//To string ---------------
	@Override
	public String toString() {
		return "\nTelefono --- \n   Tipo Telefono=" + tiptelefono + ", \n   Numero = " + numero + ", \n   Etiqueta = " + etiqueta;
	}//toString
	
	
	
	
}//class
