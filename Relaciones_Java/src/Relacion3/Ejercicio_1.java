package Relacion3;

/*Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma
total (los puntos que suman entre los tres dados)*/

public class Ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tirada1=(int)Math.floor(Math.random()*(7-1)+1);
		int tirada2=(int)Math.floor(Math.random()*(7-1)+1);
		int tirada3=(int)Math.floor(Math.random()*(7-1)+1);
		
		System.out.println("La primera tirada es: "+tirada1);
		System.out.println("La segunda tirada es: "+tirada2);
		System.out.println("La tercera tirada es: "+tirada3);
		System.out.println("La suma de las 3 tiradas es: "+(tirada1+tirada2+tirada3));
	}

}
