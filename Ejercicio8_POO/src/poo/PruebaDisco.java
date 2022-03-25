package poo;

import java.util.Scanner;

public class PruebaDisco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		
		String autor;
		String titulo;
		String genero;
		double duracion;
		String codigo; 
		int posLibre;		//primera posición libre en el array para crar nuevos discos
		int posModificar;	//busca la posicion del codigo que hemos introducido para cambiar los datos
		int posBorrar;		//busca la posicion del codigo que hemos introducido para borrar sus datos
		
		int numDiscos;	//se elige el numero de discos del array
		
		System.out.println("Introduce el número de discos");
		numDiscos = sn.nextInt();
		
		//array de los discos
		Disco discos[] = new Disco [numDiscos];
		
		sn.nextLine();
		
		//crea todos los discos que van en el array
		for(int i=0; i<discos.length; i++) {
			discos[i] = new Disco();
		}
		
		int numSelec;	//numero que se introduce por teclado para que se ejecute una opción
		do {
			
		System.out.println("COLECCIÓN DE DISCOS");
		System.out.println("===================");
		
		System.out.println("1. Listado");
		System.out.println("2. Nuevo Disco");
		System.out.println("3. Modificar");
		System.out.println("4. Borrar");
		System.out.println("5. Salir");	
		
		System.out.println("\nSelecciona una opción");
		numSelec = sn.nextInt();
		
		sn.nextLine();
		
		switch (numSelec) {
		case 1:
			System.out.println("\nLISTADO");
			System.out.println("========");
			for(int i=0; i<discos.length; i++) {
				if(!(discos[i].getCodigo().equals("LIBRE"))) {	//si el código no es libre=imprime los discos
					System.out.println("DISCO " + (i+1) + ":");
					System.out.println(discos[i]);
					System.out.println("");
				}
				
			}
			break;
			
		case 2:
			
			posLibre = -1;	//para posicionarse fuera del array
	        do {
	          posLibre++;
	          
	        } while ((!(discos[posLibre].getCodigo()).equals("LIBRE")));
	        
			System.out.println("\nNUEVO DISCO");
			System.out.println("===========");
			System.out.println("Introduce los datos del disco:");
			
			System.out.println("Introduce el código");
			codigo = sn.nextLine();
			discos[posLibre].setCodigo(codigo);
			
			System.out.println("Introudce el autor");
			autor = sn.nextLine();
			discos[posLibre].setAutor(autor);
			
			System.out.println("Introduce el título");
			titulo = sn.nextLine();
			discos[posLibre].setTitulo(titulo);
			
			System.out.println("Introduce el género");
			genero = sn.nextLine();
			discos[posLibre].setGenero(genero);
			
			System.out.println("Introduce la duración");
			duracion = sn.nextDouble();
			discos[posLibre].setDuracion(duracion);
			
			sn.nextLine();	//limpia el escaner
			
			
			break;

		case 3:
			
			System.out.println("\nMODIFICAR");
			System.out.println("==========");
			
			System.out.println("Introduce el código del disco que deseas modificar");
			codigo = sn.nextLine();
			
			posModificar = -1;	//para posicionarnos fuera del bucle
			
			do {
				posModificar++;	//recorre el array hasta que encuentra el código introducido
				
			}while(!(discos[posModificar].getCodigo().equals(codigo)));
			
			System.out.println("Si en algún caso no quieres modificar el valor pulsa ENTER");
			System.out.println("Si no quieres modificar la duración pulsa 0");
			
			System.out.println("\nIntroduce el nuevo código");
			codigo = sn.nextLine();
			if(!codigo.equals("")) {
				discos[posModificar].setCodigo(codigo);
			}
			
			System.out.println("Introduce el nuevo autor");
			autor = sn.nextLine();
			if(!autor.equals("")) {
				discos[posModificar].setAutor(autor);
			}
			
			System.out.println("Introduce el nuevo título");
			titulo = sn.nextLine();
			if(!titulo.equals("")) {
				discos[posModificar].setTitulo(titulo);
			}
			
			System.out.println("Introduce el nuevo género");
			genero = sn.nextLine();
			if(!genero.equals("")) {
				discos[posModificar].setGenero(genero);
			}
			
			
			System.out.println("Introduce la nueva duración");
			duracion = sn.nextDouble();
			if(duracion != 0) {
				discos[posModificar].setDuracion(duracion);
			}
			
			break;
			
		case 4:
			
			System.out.println("\nBORRAR");
			System.out.println("=======");
			
			System.out.println("Introduce el código del disco que deseas borrar");
			codigo = sn.nextLine();
			
			posBorrar = -1;
			
			do {
				posBorrar++;
			}while(!(discos[posBorrar].getCodigo().equals(codigo)));
			
			discos[posBorrar].setCodigo("LIBRE");
			System.out.println("Disco borrado");
			
			break;
		}
		
		System.out.println("\n===================");
		
		}while(numSelec != 5);
		
		System.out.println("ADIOS");
		
		
		
	}

}
