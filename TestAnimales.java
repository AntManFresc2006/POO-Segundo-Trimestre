package POO_Interfaces;

public class TestAnimales {
	public static void main(String[] args) {

		Gato gato = new Gato("Gato siames", "Negro");
		Perro perro = new Perro(50, 10);
		Animal gato2 = new Gato("Gato silvestre", "Marron");
		Animal perro2 = new Perro(70, 15);
		
		gato.comer();
		gato.dormir();
		gato.mostrarDatos();
		perro.comer();
		perro.dormir();
		perro.mostrarDatos();
		gato2.mostrarDatos();
		perro2.mostrarDatos();
		
	}
}
