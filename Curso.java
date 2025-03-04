package POO;

public class Curso {
	
	
	
	
	public Asignaturas[] ejecutar() {
		
		Asignaturas[] asignaturas = new Asignaturas[8];
		
		Asignaturas asignatura =  new Asignaturas("Programación", 256);
		asignaturas[0] = asignatura;
		
		asignatura =  new Asignaturas("Bases de Datos", 220);
		asignaturas[1] = asignatura;
		
		asignatura =  new Asignaturas("Lenguaje de marcas", 96);
		asignaturas[2] = asignatura;
		
		asignatura =  new Asignaturas("IPE", 96);
		asignaturas[3] = asignatura;
		
		asignatura =  new Asignaturas("Sistemas Informaticos", 192);
		asignaturas[4] = asignatura;
		
		asignatura =  new Asignaturas("Entornos de desarrollo", 256);
		asignaturas[5] = asignatura;
		
		asignatura =  new Asignaturas("Sostenibilidad", 32);
		asignaturas[6] = asignatura;
		
		asignatura =  new Asignaturas("Digitalizacion", 32);
		asignaturas[7] = asignatura;
		
		System.out.println("ola");
		for (int i=0; i<7; i++) {
		System.out.println(asignaturas[i].getNombre() +" "+ asignaturas[i].getHoras()+" horas");
		
		return asignaturas;
	}
		
		protected void comenzarCurso(Asignaturas[] asignaturas) {
			System.out.println("Presentacion de Alumnos: ");
			
			for (Alumno alumno : alumnos) {
				System.out.println("Me llamo "+alumno.getNombre()+", mi apellido es "+ alumno.getApellidos()+" y tengo "+alumno.getEdad()+" años.");
			}
			
		}
		
		protected void presentarAsignaturas(Asignaturas[] asignaturas) {
			
			for(Asignaturas asignaturas : asignaturas) {
				
				System.out.println("Soy la asignatura "+ asignatura.getNombre() +" y duro "+ asignatura.getHoras()+" horas.");
			}
		}
}
	
}
