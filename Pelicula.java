package POO_Ejercicio1;

public class Pelicula {
	
	//Creamos los atributos de la clase pelicula
	
	private String titulo;
	private int anio;
	private double duracion;
	
	//Creamos los constructores sin y con parametros

	
	public Pelicula() {}
	
	public Pelicula(String titulo, int anio, double duracion) {
		this.titulo = titulo;
		this.anio = anio;
		this.duracion = duracion;
	}

	
	//Y por ultimo los setters y getters de cada atributos de nuestra clase Pelicula

	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	
	
	
	
	
}
