package POO_Ejercicio1;

public class TestPerro {
	public static void main(String[] args) {
		
		
Perro perro1 = new Perro ("Rottweiler", "marrón", 0.3, 4);
Perro perro2 = new Perro ("German Shepherd", "megro", 0.7, 10);

System.out.println("Mi perro es un "+perro1.getRaza()+" de color "+perro1.getColor()+" que mide "+perro1.getTamanio()+" metros y tiene "+perro1.getEdad()+" años.");
System.out.println("Pues el mio es un "+perro2.getRaza()+" de color "+perro2.getColor()+" que mide "+perro2.getTamanio()+" metros y tiene "+perro2.getEdad()+" años!!!");


	}
}
