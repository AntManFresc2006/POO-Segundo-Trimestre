package POO;

public class Profesor extends Persona{

	
	protected String nombre;
	protected String apellidos;
	protected int edad;
	public Profesor(String nombre, String apellidos, int edad) {
		
		super(nombre, apellidos, edad);
		super.nombre = nombre;
		super.apellidos = apellidos;
		this.edad = edad;
	}
	
	
	
	
	
	
}
