package examen;

import java.util.Scanner;

public class Concesionario {

	static Vehiculo v1 = new Vehiculo();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		
		String marca = "";
		String matricula = "";
		int numeroKilometros = 0;
		int fechaMatriculacion = 0 ;
		String descripcion = "";
		double precio = 0;
		String nombrePropietario = "";
		String dniPropietario = "";
		
		int opcion =0;
		
		do {
			
			System.out.println("\nCONCESIONARIO\n");
			System.out.println("1. Nuevo Veh�culo");
			System.out.println("2. Ver matricula");
			System.out.println("3. Ver n�mero de kil�metros");
			System.out.println("4. Actualizar kil�metros");
			System.out.println("5. Ver a�os de antig�edad");
			System.out.println("6. Motrar propietario");
			System.out.println("7. Mostrar descripci�n");			
			System.out.println("8. Mostrar precio");
			System.out.println("9. Salir\n");
			
			System.out.println("Elige una opci�n");
			opcion = sn.nextInt();
			
			
			switch (opcion) {
			case 1:
				
				sn.nextLine();
				System.out.println("Introduce la marca");
				marca = sn.nextLine();
				System.out.println("Introduce la matricula");
				matricula = sn.nextLine();
				System.out.println("Introduce el n�mero de kil�metros");
				numeroKilometros = sn.nextInt();
				System.out.println("Introduce el a�o de matriculaci�n");
				fechaMatriculacion = sn.nextInt();
				sn.nextLine(); 	//limpia el esc�ner
				System.out.println("Introduce la descripci�n");
				descripcion = sn.nextLine();
				System.out.println("Introduce el precio");
				precio = sn.nextDouble();
				sn.nextLine(); 	//limpia el esc�ner
				System.out.println("Introduce el nombre del propietario");
				nombrePropietario = sn.nextLine();
				System.out.println("Introduce el DNI del propietario");
				dniPropietario = sn.nextLine();
				
				if(nuevoVehiculo(matricula, numeroKilometros, dniPropietario) == true) {
					v1.setMarca(marca);
					v1.setMatricula(matricula);
					v1.setNumeroKilometros(numeroKilometros);
					v1.setFechaMatriculacion(fechaMatriculacion);
					v1.setDescripcion(descripcion);
					v1.setPrecio(precio);
					v1.setNombrePropietario(nombrePropietario);
					v1.setDniPropietario(dniPropietario);

					System.out.println("El veh�culo se ha creado correctamente");
				}else {
					System.out.println("ERROR");
				}
				
				break;
				
			case 2:
				if(!matricula.equals("")) {
					System.out.println("Matr�cula: " + v1.getMatricula());
				}else {
					System.out.println("No se ha creado el veh�culo");
				}
				
				
				break;
				
			case 3:
				if(!matricula.equals("")) {
					System.out.println("N�mero de kil�metros: " + v1.getNumeroKilometros());
				}else {
					System.out.println("No se ha creado ning�n veh�culo");

				}
				break;
				
			case 4:
				
				System.out.println("Introduce los kilometros actuales");
				numeroKilometros = sn.nextInt();
				if(!matricula.equals("")) {
					v1.setNumeroKilometros(numeroKilometros);
				}else {
					System.out.println("No se ha creado ning�n veh�culo");

				}
				break;
				
			case 5:
				if(!matricula.equals("")) {
					System.out.println("A�os de antig�edad: " + v1.getAnios(fechaMatriculacion));
				}else {
					System.out.println("No se ha creado nig�n veh�culo");
				}
				
				break;

			case 6:
				if(!matricula.equals("")) {
					System.out.println("Nombre del propietario: " + v1.getNombrePropietario());
					System.out.println("DNI del propietario: " + v1.getDniPropietario());
				}else {
					System.out.println("No se ha creado nig�n veh�culo");
				}
				break;
				
			case 7:
				if(!matricula.equals("")) {
					System.out.println("Descripci�n: " + v1.getDescripcion());
				}else {
					System.out.println("No se ha creado nig�n veh�culo");
				}
				
				break;
			
			case 8:
				if(!matricula.equals("")) {
					System.out.println("Precio: " + v1.getPrecio());
				}else {
					System.out.println("No se ha creado nig�n veh�culo");
				}
				
				break;
			}
			
			
		}while(opcion != 9);
		
		System.out.println("ADIOS");
	}

	public static boolean nuevoVehiculo(String matricula, int numeroKilometros, /*Fecha fechaMatriculacion,*/ String dniPropietario) {
		
		if(matricula.length() == 8 && numeroKilometros>=0 && dniPropietario.length() == 9) {
			return true;
		}else {
			return false;
		}
		
		
		
	}
}


	
	
	
	
	
	
