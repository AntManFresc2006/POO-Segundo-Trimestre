package POO_Ejercicio1;

public class Perro {
	
	
	//Creamos los atributos de nuestra clase Perro
	
	private String raza, color;
	private double tamanio;
	private int edad;
	
	
	
	
	//Creamos los constructores sin y con parametros
	
	public Perro() {}
	
	public Perro(String raza, String color, double tamanio, int edad) {
		this.raza = raza;
		this.color = color;
		this.tamanio = tamanio;
		this.edad = edad;
	}
	
	
	//Y por ultimo los setters y getters de cada atributos de nuestra clase Perro
	
	
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getTamanio() {
		return tamanio;
	}

	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	
	
	
}
