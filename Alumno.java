package POO_Ejercicios2;

public class Alumno {
	
	private String nombre, apellidos;
	private int edad;
	private boolean haPagado;
	private Aula aula;
	
	public Alumno() {}

	public Alumno(String nombre, String apellidos, int edad, boolean haPagado, Aula aula) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.haPagado = haPagado;
		this.aula = aula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}
	
	
	
}
