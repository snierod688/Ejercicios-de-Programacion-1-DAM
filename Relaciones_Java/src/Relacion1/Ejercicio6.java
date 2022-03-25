package Relacion1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sn=new Scanner(System.in);
		
		System.out.println("Introduce la base imponible de la compra");
		double base_imponible=sn.nextDouble();
		final double IVA=0.21;
		double iva=IVA*base_imponible;
		double total=iva+base_imponible;
		System.out.println("El importe total es: "+total);
		sn.close();
		
		
	}

}
