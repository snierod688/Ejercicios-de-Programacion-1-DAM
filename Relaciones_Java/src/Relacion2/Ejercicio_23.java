package Relacion2;

/*Escribe un programa que permita ir introduciendo una serie indeterminada de n�meros mientras su suma no
supere el valor 10000. Cuando esto �ltimo ocurra, se debe mostrar el total acumulado, el contador de los
n�meros introducidos y la media.*/

import java.util.Scanner;

public class Ejercicio_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn=new Scanner(System.in);
		
		System.out.println("Introduce todos los n�meros que quieras pero cuando su suma sea 10000 no podr�s introducir m�s");
		int num=0;
		int i=0;	//para contar los num introducidos
		int suma=0;
		
		while(suma<10000) {
			System.out.println("Introduce un n�mero");
			num=sn.nextInt();
			i++;
			suma=suma+num;
			
		}
		if(suma>10000) {
			suma=suma-num;
		}
		
		System.out.println("El total de los n�meros introducidos es "+(i-1));
		System.out.println("La suma de los n�meros introducidos es "+(suma));
		System.out.println("La media de los n�meros introducidos es "+suma/(i-1));
		
		sn.close();
	}

}
