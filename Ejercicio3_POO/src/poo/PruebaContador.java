package poo;
import java.util.Scanner;
public class PruebaContador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		Contador Cont1 = new Contador();
		
		System.out.println("Asignar valor al contador 1");
		int valorCont = sn.nextInt();
		Cont1.setCont(valorCont);	//asigna valor al contador
		//muestra valor del contador
		System.out.println("Valor inicial del contador 1: " + Cont1.getCont());
		
		//incrementa el contador 1 vez
		Cont1.incrementar();
		System.out.println("Valor del contador 1: " + Cont1.getCont());
		
		//incrementa el contador 2 veces
		for(int i=0; i<2; i++) {
			Cont1.incrementar();
		}
		System.out.println("Valor del contador 1: " + Cont1.getCont());
		
		//restar 1 al valor del contador
		Cont1.decrementar();
		System.out.println("Valor del contador 1: " + Cont1.getCont());
		
		//nuevo objeto Contador con valor inicial = 10
		Contador Cont2 = new Contador();
		
		Cont2.setCont(10);
		System.out.println("Valor inicial del contador 2: " + Cont2.getCont());
		
		//incrementar valor contador 2
		Cont2.incrementar();
		System.out.println("Valor del contador 2: " + Cont2.getCont());
		
		//decrementar valor contador 2
		Cont2.decrementar();
		System.out.println("Valor del contador 2: " + Cont2.getCont());
		
		//crear contador 3 como copia de contador 2
		Contador Cont3 = Cont2;
		
		//mostrar valor contador 3
		System.out.println("Valor del contador 3: " + Cont3.getCont());
		
	}

}
