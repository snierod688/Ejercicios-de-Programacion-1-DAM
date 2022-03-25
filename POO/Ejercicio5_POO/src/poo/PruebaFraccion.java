package poo;

public class PruebaFraccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creación de las 4 fracciones
		Fraccion f1 = new Fraccion(1, 4);
		Fraccion f2 = new Fraccion(1, 2);
		Fraccion f3 = new Fraccion();
		Fraccion f4 = new Fraccion(4);
		
		System.out.println(f1 + " + " + f2 + " = " + f1.sumar(f2));
		System.out.println(f1 + " - " + f3 + " = " + f1.restar(f3));
		System.out.println(f1 + " * " + f4 + " = " + f1.multiplicar(f4));
		System.out.println(f1 + " / " + f2 + " = " + f1.dividir(f2));
		
		
	}

}
