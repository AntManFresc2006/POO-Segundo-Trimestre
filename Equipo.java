package POO_Ejercicios2;

public class Equipo {
	
	private String nombre;
	private int añoFundacion, socios;
	
	public Equipo() {}

	public Equipo(String nombre, int añoFundacion, int socios) {
		this.nombre = nombre;
		this.añoFundacion = añoFundacion;
		this.socios = socios;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAñoFundacion() {
		return añoFundacion;
	}

	public void setAñoFundacion(int añoFundacion) {
		this.añoFundacion = añoFundacion;
	}

	public int getSocios() {
		return socios;
	}

	public void setSocios(int socios) {
		this.socios = socios;
	}
	
	
}
