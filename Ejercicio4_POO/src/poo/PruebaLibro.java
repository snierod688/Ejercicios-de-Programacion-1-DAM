package poo;
import java.util.Scanner;
public class PruebaLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		
		//crear objeto Libro1 con parámetros
		Libro Libro1 = new Libro("El quijote", "Cervantes", 1, 0);
		
		//crear objeto Libro2 con constructor por defecto
		Libro Libro2 = new Libro();
		
		//introducir datos libro2
		System.out.println("\nIntroduce el título del libro");
		String tituloLibro = sn.nextLine();
		Libro2.setTituloLibro(tituloLibro);
		
		System.out.println("Introduce el nombre del autor");
		String autor = sn.nextLine();
		Libro2.setNombreAutor(autor);
		
		System.out.println("Introduce el número de ejemplares disponibles");
		int numEjemplares = sn.nextInt();
		Libro2.setNumEjemplares(numEjemplares);
		
		System.out.println("Introduce el número de ejemplares prestados");
		int numEjemplaresPrestados = sn.nextInt();
		Libro2.setNumEjemplaresPrestados(numEjemplaresPrestados);
		
		//mostrar datos del Libro1
		System.out.println("Título del libro: " + Libro1.getTituloLibro());
		System.out.println("Nombre del autor: " + Libro1.getNombreAutor());
		System.out.println("Número de ejemplares disponibles: " + Libro1.getNumEjemplares());
		System.out.println("Número de ejemplares prestados: " + Libro1.getNumEjemplaresPrestados());
		
		//préstamo de Libro1
		if(Libro1.prestamo()) {
			System.out.println("El préstamo se ha realizado correctamente");
		}else {
			System.out.println("El préstamo no se ha podido realizar");
		}
		
		//devolución de Libro1
		if(Libro1.devolucion()) {
			System.out.println("La devolución se ha podido realizar");
		}else {
			System.out.println("La devolución no se ha podido realizar");
		}
		
		//préstamo de libro 1
		Libro1.prestamo();
		
		//préstamo libro1 para comprobar que no se realice ya que no hay ejemplares suficientes
		if(Libro1.prestamo()) {
			System.out.println("El préstamo se ha realizado correctamente");
		}else {
			System.out.println("No quedan ejemplares del libro");
		}
		
		
		//mostrar datos Libro1
		System.out.println("Título del libro: " + Libro1.getTituloLibro());
		System.out.println("Nombre del autor: " + Libro1.getNombreAutor());
		System.out.println("Número de ejemplares disponibles: " + Libro1.getNumEjemplares());
		System.out.println("Número de ejemplares prestados: " + Libro1.getNumEjemplaresPrestados());
		
		//mostrar datos Libro2
		System.out.println("Título del libro: " + Libro2.getTituloLibro());
		System.out.println("Nombre del autor: " + Libro2.getNombreAutor());
		System.out.println("Número de ejemplares disponibles: " + Libro2.getNumEjemplares());
		System.out.println("Número de ejemplares prestados: " + Libro2.getNumEjemplaresPrestados());
		
		
		
		
		
		
	}

}
