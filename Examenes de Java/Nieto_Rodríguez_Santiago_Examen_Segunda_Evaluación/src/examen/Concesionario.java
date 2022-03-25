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
			System.out.println("1. Nuevo Vehículo");
			System.out.println("2. Ver matricula");
			System.out.println("3. Ver número de kilómetros");
			System.out.println("4. Actualizar kilómetros");
			System.out.println("5. Ver años de antigüedad");
			System.out.println("6. Motrar propietario");
			System.out.println("7. Mostrar descripción");			
			System.out.println("8. Mostrar precio");
			System.out.println("9. Salir\n");
			
			System.out.println("Elige una opción");
			opcion = sn.nextInt();
			
			
			switch (opcion) {
			case 1:
				
				sn.nextLine();
				System.out.println("Introduce la marca");
				marca = sn.nextLine();
				System.out.println("Introduce la matricula");
				matricula = sn.nextLine();
				System.out.println("Introduce el número de kilómetros");
				numeroKilometros = sn.nextInt();
				System.out.println("Introduce el año de matriculación");
				fechaMatriculacion = sn.nextInt();
				sn.nextLine(); 	//limpia el escáner
				System.out.println("Introduce la descripción");
				descripcion = sn.nextLine();
				System.out.println("Introduce el precio");
				precio = sn.nextDouble();
				sn.nextLine(); 	//limpia el escáner
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

					System.out.println("El vehículo se ha creado correctamente");
				}else {
					System.out.println("ERROR");
				}
				
				break;
				
			case 2:
				if(!matricula.equals("")) {
					System.out.println("Matrícula: " + v1.getMatricula());
				}else {
					System.out.println("No se ha creado el vehículo");
				}
				
				
				break;
				
			case 3:
				if(!matricula.equals("")) {
					System.out.println("Número de kilómetros: " + v1.getNumeroKilometros());
				}else {
					System.out.println("No se ha creado ningún vehículo");

				}
				break;
				
			case 4:
				
				System.out.println("Introduce los kilometros actuales");
				numeroKilometros = sn.nextInt();
				if(!matricula.equals("")) {
					v1.setNumeroKilometros(numeroKilometros);
				}else {
					System.out.println("No se ha creado ningún vehículo");

				}
				break;
				
			case 5:
				if(!matricula.equals("")) {
					System.out.println("Años de antigüedad: " + v1.getAnios(fechaMatriculacion));
				}else {
					System.out.println("No se ha creado nigún vehículo");
				}
				
				break;

			case 6:
				if(!matricula.equals("")) {
					System.out.println("Nombre del propietario: " + v1.getNombrePropietario());
					System.out.println("DNI del propietario: " + v1.getDniPropietario());
				}else {
					System.out.println("No se ha creado nigún vehículo");
				}
				break;
				
			case 7:
				if(!matricula.equals("")) {
					System.out.println("Descripción: " + v1.getDescripcion());
				}else {
					System.out.println("No se ha creado nigún vehículo");
				}
				
				break;
			
			case 8:
				if(!matricula.equals("")) {
					System.out.println("Precio: " + v1.getPrecio());
				}else {
					System.out.println("No se ha creado nigún vehículo");
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


	
	
	
	
	
	
