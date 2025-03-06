package POO_Ejercicios2;

public class Libro {
	private String titulo, editorial;
	private Autor autor;
	private int añoPublicacion, numeroPaginas;
	
	public Libro () {}

	public Libro(String titulo, String editorial, Autor autor, int añoPublicacion, int numeroPaginas) {
		this.titulo = titulo;
		this.editorial = editorial;
		this.autor = autor;
		this.añoPublicacion = añoPublicacion;
		this.numeroPaginas = numeroPaginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public int getAñoPublicacion() {
		return añoPublicacion;
	}

	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	
}
