package poo;

public class Fecha {

	private int dia;
	private int mes;
	private int ano;
	
	//constructor x defecto
	public Fecha() {
		
	}

	//constructor con parámetros
	public Fecha(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	
	public int getDia() {
		return dia;
	}


	public void setDia(int dia) {
		this.dia = dia;
	}


	public int getMes() {
		return mes;
	}


	public void setMes(int mes) {
		this.mes = mes;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean fechaCorrecta(int dia, int mes, int ano) {
		boolean correcto = false;
		
		//condicion para meses acabados en 31
		if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
			if(dia>0 && dia<=31) {
				correcto= true;
			}
			
		//condicion para meses acabados en 30
		}if(mes==4 || mes==6 || mes==9 || mes==11) {
			if(dia>0 && dia<=30) {
				correcto = true;
			}

		//codicion para febrero
		}if(mes==2) {
			if(dia>0 && dia<=28) {
				correcto = true;
			}else if(esBisiesto() == true) {
				correcto = true;
			}
		}
			
		return correcto;

		
	}

	
	private boolean esBisiesto() {
		if(mes==2 && dia==29) {
			return true;
		}else {
			return false;
		}
	}
	
	//los metodos void se utilizan cuando quiero modificar un atributo ya existente, y no quiero
	//que me devuelva un resultado
	public void diaSiguiente(int dia, int mes, int ano) {
		this.dia++;
		
		if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
			if(this.dia>31) {
				this.mes++;
				this.dia=1;
				if(this.mes>12) {
					this.ano++;
					this.mes=1;
				}
				
			}
		}
		if(mes==4 || mes==6 || mes==9 || mes==11) {
			if(this.dia>30) {
				this.mes++;
				this.dia=1;
			}
		}
		if(mes==2) {
			if(this.dia>0 && this.dia<=28) {
				this.mes++;
				this.dia=1;
			}else if(esBisiesto() == true) {
				this.mes++;
				this.dia=1;
			}
		}
		
	}
	
	
	
	@Override
	public String toString() {
		
		if(dia>0 && dia<10 && mes>0 && mes<10) {
			return "0" + dia + "-0" + mes + "-" + ano;
		
		}else if(dia>0 && dia<10) {
			return "0" + dia + "-" + mes + "-" + ano;
		
		}else if(mes>0 && mes<10) {
			return dia + "-0" + mes + "-" + ano;
		}else {
			return dia + "-" + mes + "-" + ano;
	}
	}
	
	
	
	
	
	
	
}
