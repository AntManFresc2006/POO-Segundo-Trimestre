package POO_Ejercicio1;

public class Coche {
	
	//Creamos los atributos de la clase coche

	
	private String fabricante, modelo;
	private int añoFabricacion;
	private boolean esDeGasolina;
	
	//Creamos los constructores sin y con parametros

	
	public Coche () {}

	public Coche(String fabricante, String modelo, int añoFabricacion, boolean esDeGasolina) {

		this.fabricante = fabricante;
		this.modelo = modelo;
		this.añoFabricacion = añoFabricacion;
		this.esDeGasolina = esDeGasolina;
	}
	
	
	//Y por ultimo los setters y getters de cada atributos de nuestra clase Pelicula

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAñoFabricacion() {
		return añoFabricacion;
	}

	public void setAñoFabricacion(int añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}

	public boolean isEsDeGasolina() {
		return esDeGasolina;
	}

	public void setEsDeGasolina(boolean esDeGasolina) {
		this.esDeGasolina = esDeGasolina;
	}
	

	
	
}
