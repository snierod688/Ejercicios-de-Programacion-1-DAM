package poo;

import java.util.Scanner;

public class PruebaFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		Fecha Fecha1 = new Fecha();
		
		
		//Pide por teclado el día, mes, año
		System.out.println("Introduce el día");
		int dia = sn.nextInt();
		Fecha1.setDia(dia);
		
		System.out.println("Introduce el mes");
		int mes = sn.nextInt();
		Fecha1.setMes(mes);
		
		System.out.println("Introduce el año");
		int ano = sn.nextInt();
		Fecha1.setAno(ano);
		
		//comprueba si la fecha es correcta
		if(Fecha1.fechaCorrecta(dia, mes, ano) == true) {
			System.out.println(Fecha1.toString()); 
			
		}else {
			System.out.println("La fecha no es correcta");
		}
		
		
		System.out.println("Los 10 días siguientes son:");
		for(int i=0; i<10; i++) {
			Fecha1.diaSiguiente(dia, mes, ano);
			
			System.out.println(Fecha1.toString());
			
			
			
		}
		
		
	}

}
