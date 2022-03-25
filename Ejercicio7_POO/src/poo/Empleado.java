package poo;

public class Empleado {

	private String nif;
	private String nombre;
	private double sueldoBase;
	private int horasExtras;
	private double irpf;
	private char casado;
	private int numeroHijos;
	private static double importeHoraExtra;

	public Empleado(String nif, String nombre, double sueldoBase, int horasExtras, double irpf, char casado,
			int numeroHijos) {
		this.nif = nif;
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		this.horasExtras = horasExtras;
		this.irpf = irpf;
		this.casado = casado;
		this.numeroHijos = numeroHijos;
	}

	public Empleado() {

	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	public double getIrpf() {
		return irpf;
	}

	public void setIrpf(double irpf) {
		this.irpf = irpf;
	}


	public char getCasado() {
		return casado;
	}

	public void setCasado(char casado) {
		this.casado = casado;
	}

	public int getNumeroHijos() {
		return numeroHijos;
	}

	public void setNumeroHijos(int numeroHijos) {
		this.numeroHijos = numeroHijos;
	}

	public static double getImporteHoraExtra() {
		return importeHoraExtra;
	}

	public static void setImporteHoraExtra(double importeHoraExtra) {
		Empleado.importeHoraExtra = importeHoraExtra;
	}

	public double calculoCompHoraExtra(int horasExtras, double importeHoraExtra) {
		double compl = 0;
		compl = horasExtras * importeHoraExtra;
		return compl;
	}
	
	public double sueldoBruto() {
		double sueldoBruto = sueldoBase + calculoCompHoraExtra(horasExtras, importeHoraExtra);
		
		return sueldoBruto;
	}
	
	public double porcentajeIRPF(double irpf) {
		if(casado=='s' || casado =='S') {
			irpf=irpf-2;
		}
		
		for(int i=0; i<numeroHijos; i++) {
			irpf--;
		}
		return irpf;
	}

	@Override
	public String toString() {
		return "NIF: " + nif + "\nNombre: " + nombre + "\nSueldo Base: " + sueldoBase + "\nHoras Extras: " + horasExtras +
				"\nTipo de IRPF: " + irpf + "\nCasado: " + casado + 
				"\nNúmero de hijos: " + numeroHijos;
	}
	
	

}
