package Relacion2;

import java.util.Scanner;

/*Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer término de la
serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos anteriores, por lo que
tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe introducir
por teclado.*/

public class Ejercicio_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sn=new Scanner(System.in);
		
		System.out.println("¿Cuántos números de la seria de Fibonacci quieres que se muestre?");
		int num=sn.nextInt();
		int suma=0;
		int num1=0;
		int num2=1;
		System.out.println(num1);
		System.out.println(num2);
		
		for(int i=1;i<=num-2;i++) {
			suma=num1+num2;
			System.out.println(suma);
			num1=num2;
			num2=suma;
		}
		
		sn.close();
	}

}
