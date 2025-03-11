package POO_Ejercicios3;

public class Consejero extends Empleado{
	
	//Creamos los atributos de la clase Persona

	private int numeroAcciones=0;
	
	
	//Creamos los constructores sin y con parametros

	public Consejero() {
		super();
	}

	public Consejero(String nombre, String apellido, String apellido2, String dni, String domicilio, String telefono,
			String puesto, int numeroAcciones) {
		super(nombre, apellido, apellido2, dni, domicilio, telefono, puesto);
		this.numeroAcciones = numeroAcciones;
	}

	public int getNumeroAcciones() {
		return numeroAcciones;
	}

	public void setNumeroAcciones(int numeroAcciones) {
		this.numeroAcciones = numeroAcciones;
	}
	
	@Override
	public void saludar() {
		System.out.println("Hola, mi nombre es "+nombre+" "+apellido+" "+apellido2+".");
	}
	
	@Override
	public void mostrarInfo() {
		System.out.println("Nombre = "+nombre);
		System.out.println("Apellidos = "+apellido+" "+apellido2);
		System.out.println("Domicilio = "+domicilio);
		System.out.println("Puesto = "+puesto+".");
	System.out.println("Tengo "+numeroAcciones+" acciones.");
	
}
}
