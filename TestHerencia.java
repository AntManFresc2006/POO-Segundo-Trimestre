package POO_Ejercicios3;

public class TestHerencia {
	public static void main(String[] args) {
		
		// Ej 11, creamos los objetos e instanciamos sus atributos

		Empleado empleado = new Empleado("Felipe", "Acosta", "Benitez", "2361286K", "La luna", "+34 622 86 98 81", "Espia de la inteligencia britanica");
		
		Empleado empleado1 = new Empleado();
		empleado1.setNombre("Juan");
		empleado1.setApellido("Gonzalez");
		empleado1.setApellido2("Rodriguez");
		empleado1.setDni("283882393U");
		empleado1.setDomicilio("El fondo cosmico de microondas");
		empleado1.setTelefono("+34 837 87 12 43");
		empleado1.setPuesto("Fisico nuclear");
		
		
		// y aqui hacemos la llamada a sus atributos con el metodo get
		
		System.out.println("Hola, mi nombre es "+empleado.getNombre()+" "+empleado.getApellido()+" "+empleado.getApellido2()+" vivo en "+empleado.getDomicilio()+" y trabajo de "+empleado.getPuesto()+" contratame amigo.");
		System.out.println("Hola, mi nombre es "+empleado1.getNombre()+" "+empleado1.getApellido()+" "+empleado1.getApellido2()+" vivo en "+empleado1.getDomicilio()+" y trabajo de "+empleado1.getPuesto()+" contratame amigo.");

		
		//Ej 12, creamos los objetos e instanciamos sus atributos
		
		 Persona personaComun = new Persona("Luis", "Fernández", "Galvez", "18723681326873P", "calle luna 23", "+34 765 12 34 56");
		Cliente clienteNormal = new Cliente("Marta", "Rojas", "Sanchez", "282737738H", "Saturno", "+34 123 76 23 01", "834791824184", "normal");
		
		//Y aqui hacemos la llamada a sus atributos con los constructores pertinentes de su respectiva clase.
		
		personaComun.saludar();
		personaComun.mostrarInfo();
		clienteNormal.saludar();
		clienteNormal.mostrarInfo();
		
		//Ej 13, Creamos el objeto Consejero e instanciamos sus atributos
		
		Consejero consejero = new Consejero("Manuel", "Lopez", "Vargas", "912346819249", "Los pajaritos", "+ 34 652 78 54 12", "VIP", 99);
		consejero.saludar();
		consejero.mostrarInfo();
		
		// Ej 14, Creamos los objetos Alumno y Aula e instanciamos sus atributos
		
		Aula aula = new Aula(27, "Plastica");
		Alumno alumno = new Alumno("Antonio Manuel", "Fresco", "Gomez", "817236736k", "Sevilla", "+34 867 12 92 83", 18, true, aula);
		
		
		
	}
}
