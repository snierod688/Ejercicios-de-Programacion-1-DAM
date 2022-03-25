package Relacion2;
//Muestra la tabla de multiplicar de un número introducido por teclado.

import java.util.Scanner;

public class Ejercicio_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn=new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int num=sn.nextInt();
		int mult=0;
		int res=0;
		
		while(mult<=10) {
			System.out.println(res);
			mult++;
			res=num*mult;
			
		}
		sn.close();
	}
	

}
