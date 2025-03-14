package POO_Interfaces;

public class Imagen implements Imprimible {
	
private int tamanioImagen;
private String contenido;


public Imagen () {}


	public Imagen(int tamañoImagen, String contenido) {
	this.tamanioImagen = tamañoImagen;
	this.contenido = contenido;
}


	public int getTamañoImagen() {
		return tamanioImagen;
	}


	public void setTamañoImagen(int tamañoImagen) {
		this.tamanioImagen = tamañoImagen;
	}


	public String getContenido() {
		return contenido;
	}


	public void setContenido(String contenido) {
		this.contenido = contenido;
	}


	@Override
	public void imprimir() {
		System.out.println("Imprimiendo imagen....");
		System.out.println("¡¡Imagen imprimida exitosamente!!");
		
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("Esta imagen mide = "+tamanioImagen+" cm.");
		System.out.println("Esta foto consiste en "+contenido+".");
	}
	
	
	
}
