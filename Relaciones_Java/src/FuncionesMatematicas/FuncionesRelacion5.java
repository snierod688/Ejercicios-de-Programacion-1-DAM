package FuncionesMatematicas;

public class FuncionesRelacion5 {

	//Función para voltear un número (ej6)
	public static int voltea(int num) {

		int acum = 0;	//variable acumuladora
		
		while(num>0) {
			int resto = num % 10;
			num = num/10;	//para resetar el numero
			acum = (acum*10) + resto;	//formula para darle la vuelta a un número
		}
		
		return acum;		
		
	}
	
	//Función para calcular la potencia de un número (ej4)
	public static int potencia(int base, int exp) {
	
		int res=1;
		
		for(int i = 1 ; i<=exp ;i++) {
			res=res*base;
		}	
	
		 return res;
	}
	
	//Función para calular el número de dígitos de un número (ej5)
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
	
	//Función para comprobar los números primos
	public static boolean esPrimo(int num) {
		
		int cont=0;	//contador para llevar conteo de las veces que el resto es 0 (si hay más de 2 veces resto 0, el número no es primo)
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


	


	