package POO_Ejercicio1;

public class TestPelicula {
	public static void main(String[] args) {

		Pelicula peli1 = new Pelicula ("Torrente 2", 2001, 1.39);
		Pelicula peli2 = new Pelicula ("Dos tontos muy tontos", 1995, 1.47);
		
		System.out.println("Yo soy el creador de "+peli1.getTitulo()+", saqué la pelicula en "+peli1.getAnio()+" y mi pelicula dura "+peli1.getDuracion()+" horas.");
		System.out.println("Yo soy el creador de "+peli2.getTitulo()+", saqué la pelicula en "+peli2.getAnio()+" y mi pelicula dura "+peli2.getDuracion()+" horas.");

		
	}
}
