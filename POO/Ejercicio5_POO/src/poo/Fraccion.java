package poo;

public class Fraccion {

	private int num; 	//numerador
	private int den;	//denominador
	
	
	public Fraccion() {		//constructor por defecto
		num= 0;
		den = 1;
	}
	
	public Fraccion(int num) {	//constructor con un sólo parametro
		this.num = num;
		den = 1;
	}


	public Fraccion(int num, int den) {		//constructor con parámetros
		this.num = num;
		this.den = den;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public int getDen() {
		return den;
	}


	public void setDen(int den) {
		this.den = den;
	}
	
	//Cálculo del máximo común divisor
	private int mcd() {
		int u = Math.abs(num);
		int v = Math.abs(den);
		if(v == 0) {
			return u;
		}
		
		int r;
		while(v != 0) {
			r = u % v;
			u = v;
			v = r;
		}
		return u;
	}
	
	public Fraccion sumar(Fraccion f) {
		Fraccion aux =new Fraccion();
		aux.num = num*f.den + den*f.num;
		aux.den = den * f.den;
		aux.simplificar();
		return aux;
		
	}
	
	public Fraccion restar(Fraccion f) {
		Fraccion aux = new Fraccion();
		aux.num = num*f.den - den*f.num;
		aux.den = den * f.den;
		aux.simplificar();
		return aux;
		
	}
	
	public Fraccion multiplicar(Fraccion f) {
		Fraccion aux = new Fraccion();
		aux.num = num * f.num;
		aux.den = den * f.den;
		aux.simplificar();
		return aux;
	}

	public Fraccion dividir(Fraccion f) {
		Fraccion aux = new Fraccion();
		aux.num = num * f.den;
		aux.den = den * f.num;
		aux.simplificar();
		return aux;
		
	}
	
	public void simplificar() {
		int aux = mcd();
		num = num/aux;
		den = den/aux;
		
	}
	
	
	
	
	@Override
	public String toString() {
		return  num + "/" + den ;
	}
	
	
	
	
	



	
	
	
	
	
	
	
	
	
}
