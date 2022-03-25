import java.util.Scanner;

public class Examen {

	final static int  TAMCIRCUITO = 11; // marca el n�mero de casillas del tablero

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);

		
		// marcan la posici�n en el tablero que ocupan las fichas de los jugadores
		int fichaJ1 = 0;
		int fichaJ2 = 0;

		// indican los n�meros m�nimos y m�ximos que pueden salir en los dados
		int minDado = 0;
		int maxDado = 0;

		// almacenan los valores de las tiradas
		int tirada1 = 0;
		int tirada2 = 0;

		// nombres de los jugadores
		String nomJ1;
		String nomJ2;

		System.out.println("�BIENVENIDOS A LA CARRERA DEL SIGLO!");
		
		System.out.println("�Cu�l es el n�mero m�nimo del dado?");
		minDado = sn.nextInt();

		System.out.println("�Cu�l es el n�mero m�ximo del dado?");
		maxDado = sn.nextInt();

		sn.nextLine();

		System.out.println("�Cu�l es el nombre del jugador 1?");
		nomJ1 = sn.nextLine();

		System.out.println("�Cu�l es el nombre del jugador 2?");
		nomJ2 = sn.nextLine();

	
		while (nomJ1.equalsIgnoreCase(nomJ2)) {
			System.out.println("Los dos jugadores no pueden llamarse igual");
			System.out.println("�Cu�l es el nombre del jugador 2?");
			nomJ2 = sn.nextLine();
			
		}
		
		
		System.out.println("�COMENCEMOS A JUGAR!");
		pintaPista(fichaJ1, fichaJ2);
		System.out.println("");
		
		do {
			
			String tecla = "";
			
			System.out.println("Pulsa cualquier tecla para avanzar a la siguiente ronda");
			tecla = sn.nextLine();
			System.out.println("");
			
			//JUGADOR 1
			
			System.out.println("Turno para el jugador 1 " + nomJ1);
			tirada1 = tiraDados(minDado, maxDado);
			System.out.println("Ha sacado un " + tirada1 + " en la primera tirada");
			tirada2 = tiraDados(minDado, maxDado);
			System.out.println("Ha sacado un " + tirada2 + " en la segunda tirada");
			
			//comprueba si ha salido primo
			if(sumaDeNumerosEsPrimo(tirada1, tirada2) == true) {
				fichaJ1 += tirada1 + tirada2;
				System.out.println("�TIRADA V�LIDA!");
				
			
				
			}else {
				System.out.println("�TIRADA NO V�LIDA!");
				System.out.println("No suma puntos ya que la suma de los dos n�meros NO ES PRIMO");
			}
			System.out.println("");
			pintaPista(fichaJ1, fichaJ2);
			System.out.println("");
			imprimeComoVaLaCarrera(nomJ1, nomJ2, fichaJ1, fichaJ2);
			System.out.println("");
			
			//JUGADOR 2
			
			System.out.println("Turno para el jugador 2 " + nomJ2);
			tirada1 = tiraDados(minDado, maxDado);
			System.out.println("Ha sacado un " + tirada1 + " en la primera tirada");
			tirada2 = tiraDados(minDado, maxDado);
			System.out.println("Ha sacado un " + tirada2 + " en la segunda tirada");
			
			//comprueba si ha salido primo
			if(sumaDeNumerosEsPrimo(tirada1, tirada2) == true) {
				fichaJ2 += tirada1 + tirada2;
				System.out.println("�TIRADA V�LIDA!");
				
				
			}else {
				System.out.println("�TIRADA NO V�LIDA!");
				System.out.println("No suma puntos ya que la suma de los dos n�meros NO ES PRIMO");
			}
			System.out.println("");
			pintaPista(fichaJ1, fichaJ2);
			System.out.println("");
			imprimeComoVaLaCarrera(nomJ1, nomJ2, fichaJ1, fichaJ2);
			System.out.println("");
			
			
			
			
		}while(esGanador(nomJ1, nomJ2, fichaJ1, fichaJ2)== "");
				

	}

	// devuelve un valor aleatorio entre los dos valores de los dados
	public static int tiraDados(int minDado, int maxDado) {
		int tiradaAleatoria = 0;
		tiradaAleatoria = (int)Math.floor(Math.random() * (minDado - maxDado) + maxDado);
		
		return tiradaAleatoria;
	}

	public static void pintaPista(int fichaJ1, int fichaJ2) {
		
		for(int i=1; i<=TAMCIRCUITO; i++) {
			System.out.print("\t" + i);
		}
		
		System.out.println("");
		for(int i=0; i<fichaJ1; i++) { 
			
			System.out.print("\t");
		}
		System.out.print("J1");
		System.out.println("");
		
		for(int i=0; i<fichaJ2; i++) {
			
			System.out.print("\t");
		}
		System.out.print("J2");
		System.out.println("");

		
		
	}
	
	//comprueba si la tirada es v�lida o no
	public static boolean sumaDeNumerosEsPrimo(int tirada1, int tirada2) {
		
		int sumaTiradas = 0;
		
		sumaTiradas = tirada1 + tirada2;
		int cont = 0;
		
		for(int i=1; i<sumaTiradas; i++) {
			
			if((sumaTiradas % i) == 0) {
				cont++;
			}
			
		}
		
		if(cont<2) {
			return true;
		}else{
			return false;
		}
		
	}
	
	//imprime que jugador va delante o si van empatados
	public static void imprimeComoVaLaCarrera(String nomJ1, String nomJ2, int fichaJ1, int fichaJ2) {
		
		if(fichaJ1>fichaJ2) {
			System.out.println("Va ganando el jugador " + nomJ1);
			
		}else if(fichaJ2>fichaJ1){
			System.out.println("Va ganando el jugador " + nomJ2);
			
		}else {
			System.out.println("�Van empatados!");
		}
		
	}
	
	
	public static String esGanador(String nomJ1, String nomJ2, int fichaJ1, int fichaJ2) {
		
		if(fichaJ1>=TAMCIRCUITO) {
			System.out.println("JUGADOR GANADOR: " + nomJ1);
			return nomJ1;
			
		}else if(fichaJ2>=TAMCIRCUITO) {
			System.out.println("JUGADOR GANADOR: " + nomJ2);
			return nomJ2;
		}else {
			return "";
		}
		
	}
	
	
	
	
	
	

}
