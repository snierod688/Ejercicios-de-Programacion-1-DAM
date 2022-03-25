package Relacion2;

/*Realiza un programa que vaya pidiendo n�meros hasta que se introduzca un numero negativo y nos diga
cuantos n�meros se han introducido, la media de los impares y el mayor de los pares. El n�mero negativo
s�lo se utiliza para indicar el final de la introducci�n de datos pero no se incluye en el c�mputo*/

import java.util.Scanner;

public class Ejercicio_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn=new Scanner(System.in);
		System.out.println("Escribe n�meros y cuando no quieras introducir m�s, introduce un n�mero negativo");
		
		int num=0;
		int i=0;	//contador de n�meros introducidos
		int sumaImp=0;
		int j=0;	//contador de n�meros impares
		int mayorPar=0;
		
		while(num>=0) {
			System.out.println("Introduce un n�mero");
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
		System.out.println("El total de n�meros introducidos es "+i);
		if(j>0) {
			System.out.println("La media de los impares es "+sumaImp/j);
		}
		System.out.println("El mayor de los pares es "+mayorPar);
		
		
		sn.close();
	}

}

