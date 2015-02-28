package clases;

public class Disco extends Multimedia {
	
	protected Generos genero;

	public Disco(String titulo, String autor, Formatos formato, int duracion, Generos genero) {
		super(titulo, autor, formato, duracion);
		this.genero=genero;
	}

	public Disco(String titulo, String autor, Generos genero) {
		super(titulo, autor);
		this.genero=genero;
	}

	public Generos getGenero() {
		return genero;
	}

	public void setGenero(Generos genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return super.toString()+"Disco [genero=" + genero + "]";
	}
	
}
