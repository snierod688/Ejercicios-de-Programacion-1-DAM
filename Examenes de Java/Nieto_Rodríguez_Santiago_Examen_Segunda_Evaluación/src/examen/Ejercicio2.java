package examen;

import java.util.Scanner;

public class Ejercicio2 {

	final static int MAX_VEHICULOS = 50;
	static Vehiculo[] vehiculos = new Vehiculo[MAX_VEHICULOS];
	static int posVehiculo = 0;
	static Scanner sn = new Scanner(System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String marca = "";
		String matricula = "LIBRE";
		int numeroKilometros = 0;
		int fechaMatriculacion = 0;
		String descripcion = "";
		double precio = 0;
		String nombrePropietario = "";
		String dniPropietario = "";

		int opcion = 0;
		
		//array que crea todos los veh
		for(int i=0; i<MAX_VEHICULOS; i++) {
			vehiculos[i] = new Vehiculo();
		}
		
		do {
			
			System.out.println("\nCONCESIONARIO\n");
			System.out.println("1. Nuevo veh�culo");
			System.out.println("2. Listar veh�culos");
			System.out.println("3. Buscar veh�culos");
			System.out.println("4. Modificar kms de veh�culo");
			System.out.println("5. SALIR\n");

			System.out.println("Elige una opci�n");
			opcion = sn.nextInt();
			
			switch (opcion) {
			case 1:
				
				posVehiculo = -1;
				do {
					posVehiculo++;
				}while(!(vehiculos[posVehiculo].getMatricula()).equals("LIBRE"));
				
				sn.nextLine();
				System.out.println("Introduce la marca");
				marca = sn.nextLine();
				vehiculos[posVehiculo].setMarca(marca);
				System.out.println("Introduce la matricula");
				matricula = sn.nextLine();
				vehiculos[posVehiculo].setMatricula(matricula);
				System.out.println("Introduce el n�mero de kil�metros");
				numeroKilometros = sn.nextInt();
				vehiculos[posVehiculo].setNumeroKilometros(numeroKilometros);
				System.out.println("Introduce el a�o de matriculaci�n");
				fechaMatriculacion = sn.nextInt();
				vehiculos[posVehiculo].setFechaMatriculacion(fechaMatriculacion);
				sn.nextLine(); 	//limpia el esc�ner
				System.out.println("Introduce la descripci�n");
				descripcion = sn.nextLine();
				vehiculos[posVehiculo].setDescripcion(descripcion);
				System.out.println("Introduce el precio");
				precio = sn.nextDouble();
				vehiculos[posVehiculo].setPrecio(precio);
				sn.nextLine(); 	//limpia el esc�ner
				System.out.println("Introduce el nombre del propietario");
				nombrePropietario = sn.nextLine();
				vehiculos[posVehiculo].setNombrePropietario(nombrePropietario);
				System.out.println("Introduce el DNI del propietario");
				dniPropietario = sn.nextLine();
				vehiculos[posVehiculo].setDniPropietario(dniPropietario);
				
				break;

			case 2:
				listarVehiculo();
				break;
				
			case 3:
				buscarVehiculo(matricula);
				break;
				
			case 4:
				System.out.println("Introduce la matr�cula");
				matricula = sn.nextLine();
				System.out.println("Introduce el n�mero de kil�metros");
				numeroKilometros = sn.nextInt();
				if(actualizarKms(matricula, numeroKilometros) == true) {
					System.out.println("Se ha realizado con �xito");
				}else {
					System.out.println("No ha podido realizarse");
				}
				
				break;
			}
			
		}while(opcion != 5);

	}
	
	public static void listarVehiculo(){
		System.out.println(vehiculos);
	}
	
	
	public static boolean actualizarKms(String matricula, int numeroKilometros) {
		
		posVehiculo = -1;
		do {
			posVehiculo++;
		}while(!(vehiculos[posVehiculo].getMatricula()).equals("LIBRE"));
		
		if(matricula.equals(matricula)) {
			vehiculos[posVehiculo].setNumeroKilometros(numeroKilometros);
			return true;
		}else {
			return false;
		}
	}
	
	public static void buscarVehiculo(String matricula) {
		
		posVehiculo = -1;
		do {
			posVehiculo++;
		}while(!(vehiculos[posVehiculo].getMatricula()).equals("LIBRE"));
		
		if(matricula.equals(matricula)) {
			System.out.println(vehiculos[posVehiculo]);
		}else {
			System.out.println("El veh�culo no se ha encontrado");
		}
		
	}

}
