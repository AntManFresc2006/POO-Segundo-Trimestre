package POO_Ejercicios2;

public class TestLiga {
	public static void main(String[] args) {

		Equipo betis = new Equipo ("Real Betis", 1907, 73000);
		Equipo malaga = new Equipo ("Malaga CF", 1904, 20000);
		Futbolista futbolista1 = new Futbolista ("Antony", "Dos Santos", false, betis);
		Futbolista futbolista2 = new Futbolista ("Giovani", "Lo Celso",  true, betis);
		Futbolista futbolista3 = new Futbolista ("Isco", "Alarcon",  true, malaga);
		Futbolista futbolista4 = new Futbolista ("Achraf", "Hakimi", false, malaga);
		
		System.out.println(futbolista1.getNombre()+" "+futbolista1.getApellido()+" juega/jugó en el "+betis.getNombre());
		System.out.println(futbolista2.getNombre()+" "+futbolista2.getApellido()+" juega/jugó en el "+betis.getNombre());
		System.out.println(futbolista3.getNombre()+" "+futbolista3.getApellido()+" juega/jugó en el "+malaga.getNombre());
		System.out.println(futbolista4.getNombre()+" "+futbolista4.getApellido()+" juega/jugó en el "+malaga.getNombre());

		
	}
}
