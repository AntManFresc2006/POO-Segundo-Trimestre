package POO;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		NuevaPersona persona1 = new NuevaPersona();
		persona1.setNombre("Manolito");
		persona1.setAula(99);
		persona1.setApellido("Gafotas");
		persona1.setEdad(1000);
		System.out.println("Dime tu edad");
		System.out.println("Hola soy "+persona1.getNombre()+" "+persona1.getApellido()+", pertenezco al aula "+persona1.getAula()+" y tengo "+persona1.getEdad()+" años.");
		NuevaPersona persona2 = new NuevaPersona("Paquito", "el chocolatero", 10000, false, 9);
		System.out.println("Y yo soy "+persona2.getNombre()+" "+persona2.getApellido()+"!!!, pertenezco al aula "+persona2.getAula()+" y tengo "+persona2.getEdad()+" años.");
	}
}
