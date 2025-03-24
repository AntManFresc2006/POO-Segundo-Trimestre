package Ej3Practicas;

import java.util.Scanner;


public class TestPersistencia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int eleccion1;
		
		//Creamos nuestras clases persona y persistencia para poder usar el programa.
		Persona persona = new Persona();
		
		Persistencia persistencia = new Persistencia();
		
		//Metemos un bucle do-while en donde tendremos un menu que se nos pida si queremos crear, actualizar o eliminar los datos de nuestra persona.
		
		do {
			System.out.println("Buenas, este es un menu para crear, actualizar o eliminar datos de personas, elige 1 para crear, 2 para actualizar, 3 para eliminar y 4 para salir del programa.");
			eleccion1 = sc.nextInt();
			switch (eleccion1) {
			case 1: //Caso 1: Creamos la Persona.
				persistencia.crearPersona(persona);
				mostrarInfo(persona);
				break;
			case 2: //Caso 2: Actualizamos sus datos
				persistencia.actualizarPersona(persona);
				mostrarInfo(persona);
				break;
			case 3: //Caso 3: Eliminamos sus datos.
				persistencia.eliminarPersona(persona);
				mostrarInfo(persona);
				break;
			case 4:
				System.out.println("Fin del programa.");
				break;
				
				default:
					System.out.println("Error, elige un numero del 1 al 4.");
					break;
			}		
			
		} while (eleccion1 != 4);
		
		
		
	}
	
	
	//Creamos este metodo para ver los datos de nuestra persona creada.
	public static void mostrarInfo(Persona persona) {
		System.out.println("ID = "+persona.getId());
		System.out.println("Nombre = "+persona.getNombre());
		System.out.println("Apellido = "+persona.getApellidos());
		System.out.println("Domicilio = "+persona.getDomicilio());
		System.out.println("Telefono = "+persona.getTelefono());

	}
}
