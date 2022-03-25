package Relacion2;

/*Escribe un programa que dados dos números, uno real (base) y un entero positivo(exponente), saque por
pantalla todas las potencias con base el numero dado y exponentes entre uno y el exponente introducido. No
se deben utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5, se deberán mostrar
2^1, 2^2, 2^3, 2^4 y 2^5.*/


import java.util.Scanner;

public class Ejercicio_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn=new Scanner(System.in);
		
		System.out.println("Introduce una base");
		int base=sn.nextInt();
		System.out.println("Introduce un exponente");
		int exp=sn.nextInt();
		int i=0;
		int j=0; //contador para que se haga la multiplicacion por la base
		int mult=1;
		while(i<exp) {
			i++;
			System.out.print(base+"^"+i +"=");
			while(j<i) {
				mult=mult*base;
				j++;
				
			}
			System.out.println(mult);
				
		}
		
		sn.close();
	}
	

}
