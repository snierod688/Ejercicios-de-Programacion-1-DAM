package Relacion2;

/*Realiza una programa que calcule las horas transcurridas entre dos horas de dos d�as de la semana. No se
tendr�n en cuenta los minutos ni los segundos. El d�a de la semana se puede pedir como un n�mero (del 1 al
7) o como una cadena (de �lunes� a �domingo�). Se debe comprobar que el usuario introduce los datos
correctamente y que el segundo d�a es posterior al primero.*/

import java.util.Scanner;

public class Ejercicio_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sn=new Scanner(System.in);
		
		int suma=0;	//para ir sumando las horas
		int hora=0;
		int dia=0;
		
		System.out.println("Vamos a calcular las horas de un d�a a otro, los d�as van en n�mero");
		
		System.out.println("Introduce la primera hora");
		System.out.print("D�a:");
		int dia1=sn.nextInt();
		System.out.print("Hora:");
		int hora1=sn.nextInt();
		
		System.out.println("Introduce la segunda hora");
		System.out.print("D�a:");
		int dia2=sn.nextInt();
		System.out.print("Hora:");
		int hora2=sn.nextInt();
		
		while(dia1>dia2) {
			System.out.println("El segundo d�a debe ser posterior al primero");
			System.out.println("Introduce la segunda hora");
			System.out.print("D�a:");
			dia2=sn.nextInt();
			System.out.print("Hora:");
			hora2=sn.nextInt();
		}
		
		dia=dia+(dia1-dia2);
		
		for(int i=hora1; i<=hora2; i++) {
			suma=suma+i;
		}
		
		if(hora1>hora2){
			hora=hora+(hora1-hora2);
		}else
			hora=hora+(hora2-hora1);
		
		suma=suma-hora;
		System.out.println("Entre ambos d�as hay "+suma+" horas");
		
		sn.close();
	}

}
