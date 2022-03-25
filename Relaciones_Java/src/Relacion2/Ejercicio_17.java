package Relacion2;

/*Realiza un programa que sume los 100 n�meros siguientes a un n�mero entero y positivo introducido por
teclado. Se debe comprobar que el dato introducido es correcto (que es un n�mero positivo).*/

import java.util.Scanner;

public class Ejercicio_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn=new Scanner(System.in);
		
		System.out.print("Introduce un n�mero positivo: ");
		int num=sn.nextInt();
		while(num<0) {
			System.out.print("Introduce un n�mero positivo: ");
			num=sn.nextInt();
		}
		int suma=0;
		for(int i=num;i<num+100;i++) {
			suma=suma+i;
		}
		
		System.out.println("La suma de los 100 n�meros siguientes al introducido es "+suma);
		
		sn.close();
	}

}
