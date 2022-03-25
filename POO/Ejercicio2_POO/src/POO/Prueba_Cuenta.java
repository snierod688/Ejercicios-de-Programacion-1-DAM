package POO;
import java.util.Scanner;
public class Prueba_Cuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sn = new Scanner(System.in);
		Cuenta Cuenta1 = new Cuenta();
		
		//introducir datos cuenta1
		System.out.println("Introduce tu nombre completo");
		String nombreCliente1 = sn.nextLine();
		Cuenta1.setNombre_cliente(nombreCliente1);
		
		System.out.println("Introduce tu número de cuenta");
		String numCuenta1 = sn.nextLine();
		Cuenta1.setNumero_cuenta(numCuenta1);
		
		System.out.println("Introduce el interés");
		double interes1 = sn.nextDouble();
		Cuenta1.setTipo_interes(interes1);
		
		System.out.println("Introduce tu saldo");
		double saldo1 = sn.nextDouble();
		Cuenta1.setSaldo(saldo1);
		
		
		//mostrar datos cuenta1
		System.out.println("\nCUENTA 1");
		System.out.println("Nombre: " + Cuenta1.getNombre_cliente());
		System.out.println("Número de cuenta: " + Cuenta1.getNumero_cuenta());
		System.out.println("Tipo de interés: " + Cuenta1.getTipo_interes());
		System.out.println("Saldo: " + Cuenta1.getSaldo() + " €");
		
		//ingreso cuenta1
		System.out.println("\nIntroduce una cantidad a ingresar");
		double cantidad_ingreso = sn.nextDouble();
		if(Cuenta1.ingreso(cantidad_ingreso)) {
			System.out.println("El ingreso se ha realizado correctamente");
		}else {
			System.out.println("El ingreso no ha podido realizarse");
		}
		
		System.out.println("Saldo actual: " + Cuenta1.getSaldo());
		
		
		
		Cuenta Cuenta2 = new Cuenta("Juan Fernández Rubio", "1234567890", 1.75, 300);
		Cuenta Cuenta3 = Cuenta1;
		
		//mostrar datos cuenta 2
		System.out.println("\nCUENTA 2");
		System.out.println("Nombre: " + Cuenta2.getNombre_cliente());
		System.out.println("Número de cuenta: " + Cuenta2.getNumero_cuenta());
		System.out.println("Tipo de interés: " + Cuenta2.getTipo_interes());
		System.out.println("Saldo: " + Cuenta2.getSaldo());
		
		//mostrar datos cuenta 3
		System.out.println("\nCUENTA 3");
		System.out.println("Nombre: " + Cuenta3.getNombre_cliente());
		System.out.println("Número de cuenta: " + Cuenta3.getNumero_cuenta());
		System.out.println("Tipo de interés: " + Cuenta3.getTipo_interes());
		System.out.println("Saldo: " + Cuenta3.getSaldo());
		
		
		//transferencia
		
		Cuenta3.transferencia(Cuenta2, 10);
		System.out.println("Saldo cuenta 3: " + Cuenta3.getSaldo());
		System.out.println("Saldo cuenta 2: " + Cuenta2.getSaldo());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
