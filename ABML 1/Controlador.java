package SupermercadoArray;

import java.util.Scanner;

public class Controlador {
public static void main(String[] args) {
		
		int opcion;
		Producto[] arregloPro = new Producto[10];
		
		int cantidadRegistros = 0;
		
		
		do {
			
			Scanner lector = new Scanner(System.in);
			
			System.out.println("Bienvenido al Programa ");
			System.out.println("Ingresa la oppcion sobre el producto:");
			System.out.println("1- Ingresar Producto");
			System.out.println("2- Mostrar Lista de Productos");
			System.out.println("3- Borrar Producto");
			System.out.println("4- Modificar Producto");
			System.out.println("5- Salir");
			opcion = lector.nextInt();
			
			
			switch (opcion) {
			case 1:
				altaProducto(arregloPro, cantidadRegistros, lector);
				cantidadRegistros++;
				break;
				
			case 2:
				listarProducto(arregloPro);
				break;
				
			case 3:
				System.out.println("Ingresa el nombre del Producto a dar de baja: ");
				bajaProducto(arregloPro,lector);
				break;
			case 4:
				modifProducto(arregloPro,lector);
			case 5:
				System.out.println("Se terminó");
				break;

			default:
				System.out.println("Opcion no disponible");
				break;
			}
			
		} while (opcion!=5);

	}
	
	public static void bajaProducto(Producto[] arregloPro, Scanner lector) {
		System.out.println("Ingrese el nombre del Producto a dar de baja: ");
		String nombre = lector.next();
		for(int i=0; i<arregloPro.length; i++) {
			if (arregloPro[i] != null && arregloPro[i].getNombre().equals(nombre)) {
				arregloPro[i] = null;
				break;
			}
		}
	}
	
	public static void modifProducto(Producto[] arreglo, Scanner lector) {
		System.out.println("Ingresa la CI del estudiante a modificar: ");
		String nombre = lector.next();
		for(int i=0; i<arreglo.length; i++) {
			if(arreglo[i] != null && arreglo[i].getNombre().equals(nombre)) {
				System.out.println("Usuario encontrado");
				System.out.println("Ingresa el nuevo nombre del producto: ");
					String nuevo = lector.next();
					arreglo[i].setNombre(nuevo);
				break;
			}
		}
	}
	
	public static void altaProducto(Producto[] arregloPro, int cantidadRegistros, Scanner lector) {
		System.out.println("Que Producto Quiere Ingresar");
		System.out.println("1_Alimento");
		System.out.println("2_Ropa");
		System.out.println("3_Electronico");
		System.out.println("Ingrese una opcion");
		int op = lector.nextInt();
		switch (op) {
		case 1:
			System.out.println("Ingrese nombre del Alimento: ");
			String nom = lector.next();
			System.out.println("Ingresa El Precio del Alimento: ");
			int precio = lector.nextInt();
			System.out.println("Ingresa La marca del alimento: ");
			String marca = lector.next();
			System.out.println("Ingrese la fecha de cadusidad");
			String cad = lector.next();
			
			for(int i=0; i<arregloPro.length; i++) {
				if(arregloPro[i] == null) {
					arregloPro[i] = (Producto) new Alimento(nom, precio, marca,cad);
					break;
				}
			}
			break;
		case 3:
			System.out.println("Ingres el nombre de Producto Electronico: ");
			String nomE = lector.next();
			System.out.println("Ingresa El Precio del Producto Electronicoo: ");
			int precioE = lector.nextInt();
			System.out.println("Ingresa La marca del Producto Electronico: ");
			String marcaE = lector.next();
			System.out.println("Que tipo es su Producto Electronico: ");
			String tipo = lector.next();
			System.out.println("Que modelo es su Producto Electronico: ");
			String modelo = lector.next();

			
			for (int i=0; i<arregloPro.length; i++) {
				if(arregloPro[i] == null) {
					arregloPro[i] = (Producto) new Electronica(nomE, precioE, marcaE,tipo,modelo);
					break;
				}
			}
			break;
		case 2:
			System.out.println("Ingres el nombre de la Ropa: ");
			String nomR = lector.next();
			System.out.println("Ingresa El Precio de la Ropa: ");
			int precioR = lector.nextInt();
			System.out.println("Ingresa La marca de la Ropa: ");
			String marcaR = lector.next();
			System.out.println("Ingrese que talla es la Ropa: ");
			String talla = lector.next();
			System.out.println("Ingrese el logo que tiene la Ropa: ");
			String logo = lector.next();

			
			for (int i=0; i<arregloPro.length; i++) {
				if(arregloPro[i] == null) {
					arregloPro[i] = (Producto) new Ropa(nomR, precioR, marcaR,talla,logo);
					break;
				}
			}
			break;
		}	
	}
	public static void listarProducto(Producto[] arregloPro) {
		
		for(int i=0; i<arregloPro.length; i++) {
			if(arregloPro[i] != null) {
				System.out.print(" Pocision: "+ i +" Nombre del Producto: " + arregloPro[i].getNombre());
				System.out.print(" Precio: " + arregloPro[i].getPrecio());
				System.out.println(" Marca: " + arregloPro[i].getMarca());
			}else {
				System.out.println("Pos N°" + i + "es null");
			}
			
		}
		
		
	}

}
