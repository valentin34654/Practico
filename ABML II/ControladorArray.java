package Biblioteca;

import java.util.Scanner;
public class ControladorArray {
public static void main(String[] args) {
		
		int opcion;
		Publicacion[] arregloPub = new Publicacion[10];
		int cantidadRegistros = 0;
		
		
		do {
			
			Scanner lector = new Scanner(System.in);
			
			System.out.println("Bienvenido al Programa ");
			System.out.println("Ingresa la oppcion sobre la Publicacion:");
			System.out.println("1- Ingresar Publicacion");
			System.out.println("2- Mostrar Lista de Publicaciones");
			System.out.println("3- Borrar Publicacion");
			System.out.println("4- Modificar Publicacion");
			System.out.println("5- Salir");
			opcion = lector.nextInt();
			
			
			switch (opcion) {
			case 1:
				altaPublicacion(arregloPub, cantidadRegistros, lector);
				cantidadRegistros++;
				break;
				
			case 2:
				listarPublicacion(arregloPub);
				break;
				
			case 3:
				bajaPublicacion(arregloPub,lector);
				break;
			case 4:
				modifPublicacion(arregloPub,lector);
			case 5:
				System.out.println("Se terminó");
				break;

			default:
				System.out.println("Opcion no disponible");
				break;
			}
			
		} while (opcion!=5);

	}
	
	public static void bajaPublicacion(Publicacion[] arregloPub, Scanner lector) {
		System.out.println("Ingrese el titulo a dar de baja: ");
		String titulo = lector.next();
		for(int i=0; i<arregloPub.length; i++) {
			if (arregloPub[i] != null && arregloPub[i].getTitulo().equals(titulo)) {
				arregloPub[i] = null;
				break;
			}
		}
	}
	
	public static void modifPublicacion(Publicacion[] arregloPub, Scanner lector) {
		System.out.println("Ingresa el titulo a modificar: ");
		String titulo = lector.next();
		for(int i=0; i<arregloPub.length; i++) {
			if(arregloPub[i] != null && arregloPub[i].getTitulo().equals(titulo)) {
				System.out.println("Publicacion encontrada");
				System.out.println("Ingresa el nuevo titulo de la Publicacion: ");
					String nuevo = lector.next();
					arregloPub[i].setTitulo(nuevo);
				break;
			}
		}
	}
	
	public static void altaPublicacion(Publicacion[] arregloPub, int cantidadRegistros, Scanner lector) {
		System.out.println("Que tipo de Publicacion Quiere Ingresar");
		System.out.println("1_Revista");
		System.out.println("2_Libro");
		System.out.println("3_Articulo Cientifico");
		System.out.println("Ingrese una opcion");
		int op = lector.nextInt();
		switch (op) {
		case 1:
			System.out.println("Ingrese el titulo de la Revista: ");
			String titulo = lector.next();
			System.out.println("Ingrese el Autor de la Revista: ");
			String autor = lector.next();
			System.out.println("Ingrese la editorial de la Revista: ");
			String edit = lector.next();
			System.out.println("Ingrese el Numero de Edicion de la Revista: ");
			int numEdicion = lector.nextInt();
			System.out.println("Ingrese que tipo de periodicidad tiene la Revista");
			String perio = lector.next();
			
			for(int i=0; i<arregloPub.length; i++) {
				if(arregloPub[i] == null) {
					arregloPub[i] = (Publicacion) new revista(titulo, autor, edit, numEdicion, perio);
					break;
				}
			}
			break;
		case 2:
			System.out.println("Ingrese el titulo del Libro: ");
			String titulo1 = lector.next();
			System.out.println("Ingrese el Autor del Libro: ");
			String autor1 = lector.next();
			System.out.println("Ingrese la editorial del libro: ");
			String edit1 = lector.next();
			System.out.println("Ingrese la cantidad de paginas que tiene el Libro: ");
			int numPaginas = lector.nextInt();
			System.out.println("Ingrese el genero del Libro");
			String genero = lector.next();
			
			for(int i=0; i<arregloPub.length; i++) {
				if(arregloPub[i] == null) {
					arregloPub[i] = (Publicacion) new libro(titulo1, autor1, edit1, numPaginas, genero);
					break;
				}
			}
			break;
		case 3:
			System.out.println("Ingrese el titulo del Articulo Cientifico: ");
			String titulo2 = lector.next();
			System.out.println("Ingrese el Autor del Articulo Cientifico: ");
			String autor2 = lector.next();
			System.out.println("Ingrese la editorial del Articulo Cientifico: ");
			String edit2 = lector.next();
			System.out.println("Ingrese que tipo de informacion tiene el Articulo Cientifico: ");
			String investigacion = lector.next();
			System.out.println("Ingrese el DOI: ");
			String DOI = lector.next();
			
			for(int i=0; i<arregloPub.length; i++) {
				if(arregloPub[i] == null) {
					arregloPub[i] = (Publicacion) new ArticuloCientifico(titulo2, autor2, edit2, investigacion, DOI); 
					break;
				}
			}
		}	
	}
	public static void listarPublicacion(Publicacion[] arregloPub) {
		
		for(int i=0; i<arregloPub.length; i++) {
			if(arregloPub[i] != null) {
				System.out.print(" Pocision: "+ i +" Titulo: " + arregloPub[i].getTitulo());
				System.out.print(" Autor: " + arregloPub[i].getAutor());
				System.out.println(" Editorial: " + arregloPub[i].getEditorial());
			}else {
				System.out.println("Pos N°" + i + "es null");
			}
			
		}
		
		
	}
	
}