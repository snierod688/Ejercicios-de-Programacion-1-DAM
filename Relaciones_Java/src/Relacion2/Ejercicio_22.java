package Relacion2;

//Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.

public class Ejercicio_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cont=0;
		
		for(int num=2; num<100;num++) {
			cont=0;
			for(int i=2; i<num; i++) {		//i=2 pq empezamos a dividir a partir de 2. Dividimos los números entre 1 y el num sin contarlos por 
											//eso el pq del cont=0
				if(num%i==0) {
					cont++;
					
				}
			}// fin del bucle que comprueba si es primo
			if (cont==0) {	
				System.out.println(num);
				
			}
		}
		
		
	}

}
