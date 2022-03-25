package Relacion2;

//Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y cuántos son negativos.

import java.util.Scanner;

public class Ejercicio_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn=new Scanner(System.in);

		System.out.println("Escribe 10 números");
		int num;
		int i=0;
		int j=0;
		int x=0;
		
		while(i<10) {
			i++;
			System.out.println("Escribe el número "+i);
			num=sn.nextInt();
			if(num<0) {
				j++;
			}else
				x++;
			
		}
		
			System.out.println("Hay "+j+" números negativos");
		
			System.out.println("Hay "+x+" números positivos");
		                                                                                                           
		sn.close();
		
	}

}
