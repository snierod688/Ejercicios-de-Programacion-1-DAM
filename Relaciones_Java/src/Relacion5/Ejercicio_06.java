package Relacion5;
import java.util.Scanner;
public class Ejercicio_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		
		System.out.println("Introduce un n�mero");
		int num=sn.nextInt();
		System.out.println("El n�mero "+num+" volteado es "+FuncionesMatematicas.FuncionesRelacion5.voltea(num));
	}

}
