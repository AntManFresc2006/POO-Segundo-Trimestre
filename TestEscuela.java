package POO_Ejercicios2;

public class TestEscuela {
	public static void main(String[] args) {
		
		Aula aula1 = new Aula (30, "DAM");
		Aula aula2 = new Aula (25, "DAW");
		Alumno alumno1 = new Alumno ("Antonio", "Fresco", 18, true, aula1);
		Alumno alumno2 = new Alumno ("Alberto", "Buzon", 24,  true, aula1);
		Alumno alumno3 = new Alumno ("Hugo", "Parames", 23,  false, aula2);
		

		
		if (alumno1.isHaPagado() == true) {
			System.out.println(alumno1.getNombre()+" "+alumno1.getApellidos()+" estudia en "+aula1.getNombre()+" y ha pagado las clases.");
			
		}
		else {
			System.out.println(alumno1.getNombre()+" "+alumno1.getApellidos()+" estudia en "+aula1.getNombre()+" y no ha pagado las clases.");

		}
		
		if (alumno2.isHaPagado() == true) {
			System.out.println(alumno2.getNombre()+" "+alumno2.getApellidos()+" estudia en "+aula1.getNombre()+" y ha pagado las clases.");
			
		}
		else {
			System.out.println(alumno2.getNombre()+" "+alumno2.getApellidos()+" estudia en "+aula1.getNombre()+" y no ha pagado las clases.");

		}
		
		if (alumno3.isHaPagado() == true) {
			System.out.println(alumno3.getNombre()+" "+alumno3.getApellidos()+" estudia en "+aula2.getNombre()+" y ha pagado las clases.");
			
		}
		else {
			System.out.println(alumno3.getNombre()+" "+alumno3.getApellidos()+" estudia en "+aula2.getNombre()+" y no ha pagado las clases.");

		}
		
		
	}
}
