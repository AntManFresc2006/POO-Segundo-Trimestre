package ej1Practicas;

public class TestAcademiaIdiomas {
	public static void main(String[] args) {
		
		//Creamos los objetos Centro.

		Centro escuelaDeIngles = new Centro("Escuela de Ingles", "Reyes catolicos, 14", "123345");
		Centro escuelaDeFrances = new Centro("Escuela de Frances", "Cristobal Colón, 92", "1233455");
		
		Asignatura inglesB1 = new Asignatura("Inglés nivel B1", "1981679612", 9);
		Asignatura inglesB2 = new Asignatura("Ingles nivel B2", "29834", 7);
		Asignatura francesB1 = new Asignatura("Frances nivel B1", "2985234", 10);
		Asignatura francesA2 = new Asignatura("Frances nivel A2", "2985235644", 3);


		
		Alumno anaAbel = new Alumno("Ana Abel", "Paseo de América, 15", 1324213, 7, escuelaDeIngles, inglesB1);
		Alumno benitoBueno = new Alumno("Benito Bueno", "Reyes católicos, 16", 13243223, 6, escuelaDeIngles, inglesB2);
		Alumno carmenCano = new Alumno("Carmen Cano", "Reyes católicos, 2", 1324654213, 5, escuelaDeIngles, inglesB1);
		Alumno estebanEscalera = new Alumno("Esteban Escalera", "Isabel la Católica, 28", 1343324213, 9, escuelaDeFrances, francesB1);		
		Alumno franciscoFarfan = new Alumno("Francisco Farfán", "Cristóbal Colón, s/n", 132421783, 8.5, escuelaDeFrances, francesA2);
		
		//Ahora vamos con las funcionalidades:
		
		//Funcionalidad 1:
		
		escuelaDeIngles.funcionalidad1();
		escuelaDeFrances.funcionalidad1();
		
		// Funcionalidad 2:
		
		carmenCano.funcionalidad2();
		
		// Funcionalidad 3:
		
		benitoBueno.funcionalidad3();



		
		
		
		
	}
}
