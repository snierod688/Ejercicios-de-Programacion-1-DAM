package POO;

public class Cuenta {

	
	private String nombre_cliente;
	private String numero_cuenta;
	private double tipo_interes;
	private double saldo;

	
	
	public Cuenta() {
		
			
	}
	
	
	public Cuenta(String nombre_cliente, String numero_cuenta, double tipo_interes, double saldo) {
		
		this.nombre_cliente = nombre_cliente;
		this.numero_cuenta = numero_cuenta;
		this.tipo_interes = tipo_interes;
		this.saldo = saldo;
	}


	public String getNombre_cliente() {
		return nombre_cliente;
	}


	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}


	public String getNumero_cuenta() {
		return numero_cuenta;
	}


	public void setNumero_cuenta(String numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}


	public double getTipo_interes() {
		return tipo_interes;
	}


	public void setTipo_interes(double tipo_interes) {
		this.tipo_interes = tipo_interes;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	
	
	public boolean ingreso(double cantidad_ingreso) {
		
		if(cantidad_ingreso>0) {
			saldo = saldo + cantidad_ingreso;
			return true;
		}else {
			return false;
		}
	}

	

	
	public boolean reintegro(double cantidad_reintegro) {
		if(saldo>=cantidad_reintegro) {
			saldo = saldo - cantidad_reintegro;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transferencia(Cuenta c, double importe) {
		if(saldo>=importe) {
			reintegro(importe);	//cuenta origen
			c.ingreso(importe);	//cuenta destino
			return true;
		}else {
			return false;
		}
	}

	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
