package POO_Interfaces;

public class TestImprimir {
	public static void main(String[] args) {

		Documento documento = new Documento("PDF", 200);
		Imagen imagen = new Imagen(15, "Una foto del betis");
		Imprimible documento2 = new Documento("Doc", 100);
		Imprimible imagen2 = new Imagen(26, "Una foto de un perro");
		
		documento.imprimir();
		imagen.imprimir();
		documento2.mostrarDatos();
		imagen2.mostrarDatos();

		
	}
}
