package POO_Ejercicios3;

import POO_Ejercicios3.Aula;

public class Alumno extends Persona{
	private int edad;
	private boolean haPagado=false;
	private Aula aula;
	
	public Alumno() {
		super();
	}

	



	public Alumno(String nombre, String apellido, String apellido2, String dni, String domicilio, String telefono,
			int edad, boolean haPagado, Aula aula) {
		super(nombre, apellido, apellido2, dni, domicilio, telefono);
		this.edad = edad;
		this.haPagado = haPagado;
		this.aula = aula;
	}





	
	
	public int getEdad() {
		return edad;
	}





	public void setEdad(int edad) {
		this.edad = edad;
	}





	public boolean isHaPagado() {
		return haPagado;
	}





	public void setHaPagado(boolean haPagado) {
		this.haPagado = haPagado;
	}





	public Aula getAula() {
		return aula;
	}





	public void setAula(Aula aula) {
		this.aula = aula;
	}





	@Override
	public void saludar() {
		System.out.println("Hola, mi nombre es "+nombre+" "+apellido+" "+apellido2+".");
	}
	
	@Override
	public void mostrarInfo() {
		System.out.println("Nombre = "+nombre);
		System.out.println("Apellidos = "+apellido+" "+apellido2);
		System.out.println("Domicilio = "+domicilio);
		System.out.println("Aula = "+aula.getNombre()+".");	
}
	
	public void verificarPago() {
		if (haPagado==true) {
			System.out.println(nombre+" "+apellido+" "+apellido2+" ha pagado su matricula.");
		}
		
		else {
			System.out.println(nombre+" "+apellido+" "+apellido2+" no ha pagado su matricula.");

		}
	}
	
}
