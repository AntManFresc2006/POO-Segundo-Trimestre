package POO_Ejercicio1;

public class Piloto {
	
	//Creamos los atributos de la clase coche

	
	private String nombre, nacionalidad;
	
	//Creamos los constructores sin y con parametros

	
	public Piloto(){}

	public Piloto(String nombre, String nacionalidad) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
	}

	//Y por ultimo los setters y getters de cada atributos de nuestra clase Pelicula

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	
	
}
