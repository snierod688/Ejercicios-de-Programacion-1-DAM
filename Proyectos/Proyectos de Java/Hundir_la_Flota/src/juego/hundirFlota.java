package juego;
import java.util.Scanner;
import java.util.Random;
public class hundirFlota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sn = new Scanner(System.in);

		int[][] tableroUsuario;		//tablero usuario
		tableroUsuario = new int[10][10];
		tableroUsuario = inicializarMatriz(tableroUsuario);

		int[][] tableroOrdenador;		//tablero ordenador
		tableroOrdenador = new int[10][10];
		tableroOrdenador = inicializarMatriz(tableroOrdenador);
		
		int [][] tableroTiradasUsuario;
		tableroTiradasUsuario = new int [10][10];
		tableroTiradasUsuario = inicializarMatriz(tableroTiradasUsuario);
		
		int [][] tableroTiradasOrdenador;
		tableroTiradasOrdenador = new int [10][10];
		tableroTiradasOrdenador = inicializarMatriz(tableroTiradasOrdenador);
		
		//PONE LOS BARCOS
		tableroUsuario = ponerBarcos(tableroUsuario);
		tableroOrdenador = ponerBarcos(tableroOrdenador);
		
		System.out.println("La colocación de tus barcos es:\n");
		imprimirTablero(tableroUsuario, tableroTiradasOrdenador);
		
		int puntosUsuario = 24;
		int puntosOrdenador = 24;
		int tiradaFila;
		int tiradaColumna;
		Random tiradaOrdenador = new Random();
		
		do {
			
			System.out.println("\nREGISTRO DEL MAPA DEL ORDENADOR:");
			imprimirTableroTiradas(tableroTiradasOrdenador);
			System.out.println("PUNTOS RESTANTES DEL ORDENADOR: " + puntosOrdenador);
			
			//turno del jugador
			System.out.println("\nTE TOCA");
			System.out.println("INTRODUCE LA FILA");
			tiradaFila = sn.nextInt();
			System.out.println("INTRODUCE LA COLUMNA");
			tiradaColumna = sn.nextInt();
			
			if(tableroOrdenador[tiradaFila][tiradaColumna]>0) {
				puntosOrdenador--;
				tableroOrdenador[tiradaFila][tiradaColumna] = -1;		//para que no vuelva a contar la misma tirada
				tableroTiradasUsuario[tiradaFila][tiradaColumna] = 2;	//pone una X
			
			}else {
				tableroTiradasUsuario[tiradaFila][tiradaColumna] = 1;	//pone una A
			}
			
			imprimirTableroTiradas(tableroTiradasUsuario);
			
			//turno del ordenador
			System.out.println("\nTURNO DEL ORDENADOR");
			tiradaFila = tiradaOrdenador.nextInt(10);
			tiradaColumna = tiradaOrdenador.nextInt(10);
			System.out.println("EL ORDENADOR HA TIRADO EN LA FILA " + tiradaFila + " Y EN LA COLUMNA " + tiradaColumna);
			System.out.println("TU MAPA QUEDA ASÍ POR AHORA\n");
			if(tableroUsuario[tiradaFila][tiradaColumna]>0) {
				puntosUsuario--;
				tableroOrdenador[tiradaFila][tiradaColumna] = 2;		//para que no vuelva a contar la misma tirada
				tableroUsuario[tiradaFila][tiradaColumna] = -1 ;	//pone una X
			}else {
				tableroTiradasOrdenador[tiradaFila][tiradaColumna] = 1;		//pone una A
			}
			imprimirTablero(tableroUsuario, tableroTiradasOrdenador);
			System.out.println("TE QUEDAN " + puntosUsuario + " PUNTOS");
			
		}while(puntosUsuario>0 && puntosOrdenador>0);
		
		if(puntosUsuario>puntosOrdenador) {
			System.out.println("¡FELICIDADES!");
			System.out.println("¡HAS GANADO!");
		}else {
			System.out.println("LO SIENTO, HAS PERDIDO");
		}
		
		sn.close();
		
		
		
		
		
	}

	

	//inicializa la matriz
	public static int[][] inicializarMatriz(int[][] tablero) {

		int fila, columna;

		for (fila = 0; fila < 10; fila++) {

			for (columna = 0; columna < 10; columna++) {
				tablero[fila][columna] = 0;
			}
		}

		return tablero;
	}

	//imprime el tablero
	public static void imprimirTablero(int[][] tablero, int[][] tableroTiradas) {

		char[] letras = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' };
		int fila;
		int columna;

		System.out.print("   ");
		for (columna = 0; columna < 10; columna++) {
			System.out.print("[" + columna + "]");
		}

		System.out.println("");
		for (fila = 0; fila < 10; fila++) {
			System.out.print("[" + letras[fila] + "] ");

			for (columna = 0; columna < 10; columna++) {
				
				if(tableroTiradas[fila][columna] == 0) {
					if(tablero[fila][columna] == 0) {
						System.out.print(" . ");
					}else {
						System.out.print(" " + tablero[fila][columna] + " ");
					}
				}else {
					System.out.print(" X ");
				}
				
			}
			System.out.println("");
		}

	}
	
	
	public static void imprimirTableroTiradas(int[][] tableroTiradas) {
		
		char[] letras = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' };
		int fila;
		int columna;

		System.out.print("   ");
		for (columna = 0; columna < 10; columna++) {
			System.out.print("[" + columna + "]");
		}

		System.out.println("");
		for (fila = 0; fila < 10; fila++) {
			System.out.print("[" + letras[fila] + "] ");

			for (columna = 0; columna < 10; columna++) {
				
				if(tableroTiradas[fila][columna] == 0) {
					System.out.print(" . ");
				}else if(tableroTiradas[fila][columna] == 2) {
					System.out.print(" X ");
				}else if(tableroTiradas[fila][columna] == 1) {
					System.out.print(" A ");
				}
			}
			System.out.println("");
		}
		
	}
	
	


	//rellena el tablero con los barcos
	public static int[][] ponerBarcos(int[][] tablero) {

		int fila, columna;
		int posFila; 		// posición del barco en la fila
		int posColumna; 	// posición del barco en la columna
		int barco5 = 2;
		int barco3 = 3;
		int barco1 = 5;
		int posicion;
		boolean correcto;

		
		//para barcos de 5 casillas
		do {

			posicion = (int) (Math.random() * 2);
			correcto = true;

			if (barco5 > 0) {
				if (posicion == 0) { // barcos en horizontal
					posColumna = ((int) (Math.random() * 6));
					posFila = ((int) Math.random() * 10);

				} else { // barcos en vertical
					posFila = ((int) (Math.random() * 6));
					posColumna = ((int) (Math.random() * 10));
				}

				if (comprobarBarco(posicion, posFila, posColumna, tablero, 5)) {
					tablero = rellenarBarco(posicion, posFila, posColumna, tablero, 5);
					barco5--;
				}

			}

		} while (barco5 > 0 );

		
		//para barcos de 3 casillas
		while(barco3>0) {
			
			posicion = (int) (Math.random() * 2);
			correcto = true;
			
			if (posicion == 0) { // barcos en horizontal
				posColumna = ((int) (Math.random() * 8));
				posFila = ((int) Math.random() * 10);

			} else { // barcos en vertical
				posFila = ((int) (Math.random() * 8));
				posColumna = ((int) (Math.random() * 10));
			}

			if (comprobarBarco(posicion, posFila, posColumna, tablero, 3)) {
				tablero = rellenarBarco(posicion, posFila, posColumna, tablero, 3);
				barco3--;
			}
			
		}
		
		//para barcos de 1 casilla
		while(barco1>0) {
			
			posicion = (int) (Math.random() * 2);
			correcto = true;
			
			if (posicion == 0) { 				// barcos en horizontal
				posColumna = ((int) (Math.random() * 10));
				posFila = ((int) Math.random() * 10);

			} else { 							// barcos en vertical
				posFila = (int) (Math.random() * 10);
				posColumna = (int) (Math.random() * 10);
			}

			if (comprobarBarco(posicion, posFila, posColumna, tablero, 1)) {
				tablero = rellenarBarco(posicion, posFila, posColumna, tablero, 1);
				barco1--;
			}
			
		}
		
		
		return tablero;
	}

	//comprueba si ya hay barcos colocados en una posicion	
	public static boolean comprobarBarco(int posicion, int posFila, int posColumna, int[][] tablero, int tamanoBarco) {
		
		boolean correcto;
		int columna;
		correcto = true;
		
		if (posicion == 0) {		//barco en horizontal
			for (columna = posColumna; columna < posColumna + tamanoBarco; columna++) {
				if (tablero[posFila][columna] > 0) {
					correcto = false;
				}
			}
			
		} else { 					//barco en vertical
			for (columna = posFila; columna < posFila + tamanoBarco; columna++) {
				if (tablero[columna][posColumna] > 0) {
					correcto = false;
				}
			}
		}
		
		return correcto;
	}

	public static int[][] rellenarBarco(int posicion, int posFila, int posColumna, int[][] tablero, int tamanoBarco) {
		
		int columna;
		
		if (posicion == 0) {	//barco en horizontal
			for (columna = posColumna; columna < posColumna + tamanoBarco; columna++) {
				tablero[posFila][columna] = tamanoBarco;
			}
			
		} else { 				//barco en vertical
			for (columna = posFila; columna < posFila + tamanoBarco; columna++) {
				tablero[columna][posColumna] = tamanoBarco;
			}
		}
		
		return tablero;
	}
	
	


	
	
	
	
	
	
	
}
