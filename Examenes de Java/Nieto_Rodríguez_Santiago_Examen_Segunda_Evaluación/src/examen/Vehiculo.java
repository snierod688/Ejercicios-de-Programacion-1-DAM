package examen;

import java.util.Calendar;

public class Vehiculo {

	private String marca;
	private String matricula;
	private int numeroKilometros;
	private int fechaMatriculacion;
	private String descripcion;
	private double precio;
	private String nombrePropietario;
	private String dniPropietario;
	
	public Vehiculo() {
		
	}

	public Vehiculo(String marca, String matricula, int numeroKilometros, int fechaMatriculacion, String descripcion,
			double precio, String nombrePropietario, String dniPropietario) {
		this.marca = marca;
		this.matricula = matricula;
		this.numeroKilometros = numeroKilometros;
		this.fechaMatriculacion = fechaMatriculacion;
		this.descripcion = descripcion;
		this.precio = precio;
		this.nombrePropietario = nombrePropietario;
		this.dniPropietario = dniPropietario;
	}
	
	public Vehiculo(final Vehiculo v) {
		this.marca = v.marca;
		this.matricula = v.matricula;
		this.numeroKilometros = v.numeroKilometros;
		this.fechaMatriculacion = v.fechaMatriculacion;
		this.descripcion = v.descripcion;
		this.precio = v.precio;
		this.nombrePropietario = v.nombrePropietario;
		this.dniPropietario = v.dniPropietario;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getNumeroKilometros() {
		return numeroKilometros;
	}

	public void setNumeroKilometros(int numeroKilometros) {
		this.numeroKilometros = numeroKilometros;
	}

	public int getFechaMatriculacion() {
		return fechaMatriculacion;
	}

	public void setFechaMatriculacion(int fechaMatriculacion) {
		this.fechaMatriculacion = fechaMatriculacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombrePropietario() {
		return nombrePropietario;
	}

	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}

	public String getDniPropietario() {
		return dniPropietario;
	}

	public void setDniPropietario(String dniPropietario) {
		this.dniPropietario = dniPropietario;
	}
	
	public int getAnios(int fechaMatriculacion) {
		
		Calendar hoy = Calendar.getInstance();
		int anoActual = hoy.get(Calendar.YEAR);
		
		int aniosVehiculo = 0;
		
		aniosVehiculo = anoActual - fechaMatriculacion;
		
		return aniosVehiculo;
		
	}

	@Override
	public String toString() {
		return "Marca=" + marca + "\nMatricula=" + matricula + "\nNumeroKilometros=" + numeroKilometros
				+ "\nFechaMatriculacion=" + fechaMatriculacion + "\nDescripcion=" + descripcion + "\nPrecio=" + precio
				+ "NombrePropietario=" + nombrePropietario + "\nDniPropietario=" + dniPropietario;
	}
	
	
}
