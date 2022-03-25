package poo;

public class Disco {

	//private String codigo;
	private String autor;
	private String titulo;
	private String genero;
	private double duracion;
	private String codigo = "LIBRE";

	public Disco() {

	}

	public Disco(String autor, String titulo, String genero, double duracion, String codigo) {
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
		this.codigo = codigo;
	}



	public Disco(final Disco d) {	//final para evitar que se modifique
		this.autor = d.autor;
		this.titulo = d.titulo;
		this.genero = d.genero;
		this.duracion = d.duracion;
		this.codigo = d.codigo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Código: " + codigo + "\nAutor: " + autor + "\nTítulo: " + titulo + "\nGénero: " + genero + "\nDuracion: " + duracion;
	}
	
	

	
	
	

}