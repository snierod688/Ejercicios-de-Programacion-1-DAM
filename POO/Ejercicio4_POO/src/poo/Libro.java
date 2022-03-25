package poo;

public class Libro {

	private String tituloLibro;
	private String nombreAutor;
	private int NumEjemplares;
	private int NumEjemplaresPrestados;
	
	public Libro() {
		
	}

	
	public Libro(String tituloLibro, String nombreAutor, int numEjemplares, int numEjemplaresPrestados) {
		this.tituloLibro = tituloLibro;
		this.nombreAutor = nombreAutor;
		NumEjemplares = numEjemplares;
		NumEjemplaresPrestados = numEjemplaresPrestados;
	}



	public String getTituloLibro() {
		return tituloLibro;
	}


	public void setTituloLibro(String tituloLibro) {
		this.tituloLibro = tituloLibro;
	}


	public String getNombreAutor() {
		return nombreAutor;
	}


	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}


	public int getNumEjemplares() {
		return NumEjemplares;
	}


	public void setNumEjemplares(int numEjemplares) {
		NumEjemplares = numEjemplares;
	}


	public int getNumEjemplaresPrestados() {
		return NumEjemplaresPrestados;
	}


	public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
		NumEjemplaresPrestados = numEjemplaresPrestados;
	}


	public boolean prestamo() {
		if(NumEjemplares>0) {
			NumEjemplaresPrestados++;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean devolucion() {
		if(NumEjemplaresPrestados>0) {
			NumEjemplaresPrestados--;
			NumEjemplares++;
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
