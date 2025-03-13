package POO_Interfaces;

public class Coche implements Vehiculo{
	private int cilindrada;
	
	public Coche() {}

	public Coche(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public void arrancar() {
		
		System.out.println("Arranca el coche");
	}

	@Override
	public void detener() {
		System.out.println("Se detiene el coche");
		
	}
	
	
}
