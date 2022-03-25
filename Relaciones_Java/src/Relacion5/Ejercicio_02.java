package Relacion5;
import java.util.Scanner;
public class Ejercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int num=sn.nextInt();
		
		if(FuncionesMatematicas.FuncionesRelacion5.esPrimo(num)) {
			System.out.println("El número "+num+" es primo");
		}else
			System.out.println("El número "+num+" no es primo");
	}

}


