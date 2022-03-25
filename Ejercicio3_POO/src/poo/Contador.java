package poo;

public class Contador {

	private int cont;
	
	
	public Contador() {
		
	}


	public Contador(int cont) {
		if(cont>0) {
			this.cont = 1;
		}
	}


	public int getCont() {
		return cont;
	}


	public void setCont(int cont) {
		this.cont = cont;
	}
	
	public int incrementar() {
		return cont++;
	}
	
	public int decrementar() {
		return cont--;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
