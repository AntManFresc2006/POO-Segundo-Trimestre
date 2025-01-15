package POO;

public class Alumno extends Persona {

   // Constructores
public Alumno () {
	
}


public Alumno (String n, String a, int e) {
	nombre = n;
	apellidos = a;
	edad = e;
	
}


//Setters y Getters

public void setNombre(String nombre) {
	this.nombre=nombre;
}
public String getNombre() {
	return nombre;
}


   public String getPrimerApellido() {
	return apellidos;
}
public void setPrimerApellido(String primerApellido) {
	this.apellidos = primerApellido;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}

//Metodos
public boolean esMayorEdad() {
	return edad >= 18;
}


}
