package Agenda;

import java.util.*;

public class UsaAgenda2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Contacto> agenda = new ArrayList<>();
		 
		//Pedimos por teclado los datos
		
		/*System.out.println("\n-------- Añade el nuevo contacto: \nNombre:");
		String nombre = sc.next();
		System.out.println("Apellido:");
		String apellido = sc.next();
		System.out.println("Tipo de telefono:");
		String tipoTelefono = sc.next().toUpperCase();
		TipoTelefono ttlfn = TipoTelefono.valueOf(tipoTelefono); //se pasa para la clase ENUM
		System.out.println("Telefono:");
		String tlf = sc.next();
		System.out.println("Etiqueta del contacto:");
		String etiqueta = sc.next();*/
		
		/*Contacto ct1 = new Contacto(nombre, apellido, new ArrayList<Telefono>());
		agenda.add(ct1);
		ct1.setTelefono(new Telefono(ttlfn, tlf, etiqueta));
		ct1.setTelefono(new Telefono(ttlfn, tlf, etiqueta));
		
		Contacto ct2 = new Contacto(nombre, apellido, new ArrayList<Telefono>());
		agenda.add(ct2);
		ct2.setTelefono(new Telefono(TipoTelefono.OTRO, "637370231", "Telefono otro " + nombre));*/
		
		Contacto ct1 = new Contacto("pepe", "perez");
		agenda.add(ct1);
		ct1.setTelefono(new Telefono(TipoTelefono.CASA, "636739270", "Telefono casa "));
		ct1.setTelefono(new Telefono(TipoTelefono.MOVIL, "983665522", "Telefono movil "));
		
		Contacto ct2 = new Contacto("Juan", "Roman");
		agenda.add(ct2);
		ct2.setTelefono(new Telefono(TipoTelefono.OTRO, "637370231", "Telefono otro "));
		
		
		//Buscar numero en contactos
		System.out.println("Introduce el numero a buscar");
		String tlfn = sc.next();
		
		buscarNumero(agenda, tlfn);
		
		/*Buscar cumpleaño
		System.out.println("Introduce el cumpleaño a buscar");
		String cumple = sc.next();*/
		
		//Recorrer los contactos
		System.out.println("\n--------- AGENDA -------------");
		for (Contacto contacto: agenda) {
			System.out.println(contacto);
		}

	}//main
	
	public static void buscarNumero(ArrayList<Contacto> agenda, String tlfn) {
		boolean numE = false;
		
		for (Contacto cont: agenda) {
			for (Telefono tlfn01: cont.getTelefono()) {
				if (tlfn01.getNumero().equals(tlfn) && !numE) {
					System.out.println("El contacto es: " + cont.getNombre() + " "+ cont.getApellidos());
					numE = true;
				}//if
			}//forTelefono
		}//for
		
		if (!numE) {
			System.out.println("El contacto no se ha encontrado");
		}//if
	}//buscarNumero
	
	public static void buscarCumpleano(ArrayList<Contacto> agenda, String cumple) {
		
		
	}

}//class
