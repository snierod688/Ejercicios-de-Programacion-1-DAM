package Relacion2;

import java.util.Scanner;

public class Ejercicio_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn=new Scanner(System.in);
		int num=0;
		//int clave=4321;
		//System.out.println(clave);
		
		
		for (int i=1;i<=4;i++)
		{
			System.out.println("Introduce la clave para abrir la caja"
					+" fuerte");
			num=sn.nextInt();
			if (num==4321){
				
				System.out.println("La caja fuerte se ha abierto"
						+ " satisfactoriamente");
				i=20;
			}else {
				System.out.println("Lo siento, esa no es la combinación");
				
		}
			
	}
		sn.close();
	

}
}
