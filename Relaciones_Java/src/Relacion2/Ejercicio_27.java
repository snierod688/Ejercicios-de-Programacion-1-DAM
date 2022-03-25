package Relacion2;

/*Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay entre 1 y un número leído por
teclado.*/

import java.util.Scanner;

public class Ejercicio_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn=new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int num=sn.nextInt();
		
		int j=0;	//cuenta los números introducidos
		int suma=0; //suma los multiplos de 3
		
		for(int i=1;i<=num;i++) {
			if(i%3==0) {
				System.out.println(i);
				j++;
				suma=suma+i;
			}
			
		}
		System.out.println("Entre 1 y "+num+" hay "+j+" números que es múltiplo de 3");
		System.out.println("La suma de los números entre 1 y "+num+" es "+suma);
		
		sn.close();
	}

}
