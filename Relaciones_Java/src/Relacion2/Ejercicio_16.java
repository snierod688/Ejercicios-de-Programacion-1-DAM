package Relacion2;

/*Escribe un programa que diga si un n�mero introducido por teclado es o no primo. Un n�mero primo es
aquel que s�lo es divisible entre �l mismo y la unidad*/

import java.util.Scanner;

public class Ejercicio_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn=new Scanner(System.in);
		
		System.out.println("Introduce un n�mero");
		int num=sn.nextInt();
		int cont=0;
		
		for(int i=1;i<num;i++) {
			if((num%i)==0){
				cont++;
			}
		}
		
		if(cont<=2) {
			System.out.println("El n�mero es primo");
		}else {
			System.out.println("El n�mero no es primo");
		}
		
		sn.close();
	}
	

}
