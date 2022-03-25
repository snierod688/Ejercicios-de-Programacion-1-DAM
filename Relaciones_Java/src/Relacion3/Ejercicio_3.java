package Relacion3;

/*Realiza un programa que muestre una carta al azar de la baraja española. Está dividida en 4 palos: copas, bastos, espadas y oros. 
Se utilizará la baraja de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.*/

public class Ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int NumeroAleatorio=(int)Math.floor(Math.random()*(12-2)+2);
		
		switch (NumeroAleatorio) {
			case 2: 
				System.out.print("La carta es el 2 de ");
				break;
			case 3:
				System.out.print("La carta es el 3 de ");
				break;
			case 4:
				System.out.print("La carta es el 4 de ");
				break;
			case 5:
				System.out.print("La carta es el 5 de ");
				break;
			case 6:
				System.out.print("La carta es el 6 de ");
				break;
			case 7:
				System.out.print("La carta es el 7 de ");
				break;
			case 8:
				System.out.print("La carta es la sota de ");
				break;
			case 9: 
				System.out.print("La carta es el caballo de ");
				break;
			case 10:
				System.out.print("La carta es el rey de ");
				break;
			case 11:
				System.out.print("La carta es el as de ");
		}
		
		int PaloAleatorio=(int)Math.floor(Math.random()*(5-1)+1);
		
		switch(PaloAleatorio) {
			case 1:
				System.out.println("bastos");
				break;
			case 2:
				System.out.println("copas");
				break;
			case 3:
				System.out.println("espadas");
				break;
			case 4:
				System.out.println("oros");
		}
		
	
	}

}
