package Relacion2;
/*Escribe un programa que calcule la media de un conjunto de n�meros positivos introducidos por teclado. A
priori, el programa no sabe cu�ntos n�meros se introducir�n. El usuario indicar� que ha terminado de
introducir los datos cuando meta un n�mero negativo.*/

import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sn=new Scanner(System.in);
		int i=0;
		int res=0;
		System.out.println("Introduce n�meros y cuando introduzcas un n�mero negativo el programa finalizar�");
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
