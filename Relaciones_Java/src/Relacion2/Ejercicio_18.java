package Relacion2;

/*Escribe un programa que obtenga los n�meros enteros comprendidos entre dos n�meros introducidos por
teclado y validados como distintos, el programa debe empezar por el menor de los enteros introducidos e ir
incrementando de 7 en 7.*/

import java.util.Scanner;

public class Ejercicio_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn=new Scanner(System.in);
		
		System.out.println("Introduce un n�mero");
		int num1=sn.nextInt();
		System.out.println("Introduce otro n�mero");
		int num2=sn.nextInt();
		while(num1==num2) {
			System.out.println("El segundo n�mero debe ser distinto del primero, vuelve a introducir el segundo");
			num2=sn.nextInt();
		}
			
		if(num1<num2) {
			for(int i=num1;i<=num2;i=i+7) {
				System.out.print(i+", ");
			}
		}else if(num1>num2) {
			for(int j=num2;j<=num1;j=j+7) {
				System.out.print(j+", ");
			}
			
		}
		System.out.print("son los n�meros enteros entre "+num1+" y "+num2+" de 7 en 7");
		
		
		sn.close();
	}

}
