package Ej3Practicas;

import java.util.Scanner;

public class Persistencia implements PersistenciaPersonas{
	Scanner sc = new Scanner(System.in);
	private String eleccion;
	private Persona persona;
	
	//Permite conectarnos a la base de datos
	
	@Override
public void crearPersona(Persona persona) {
	System.out.println("Buenas, vas a crear una Persona nueva, voy a ayudarte.");
	
	System.out.println("Dime su id.");
	persona.setId(sc.nextLine());
	
	System.out.println("Dime su nombre y apellidos.");
	persona.setNombre(sc.nextLine());
	persona.setApellidos(sc.nextLine());
	
	System.out.println("Dime su domicilio.");
	persona.setDomicilio(sc.nextLine());
	
	System.out.println("Dime su telefono.");
	persona.setTelefono(sc.nextLine());
} 
	
	//Permite actualizar los datos de una persona
	
	@Override
	public void actualizarPersona(Persona persona) {
		System.out.println("¿Estas seguro de que quieres actualizar sus caracteristicas?");
		eleccion = sc.nextLine();
		
		while (!eleccion.equalsIgnoreCase("si") & !eleccion.equalsIgnoreCase("no")) {
			System.out.println("Error, di si o no.");
			eleccion = sc.nextLine();
		}
		
		if (eleccion.equalsIgnoreCase("si")) {
			System.out.println("Dime su id.");
			persona.setId(sc.nextLine());
			
			System.out.println("Dime su nombre y apellidos.");
			persona.setNombre(sc.nextLine());
			persona.setApellidos(sc.nextLine());
			
			System.out.println("Dime su domicilio.");
			persona.setDomicilio(sc.nextLine());
			
			System.out.println("Dime su telefono.");
			persona.setTelefono(sc.nextLine());
		}
		
		else {
			System.out.println("Esta bien. Entonces no actualizaremos tu persona.");
		}
		
	} 
	
	//Permite borrar los datos de una persona
	
	@Override
	public void eliminarPersona(Persona persona) {
		System.out.println("¿Estas seguro de que quieres eliminar sus datos?");
		eleccion = sc.nextLine();
		
		while (!eleccion.equalsIgnoreCase("si") & !eleccion.equalsIgnoreCase("no")) {
			System.out.println("Error, di si o no.");
			eleccion = sc.nextLine();
		}
		
		if (eleccion.equalsIgnoreCase("si")) {
			persona.setId(null);
			persona.setDomicilio(null);
			persona.setApellidos(null);
			persona.setNombre(null);
			persona.setTelefono(null);
			
			System.out.println("Listo, hemos eliminado sus datos.");
		}
		
		else {
			System.out.println("Esta bien. Entonces no eliminaremos tu persona.");
		}
	} 
	
}
