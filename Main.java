
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void mostrar(ArrayList<Libro> l) {
		for( int i=0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}
	}
	static Scanner sc = new Scanner(System.in);
	
	public static void actualizarIventario() {
		int codigo;
		int cantidadExis; 
		int libroCant;
		int respuesta;
		System.out.println("\nIngresar cantidad existente de libros: ");
		cantidadExis = sc.nextInt();
		
		System.out.println("\nIngresar el codigo del libro (5 dígitos): ");
		codigo = sc.nextInt();
		
		if(codigo == 36523) {
			System.out.println("LIBRO: La casa de los espiritus --  AUTOR: Isabel Allende -- PRECIO: 21.05$" );
		} else if(codigo == 85207){ 
			System.out.println("LIBRO: Cumbres Borrascosas-- AUTOR: Emily Bronte -- PRECIO: 42.25$" );
		} else if(codigo == 96205){
			System.out.println("LIBRO:LIBRO: Dracula -- AUTOR: Bram Stroker -- PRECIO: 28.45$ " );
		} else if(codigo == 36505){
			System.out.println("LIBRO: 100 Años de soledad -- AUTOR: Gabriel García Marquez -- PRECIO: 38$ " );
		} else { System.out.println("Código incorrecto");}
					
		System.out.println("\nIngrese la cantidad de ese libro: ");
		libroCant = sc.nextInt();
	
		if(libroCant == 0)
			System.out.println("Libro agotado");
		if(libroCant !=0)
			System.out.println("\n¿DESEA COMPRAR EL LIBRO? " + "\n Digite 1 para SI o digite 2 para NO: ");
			respuesta = sc.nextInt();
			if(respuesta == 1) {
				libroCant = libroCant-1;
				cantidadExis = cantidadExis-1;
				System.out.println("El libro fue exitosamente comprado...");
				System.out.println("Cantidad de ese libro: " + libroCant);
				System.out.println("Cantidad de libros total: " + cantidadExis);
			}else {
				System.out.println("No se realizó la compra...");
			}
			}
	
	
	public static void librosCostosos() {
		System.out.println("Libros más costosos");
		System.out.println("1.- CÓDIGO: 85207 -- LIBRO: Cumbres Borrascosas -- AUTOR: Emily Bronte -- PRECIO: 42.25$  ");
		System.out.println("2.- CÓDIGO: 36505 -- LIBRO: 100 Años de soledad -- AUTOR: Gabriel García Marquez -- PRECIO: 38$ ");
		System.out.println("3.- CÓDIGO: 96205 -- LIBRO: Drácula -- AUTOR: Bram Stroker -- PRECIO: 28.45$ ");
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Libro> lib = new ArrayList<Libro>();
		System.out.println("\n-------------DATOS DE LIBROS-------------\n");
		Libro lib1 = new Libro (36523, "La casa de los espiritus", "AUTOR: Isabel Allende" ,21.05 );
		Libro lib2 = new Libro(85207, "Cumbres Borrascosas", "AUTOR: Emily Bronte", 42.25 );
		Libro lib3 = new Libro(96205, "Dracula", "AUTOR: Bram Stroker", 28.45 );
		Libro lib4 = new Libro(36505, "100 Años de soledad", "AUTOR: Gabriel García Marquez", 38 );
		
		lib.add(lib1);
		lib.add(lib2);
		lib.add(lib3);
		lib.add(lib4);
		
		mostrar(lib);
		actualizarIventario();
		librosCostosos();
		
		
		
	}

}