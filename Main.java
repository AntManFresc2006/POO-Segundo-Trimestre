package POO_Ejercicio1;

public class Main {
	public static void main(String[] args) {
		Persona persona1 = new Persona();
		persona1.setNombre("Manolito");
		persona1.setApellido("Gafotas");
		persona1.setDni("12345678H");
		persona1.setDomicilio("Calle Andromeda numero 100");
		persona1.setTelefono(104711749);
		System.out.println("Hola soy "+persona1.getNombre()+" "+persona1.getApellido()+", mi DNI es "+persona1.getDni()+", vivo en "+persona1.getDomicilio()+" y mi numero es +34 "+persona1.getTelefono()+".");
		Persona persona2 = new Persona("Paquito", "el chocolatero", "87654321L", "El campo del Betis", 123085234);
		System.out.println("Hola soy "+persona2.getNombre()+" "+persona2.getApellido()+", mi DNI es "+persona2.getDni()+", vivo en "+persona2.getDomicilio()+" y mi numero es +34 "+persona2.getTelefono()+".");	}
}
