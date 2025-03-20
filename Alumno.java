package ej1Practicas;

public class Alumno {
	
	// Creamos nuestros atributos de la clase Asignatura.

		private String nombre, direccion;
		private int numMatricula;
		private double notaAsignatura;
		private Centro centro;
		private Asignatura asignatura;

		// Aqui creamos los constructores vacios y con parametros

		public Alumno() {}

		public Alumno(String nombre, String direccion, int numMatricula, double notaAsignatura, Centro centro,
				Asignatura asignatura) {
			this.nombre = nombre;
			this.direccion = direccion;
			this.numMatricula = numMatricula;
			this.notaAsignatura = notaAsignatura;
			this.centro = centro;
			this.asignatura = asignatura;
		}
		
		// Aqui los setters y getters
		
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public int getNumMatricula() {
			return numMatricula;
		}

		public void setNumMatricula(int numMatricula) {
			this.numMatricula = numMatricula;
		}

		public double getNotaAsignatura() {
			return notaAsignatura;
		}

		public void setNotaAsignatura(int notaAsignatura) {
			this.notaAsignatura = notaAsignatura;
		}

		public Centro getCentro() {
			return centro;
		}

		public void setCentro(Centro centro) {
			this.centro = centro;
		}

		public Asignatura getAsignatura() {
			return asignatura;
		}

		public void setAsignatura(Asignatura asignatura) {
			this.asignatura = asignatura;
		}
		
		//Creamos estos contructores para llevar a cabo las funcionalidades que se nos piden en este ejercicio.
				public void funcionalidad2() {
					System.out.println("La alumna "+nombre+", está matriculada en el centro: "+centro.getNombre()+" con dirección: "+centro.getDireccion()+".");

				}
				
				public void funcionalidad3() {
					System.out.println("La nota que ha sacado "+nombre+" en "+asignatura.getNombre()+" es un "+notaAsignatura);

				}
		
	
}
