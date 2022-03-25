package Relacion5;

import java.util.Scanner;

public class Ejercicio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sn=new Scanner(System.in);
			
			//CALCULO DE POTENCIA
			System.out.println("Introduce la base");
			int base=sn.nextInt();
			System.out.println("Introduce exponente");
			int exp=sn.nextInt();
			
			System.out.println(FuncionesMatematicas.FuncionesRelacion5.potencia(base, exp));
			
	}

}
