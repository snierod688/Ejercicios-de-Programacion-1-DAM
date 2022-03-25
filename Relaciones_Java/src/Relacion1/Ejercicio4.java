package Relacion1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sn=new Scanner(System.in);
		
		final double PESETAS=166.3860;
		System.out.println("Introduce una cantidad de euros");
		double euros=sn.nextDouble();
		double conver=PESETAS*euros;
		System.out.print(euros+" euros son "+conver+" pesetas");
		sn.close();
		
		
		
		
	}

}
