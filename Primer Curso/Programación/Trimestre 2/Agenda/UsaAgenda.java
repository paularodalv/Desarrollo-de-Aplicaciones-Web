package Agenda;

import java.util.ArrayList;

public class UsaAgenda {

	public static void main(String[] args) {
		
		ArrayList<Contacto> agenda = new ArrayList<>();
	
		Contacto pepe = new Contacto("Pepe", "Perez", new ArrayList<Telefono>());
		agenda.add(pepe);
		
		for (Contacto contacto: agenda) {
			System.out.println(contacto);
		}

	}//main

}//class
