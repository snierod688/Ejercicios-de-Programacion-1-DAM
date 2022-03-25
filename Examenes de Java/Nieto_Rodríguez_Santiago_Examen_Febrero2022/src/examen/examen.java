package examen;
import java.util.Scanner;
public class examen {
	
	
	public static void imprimeTablero(int[] tablero) {
		
		int salto=0;	//contador para saltar de linea
		
		for(int i=0; i<9; i++) {
			if(tablero[i] == 1) {
				System.out.print("0  ");
			}else if(tablero[i] == 2) {
				System.out.print("X  ");
			}else if(tablero[i] == 0) {
				System.out.print("-  ");
			}
			salto++;
			if(salto == 3) {
				System.out.println("");
			}else if(salto == 6) {
				System.out.println("");
			}
		}
		
	}
	
	
	public static int[] mueveFichaAleatoria(int [] tablero) {
		
		int x1 = 0;
		int x2 = 0;
		int x3 = 0;
		
		for(int i=0; i<3; i++) {
			x1 = (int)(Math.random()*9);
			tablero[x1] = 2;
			
			x2 = (int)(Math.random()*9);
			if(tablero[x2] == tablero[x1]) {
				tablero[x2] = -1;
			}else
				tablero[x2] = 2;
			
			x3 = (int)(Math.random()*9);
			if(tablero[x3] == tablero[x1]) {
				tablero[x3] = -1;
			}else if(tablero[x3] == tablero[x2]) {
				tablero[x3] = -1;
			}else 
				tablero[x3] = 2;
			
		}
		imprimeTablero(tablero);
		
		
		return tablero;
	}
	
	
	
	
	
	
	
	
	
	
	public static int conviertePosicionMovimiento(String posicion) {
		
		String posicionMinusc = posicion.toLowerCase();
		int posicionInt = Integer.parseInt(posicionMinusc);
		
		switch (posicionMinusc) {
		case "arriba izquierda": {
			posicionInt = 0;
			break;
		}case "arriba centro":{
			posicionInt = 1;
			break;
		}case "arriba derecha":{
			posicionInt = 2;
			break;
		}case "centro izquierda":{
			posicionInt = 3;
			break;
		}case "centro centro":{
			posicionInt = 4;
			break;
		}case "centro derecha":{
			posicionInt = 5;
			break;
		}case "abajo izquierda":{
			posicionInt = 6;
			break;
		}case "abajo centro":{
			posicionInt = 7;
			break;
		}case "abajo derecha":{
			posicionInt = 8;
			break;
		}default :
			posicionInt = -1;
			break;
		
		}
		
		return posicionInt;
	}
	
	public static boolean usuarioMueveFicha(String posicion, int[] tablero) {
		
		conviertePosicionMovimiento(posicion);
		
		tablero[posicionInt] = 1;
		
		
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sn = new Scanner(System.in);

		System.out.println("¡JUGUEMOS AL 3 EN RAYA!");
		
		int [] tablero = new int [9];
		
		int x1=0, x2=0, x3=0; 	//fichas programa
		int o1=0, o2=0, o3=0;		//fichas jugador
		
		imprimeTablero(tablero);
		
		/*System.out.println("");
		System.out.println("Introduce una posición");
		String posicion = sn.nextLine();*/
		
		
		System.out.println("\nTurno del ordenador");
		mueveFichaAleatoria(tablero);
	}

}
