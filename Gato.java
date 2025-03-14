package POO_Interfaces;

public class Gato implements Animal{
	
	private String raza, color;
	
	public Gato() {}

	public Gato(String raza, String color) {
		this.raza = raza;
		this.color = color;
	}

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

	@Override
	public void comer() {
		System.out.println("Gato: ñam ñam");
		
	}

	@Override
	public void dormir() {
		System.out.println("Gato: ZZZZZZZ");

		
		
	}
	
	@Override
	public void  mostrarDatos() {
		System.out.println("Raza del gato: "+raza);
		System.out.println("Color del gato: "+color);

		
		
	}
	
	
	
}
