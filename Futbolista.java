package POO_Ejercicios2;

public class Futbolista {
	
	private String nombre, apellido;
	private boolean esComunitario;
	private Equipo equipo;
	
	public Futbolista () {}

	public Futbolista(String nombre, String apellido, boolean esComunitario, Equipo equipo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.esComunitario = esComunitario;
		this.equipo = equipo;
	}

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

	public boolean isEsComunitario() {
		return esComunitario;
	}

	public void setEsComunitario(boolean esComunitario) {
		this.esComunitario = esComunitario;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	
	
	
}
