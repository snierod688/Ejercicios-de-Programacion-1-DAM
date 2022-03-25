package FuncionesMatematicas;

public class FuncionesRelacion5 {

	//Funci�n para voltear un n�mero (ej6)
	public static int voltea(int num) {

		int acum = 0;	//variable acumuladora
		
		while(num>0) {
			int resto = num % 10;
			num = num/10;	//para resetar el numero
			acum = (acum*10) + resto;	//formula para darle la vuelta a un n�mero
		}
		
		return acum;		
		
	}
	
	//Funci�n para calcular la potencia de un n�mero (ej4)
	public static int potencia(int base, int exp) {
	
		int res=1;
		
		for(int i = 1 ; i<=exp ;i++) {
			res=res*base;
		}	
	
		 return res;
	}
	
	//Funci�n para calular el n�mero de d�gitos de un n�mero (ej5)
	public static int digitos(int num) {
		
		int i=0;
		while(num != 0) {
			num = num/10;
			i++;
		}
		
		return i;
	}
	
	/*public static int digitosN(int num, int dig) {
	
	}*/
	
	//Funci�n para comprobar los n�meros primos
	public static boolean esPrimo(int num) {
		
		int cont=0;	//contador para llevar conteo de las veces que el resto es 0 (si hay m�s de 2 veces resto 0, el n�mero no es primo)
		for(int i=1; i<num; i++) {
			if(num % i == 0) {
				cont++;
				
			}
		}
		
		if(cont >= 2) {
			return false;
		}
			
		
		return true;
	}
	
	
	
}


	


	