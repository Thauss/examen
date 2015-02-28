package clases;

public class Multimedia  {
	protected String titulo,autor;
	protected Formatos formato;
	protected int duracion;
	
	public Multimedia(String titulo, String autor, Formatos formato,
			int duracion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.formato = formato;
		this.duracion = duracion;
	}
	
	public Multimedia(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.formato = formato.DVD;
		this.duracion = 90;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Formatos getFormato() {
		return formato;
	}

	public void setFormato(Formatos formato) {
		this.formato = formato;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Multimedia [titulo=" + titulo + ", autor=" + autor
				+ ", formato=" + formato + ", duracion=" + duracion + "]";
	}
	
	boolean equals(Multimedia m){
		if(this.getAutor().equals(m.getAutor())&&this.getTitulo().equals(m.getTitulo()))
		return true;
		else
		return false;
	}

	
	
	
}
