
package Ej3Practicas;


public interface PersistenciaPersonas {

	
	void crearPersona(Persona persona); //Permite conectarnos a la base de datos
	
	void actualizarPersona(Persona persona); //Permite actualizar los datos de una persona
	
	void eliminarPersona(Persona persona); //Permite borrar los datos de una persona
	
	
}
