package Relacion2;

//Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la potencia.

import java.util.Scanner;

public class Ejercicio_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn=new Scanner(System.in);
		
		System.out.println("Escribe una base");
		int base=sn.nextInt();
		System.out.println("Escribe un exponente");
		int exp=sn.nextInt();
		System.out.println(Math.pow(base, exp));
		
		sn.close();
	}

}
