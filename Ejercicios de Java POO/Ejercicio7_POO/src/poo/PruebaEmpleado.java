package poo;

import java.util.Scanner;

public class PruebaEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);

		Empleado Empleado1 = new Empleado();

		// Se introducen los datos
		System.out.println("Introduce el NIF");
		String nif = sn.nextLine();
		Empleado1.setNif(nif);

		System.out.println("Introduce el nombre");
		String nombre = sn.nextLine();
		Empleado1.setNombre(nombre);

		System.out.println("Introduce el sueldo base");
		double sueldoBase = sn.nextDouble();
		Empleado1.setSueldoBase(sueldoBase);

		System.out.println("Introduce las horas extras");
		int horasExtras = sn.nextInt();
		Empleado1.setHorasExtras(horasExtras);

		System.out.println("Introduce el tipo de IRPF");
		double irpf = sn.nextDouble();
		Empleado1.setIrpf(irpf);
		sn.nextLine();

		System.out.println("Introduce si está casado");
		char casado = sn.nextLine().charAt(0);
		Empleado1.setCasado(casado);

		System.out.println("Introduce el número de hijos");
		int numeroHijos = sn.nextInt();
		Empleado1.setNumeroHijos(numeroHijos);

		System.out.println(Empleado1);

		System.out.println("\nIntroduce el importe de la hora extra");
		double importeHoraExtra = sn.nextDouble();
		System.out.println("El importe por hora extra es: " + importeHoraExtra);

		System.out.println("El importe total de las horas extras es: "
				+ Empleado1.calculoCompHoraExtra(horasExtras, importeHoraExtra));

		System.out.println("El irpf final es: " + Empleado1.porcentajeIRPF(irpf));

		
		Empleado Empleado2 = new Empleado();

		// Se introducen los datos
		System.out.println("Introduce el NIF");
		nif = sn.nextLine();
		Empleado2.setNif(nif);

		System.out.println("Introduce el nombre");
		nombre = sn.nextLine();
		Empleado2.setNombre(nombre);

		System.out.println("Introduce el sueldo base");
		sueldoBase = sn.nextDouble();
		Empleado2.setSueldoBase(sueldoBase);

		System.out.println("Introduce las horas extras");
		horasExtras = sn.nextInt();
		Empleado2.setHorasExtras(horasExtras);

		System.out.println("Introduce el tipo de IRPF");
		irpf = sn.nextDouble();
		Empleado2.setIrpf(irpf);
		sn.nextLine();

		System.out.println("Introduce si está casado");
		casado = sn.nextLine().charAt(0);
		Empleado2.setCasado(casado);

		System.out.println("Introduce el número de hijos");
		numeroHijos = sn.nextInt();
		Empleado2.setNumeroHijos(numeroHijos);

		System.out.println(Empleado2);

		System.out.println("\nIntroduce el importe de la hora extra");
		importeHoraExtra = sn.nextDouble();
		System.out.println("El importe por hora extra es: " + importeHoraExtra);

		System.out.println("El importe total de las horas extras es: "
				+ Empleado2.calculoCompHoraExtra(horasExtras, importeHoraExtra));

		System.out.println("El irpf final es: " + Empleado2.porcentajeIRPF(irpf));

		
		if(Empleado1.sueldoBruto()>Empleado2.sueldoBruto()) {
			System.out.println("El empleado que más cobra es el empleado 1");
			System.out.println("El empleado que menos cobra es el empleado 2");
			
		}else {
			
			System.out.println("El empleado que más cobra es el empleado 2");
			System.out.println("El empleado que menos cobra es el empleado 1");
		}
		
		if(Empleado1.calculoCompHoraExtra(horasExtras, importeHoraExtra)>
		Empleado2.calculoCompHoraExtra(horasExtras, importeHoraExtra)) {
			System.out.println("El empleado que más cobra por horas extras es el empleado 1");
			System.out.println("El empleado que menos cobra por horas extras es el empleado 2");
		}else {
			
			System.out.println("El empleado que más cobra por horas extras es el empleado 2");
			System.out.println("El empleado que menos cobra por horas extras es el empleado 1");
		}
		
		
	}

}
