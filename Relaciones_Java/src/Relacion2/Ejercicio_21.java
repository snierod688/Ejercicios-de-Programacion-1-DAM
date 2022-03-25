package Relacion2;

/*Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo y nos diga
cuantos números se han introducido, la media de los impares y el mayor de los pares. El número negativo
sólo se utiliza para indicar el final de la introducción de datos pero no se incluye en el cómputo*/

import java.util.Scanner;

public class Ejercicio_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn=new Scanner(System.in);
		System.out.println("Escribe números y cuando no quieras introducir más, introduce un número negativo");
		
		int num=0;
		int i=0;	//contador de números introducidos
		int sumaImp=0;
		int j=0;	//contador de números impares
		int mayorPar=0;
		
		while(num>=0) {
			System.out.println("Introduce un número");
			num=sn.nextInt();
			if(num>=0) {	//si no se pone el if se cuenta al num negativo como uno de los introducidos
				i++;
				if(num%2==1) {	//para que vaya contando los num impares
					sumaImp=sumaImp+num;
					j++;
				}else if(num>mayorPar) {	//para averiguar el mayor de los pares.
					mayorPar=num;
				}
			}
		}
		System.out.println("El total de números introducidos es "+i);
		if(j>0) {
			System.out.println("La media de los impares es "+sumaImp/j);
		}
		System.out.println("El mayor de los pares es "+mayorPar);
		
		
		sn.close();
	}

}

