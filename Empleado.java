package POO_Ejercicios3;

public class Empleado extends Persona {
	
	//Creamos los atributos de la clase Persona
	
	protected String puesto;
	
	//Creamos los constructores sin y con parametros, asegurandote de aplicar el metodo super para importar los parametros de la clase padre "Persona".
	
	public Empleado() {
		super();
	}

	public Empleado(String nombre, String apellido, String apellido2, String dni, String domicilio, String telefono,
			String puesto) {
		super(nombre, apellido, apellido2, dni, domicilio, telefono);
		this.puesto = puesto;
	}

	// Y aqui ponemos los setters y getters
	
	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	
	
	
	
}
