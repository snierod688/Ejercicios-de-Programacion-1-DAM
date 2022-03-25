package Relacion2;
/*Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado. A
priori, el programa no sabe cuántos números se introducirán. El usuario indicará que ha terminado de
introducir los datos cuando meta un número negativo.*/

import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sn=new Scanner(System.in);
		int i=0;
		int res=0;
		System.out.println("Introduce números y cuando introduzcas un número negativo el programa finalizará");
		int num=sn.nextInt();
		while(num>=0) {
			num=sn.nextInt();
			if(num>0){
				i++;
				res=res+num;
			}
			
		}
			
			int total=res/i;
			System.out.println("La media es "+total);
		
		sn.close();
	}

}
