package Relacion2;

/*Escribe un programa que muestre por pantalla todos los n�meros enteros positivos menores a uno le�do por
teclado que no sean divisibles entre otro tambi�n le�do de igual forma.*/

import java.util.Scanner;

public class Ejercicio_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sn=new Scanner(System.in);
		
		System.out.println("Introduce un n�mero");
		int num=sn.nextInt();
		System.out.println("Introduce un n�mero para comprobar los n�meros que no son divisibles entre el");
		int num2=sn.nextInt();
		
		for(int i=1;i<num;i++) {
			if((i%num2)!=0) {
				System.out.println(i);
			}
		}
		

		sn.close();
	}

}
