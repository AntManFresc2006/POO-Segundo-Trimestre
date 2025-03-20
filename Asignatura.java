package ej1Practicas;

public class Asignatura {
	
	//Creamos nuestros atributos de la clase Asignatura.
	
	private String nombre, idAsignatura;
	private int numHoras;
	
	//Aqui creamos los constructores vacios y con parametros
	
	public Asignatura() {}

	
	
	public Asignatura(String nombre, String idAsignatura, int numHoras) {
		this.nombre = nombre;
		this.idAsignatura = idAsignatura;
		this.numHoras = numHoras;
	}



	//Aqui los setters y getters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdAsignatura() {
		return idAsignatura;
	}

	public void setIdAsignatura(String idAsignatura) {
		this.idAsignatura = idAsignatura;
	}

	public int getNumHoras() {
		return numHoras;
	}

	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}
	
	
	
	
	
}
