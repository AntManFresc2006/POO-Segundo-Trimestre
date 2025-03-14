package POO_Interfaces;

public class Documento implements Imprimible{

	private String formato;
	private int numPaginas;
	
	public Documento() {}
	
	
	
	public Documento(String formato, int numPaginas) {
		this.formato = formato;
		this.numPaginas = numPaginas;
	}



	public String getFormato() {
		return formato;
	}



	public void setFormato(String formato) {
		this.formato = formato;
	}



	public int getNumPaginas() {
		return numPaginas;
	}



	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}



	@Override
	public void imprimir() {
	System.out.println("Imprimiendo documento....");
	System.out.println("¡¡Documento imprimido exitosamente!!");
		
	}
	
	@Override
	
	public void mostrarDatos() {
		System.out.println("Formato= "+formato);
		System.out.println("Este documento contiene "+numPaginas+" paginas.");
	}
	
}
