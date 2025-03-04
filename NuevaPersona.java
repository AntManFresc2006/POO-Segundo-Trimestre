package POO;

public class NuevaPersona {

	// Objetos

	private String nombre;
	private String apellido;
	private int edad;
	private boolean haPagado;
	private int aula;

	// Constrcutores
	public NuevaPersona() {
	}

	public NuevaPersona(String nombre, String apellido, int edad, boolean haPagado, int aula) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.haPagado = haPagado;
		this.aula = aula;
	}

//Setters y Getters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isHaPagado() {
		return haPagado;
	}

	public void setHaPagado(boolean haPagado) {
		this.haPagado = haPagado;
	}

	public int getAula() {
		return aula;
	}

	public void setAula(int aula) {
		this.aula = aula;
	}

}
