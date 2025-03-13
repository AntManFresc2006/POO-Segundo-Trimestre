package POO_Interfaces;

public class TestVehiculos {
	public static void main(String[] args) {
		
		Coche coche = new Coche(999);
		
		Moto moto = new Moto("Jeep", "203547", 2024, true);

		Vehiculo vehiculo = new Coche(999);
		
		Vehiculo vehiculo2 = new Moto("Jeep", "203547", 2024, true);
		
		coche.arrancar();
		
		coche.detener();
		
		moto.arrancar();
		
		moto.detener();
		
		moto.esGasolina();
		
	}
}
