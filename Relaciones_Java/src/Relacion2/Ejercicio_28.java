package Relacion2;

//Escribe un programa que calcule el factorial de un número entero leído por teclado.

import java.util.Scanner;

public class Ejercicio_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sn=new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int num=sn.nextInt();
		int mult=1;	//funcion para que vaya multiplicando las i
		
		for(int i=1; i<=num;i++) {
			mult=mult*i;
		}

		System.out.println("El factorial de "+num+" es "+mult);
		
		sn.close();
	}

}
