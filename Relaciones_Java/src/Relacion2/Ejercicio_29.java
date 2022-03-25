package Relacion2;

/*Escribe un programa que muestre por pantalla todos los números enteros positivos menores a uno leído por
teclado que no sean divisibles entre otro también leído de igual forma.*/

import java.util.Scanner;

public class Ejercicio_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sn=new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int num=sn.nextInt();
		System.out.println("Introduce un número para comprobar los números que no son divisibles entre el");
		int num2=sn.nextInt();
		
		for(int i=1;i<num;i++) {
			if((i%num2)!=0) {
				System.out.println(i);
			}
		}
		

		sn.close();
	}

}
