package Relacion1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn=new Scanner(System.in);
		
		final double EUROS=0.0060;
		System.out.println("Introduce una cantidad de pesetas");
		double pesetas=sn.nextDouble();
		double conver=EUROS*pesetas;
		System.out.print(pesetas+" pesetas son "+conver+" euros");
		sn.close();
	}

}
