package Relacion2;
//Realiza un programa que nos diga cu�ntos d�gitos 
//tiene un n�mero introducido por teclado.

import java.util.Scanner;

public class Ejercicio_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn=new Scanner(System.in);
		
		System.out.println("Introduce un n�mero");
		int num=sn.nextInt();
		int i=0;
		
		while(num!=0) {
			num=num/10;  //divido hasta que el divisor sea 0
			i++;		// por cada divisi�n, el contador aumenta-
		}
		if (i>1) {
			System.out.println("El n�mero tiene "+i+" cifras");
		}else {
			if(i<=1){
				System.out.println("El n�mero tiene "+i+" cifra");
			}
		}

			
		
		
		
		
		sn.close();
	}

}
