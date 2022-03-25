package Relacion2;

import java.util.Scanner;
/*Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros números enteros
a partir de uno que se introduce por teclado.*/

public class Ejercicio_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn=new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int num=sn.nextInt();
		
		for(int x=num;x<num+5;x++) {
			System.out.println(x+" "+x*x+" "+x*x*x);
		}
			
		
		sn.close();
	}

}