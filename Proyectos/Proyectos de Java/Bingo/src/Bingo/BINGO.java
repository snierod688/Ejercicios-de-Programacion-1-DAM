package Bingo;

import java.util.Scanner;

public class BINGO {
	
	//función para inicializar e imprimir el tablero antes de comenzar el juego 
	public static int[][] mostrar_tablero() {
		int tablero[][];
		tablero = new int[3] [5];
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				tablero[i][j]=(int)Math.floor(Math.random()*9+1)+(j*10);
				System.out.print(tablero[i][j]+" | ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		return tablero;
	}
	
	//función para imprimir el tablero una vez se ha sacado la bola
	public static int[][] tablero_juego(int[][]tablero){
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				if(tablero[i][j]==-1) {
					System.out.print("X ");	
				}else {
					System.out.print(tablero[i][j]+" ");
					
				}if(tablero[i][j]<10) {
					System.out.print(" ");
				}
				System.out.print("|");
			}
			
			System.out.println(" ");
		}
		System.out.println(" ");
		
		return tablero;
	}
	
	//función para tachar el número que ha salido
	public static int[][] tachar_numero(int[][]tablero, int sacar_bola){
		int[][]tachar_tablero;
		tachar_tablero = tablero;
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				if(tachar_tablero[i][j] == sacar_bola) {	//comprueba si la bola que ha salido está en el tablero
					tachar_tablero[i][j]=-1;				//para saber que el num en el tablero está tachado
				}
			}
		}
		return tachar_tablero;
	}
	
	//función para comprobar si el tablero está tachado o no
	public static boolean todo_tachado(int[][]tablero) {
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				if(tablero[i][j] != -1) {		//comprueba si el tablero no está tachado
					return false;
				}
			}
		}
		return true;
	}
	
	//función para controlar el premio de las líneas
	public static boolean premio_linea(int[][]tablero) {
		boolean linea_tachada = true;
		for(int i=0; i<3; i++) {
			linea_tachada = true;
			for(int j=0; j<5; j++) {
				if(tablero[i][j] != -1) {
					linea_tachada = false;
				}
			}
			if(linea_tachada) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sn=new Scanner(System.in);

		System.out.println("***** BINGO IES MARTINEZ MONTAÑÉS *****");
		System.out.println("               PREMIOS");
		System.out.println("            LÍNEA: 100 $");
		System.out.println("            BINGO: 500 $");
		System.out.println("");
		System.out.println("Pulse cualquier tecla para continuar");
		String tecla_inicio=sn.next();
		
		boolean sale_linea = false;	//boleano para controlar la línea que se canta
		int premio_jugador1 = 0;	//acumulador del dinero del j1
		int premio_jugador2 = 0;	//acumulador del dinero del j2
		
		int tablero1[][];
		tablero1 = new int[3][5];
		System.out.println("-----------------------");
		System.out.println("       Jugador 1");
		System.out.println("-----------------------");
		tablero1 = mostrar_tablero();

		int tablero2[][];
		tablero2 = new int[3][5];
		System.out.println("-----------------------");
		System.out.println("       Jugador 2");
		System.out.println("-----------------------");
		tablero2 = mostrar_tablero();
		
		
		//bucle para sacar bolas y que los jugadores vayan tachando los números que salen si los tienen
	
		
		do {
			System.out.println("Pulse cualquier tecla para sacar una bola");
			String tecla_bola=sn.next();
			int bola_sacada=(int)Math.floor(Math.random()*(1-50)+50);	
			System.out.println("Ha salido el número "+bola_sacada);
			
			tablero1 = tachar_numero(tablero1, bola_sacada);
			tablero2 = tachar_numero(tablero2, bola_sacada);
			System.out.println("-----------------------");
			System.out.println("       Jugador 1");
			System.out.println("-----------------------");
			tablero_juego(tablero1);
			System.out.println("-----------------------");
			System.out.println("       Jugador 2");
			System.out.println("-----------------------");
			tablero_juego(tablero2);
			
			
			
			
			//comprobar si no se ha cantado línea y de si se se ha cantado bingo en el jugador 1
			if(!todo_tachado(tablero1)) {
				if(!sale_linea && premio_linea(tablero1)) {	//comprueba si se ha cantado línea y en cuyo caso se dará el premio
					premio_jugador1 += 100;
					sale_linea = true;
					System.out.println("El jugador 1 ha cantado línea");
					System.out.println("Dinero acumulado");
					System.out.println("----------------");
					System.out.println("Jugador 1: "+premio_jugador1+" $");
					System.out.println("Jugador 2: "+premio_jugador2+" $");
					
				}
			}else {
				System.out.println("El jugador 1 ha cantado BINGO");
				premio_jugador1 += 500;
			}
			
			if(!todo_tachado(tablero2)) {
				if(!sale_linea && premio_linea(tablero2)) {
					premio_jugador2 += 100;
					sale_linea = true;
					System.out.println("El jugador 2 ha cantado línea");
					System.out.println("Dinero acumulado");
					System.out.println("----------------");
					System.out.println("Jugador 1: "+premio_jugador1+" $");
					System.out.println("Jugador 2: "+premio_jugador2+" $");
					
				}
			}else {
				System.out.println("El jugador 2 ha cantado BINGO");
				premio_jugador1 += 500;
			}
				
		}while(!todo_tachado(tablero1) && !todo_tachado(tablero2));
				
		
		System.out.println("Dinero acumulado");
		System.out.println("----------------");
		System.out.println("Jugador 1: "+premio_jugador1+" $");
		System.out.println("Jugador 2: "+premio_jugador2+" $");
		
		sn.close();
		
	}
}
			
		
		
		
	
	



