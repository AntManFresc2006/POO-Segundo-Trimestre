package POO;

public class Principal {
	public static void main(String[] args) {
		Alumno a1 = new Alumno();
		a1.setNombre("Alberto");
		
		System.out.println(a1.getNombre());
		
		a1.setEdad(100);
		
		System.out.println(a1.getEdad());
		
		System.out.println(a1.esMayorEdad());
		
		a1.setPrimerApellido("Gonzalez");
		
		System.out.println(a1.getPrimerApellido());
	}
}
