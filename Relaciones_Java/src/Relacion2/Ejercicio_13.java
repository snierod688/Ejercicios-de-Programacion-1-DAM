package Relacion2;

//Escribe un programa que lea una lista de diez n�meros y determine cu�ntos son positivos, y cu�ntos son negativos.

import java.util.Scanner;

public class Ejercicio_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn=new Scanner(System.in);

		System.out.println("Escribe 10 n�meros");
		int num;
		int i=0;
		int j=0;
		int x=0;
		
		while(i<10) {
			i++;
			System.out.println("Escribe el n�mero "+i);
			num=sn.nextInt();
			if(num<0) {
				j++;
			}else
				x++;
			
		}
		
			System.out.println("Hay "+j+" n�meros negativos");
		
			System.out.println("Hay "+x+" n�meros positivos");
		                                                                                                           
		sn.close();
		
	}

}
