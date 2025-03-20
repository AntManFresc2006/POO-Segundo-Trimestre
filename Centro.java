package ej1Practicas;

public class Centro {

	// Creamos nuestros atributos de la clase Asignatura.

	private String nombre, direccion, idCentro;

	// Aqui creamos los constructores vacios y con parametros

	public Centro() {}

	public Centro(String nombre, String direccion, String idCentro) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.idCentro = idCentro;
	}

	// Aqui los setters y getters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getIdCentro() {
		return idCentro;
	}

	public void setIdCentro(String idCentro) {
		this.idCentro = idCentro;
	}
	
	//Creamos estos contructores para llevar a cabo las funcionalidades que se nos piden en este ejercicio.
			public void funcionalidad1() {
				System.out.println("Nombre = "+nombre);
				System.out.println("Dirección = "+direccion);

			}

}
