package POO_Ejercicios2;

import POO_Ejercicio1.Coche;
import POO_Ejercicio1.Piloto;

public class TestLibro {
	public static void main(String[] args) {
		Autor autor = new Autor ("Albert", "Einstein", "Alemania");
		Libro libro1 = new Libro ("La Relatividad", "editorial Akal", autor,  1916, 1000);
		Libro libro2 = new Libro ("La evolucion de la fisica", "editorial Losada", autor,  1938, 2000);
		Libro libro3 = new Libro ("El sentimiento de lo bello en la ciencia", "editorial Taurus", autor,  1954, 3000);
		
		System.out.println(libro1.getTitulo()+" tiene "+libro1.getNumeroPaginas()+" paginas y el nombre y apellidos del autor son: "+autor.getNombre() + autor.getApellidos());
		System.out.println(libro2.getTitulo()+" tiene "+libro2.getNumeroPaginas()+" paginas y el nombre y apellidos del autor son: "+autor.getNombre() + autor.getApellidos());
		System.out.println(libro3.getTitulo()+" tiene "+libro3.getNumeroPaginas()+" paginas y el nombre y apellidos del autor son: "+autor.getNombre() + autor.getApellidos());

		
	}
}
