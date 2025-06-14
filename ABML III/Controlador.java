package EdificioArray;
import java.util.Scanner;
public class Controlador {
public static void main(String[] args) {
		
		int opcion;
		Edificio[] arregloEdi = new Edificio[10];
		int cantidadRegistros = 0;
		
		
		do {
			
			Scanner lector = new Scanner(System.in);
			
			System.out.println("Bienvenido al Programa ");
			System.out.println("Ingresa la oppcion sobre el Edificio:");
			System.out.println("1- Ingresar Edificio");
			System.out.println("2- Mostrar Lista de Edificios");
			System.out.println("3- Borrar Edificios");
			System.out.println("4- Modificar Edificios");
			System.out.println("5- Salir");
			opcion = lector.nextInt();
			
			
			switch (opcion) {
			case 1:
				altaEdificio(arregloEdi, cantidadRegistros, lector);
				cantidadRegistros++;
				break;
				
			case 2:
				listarEdificio(arregloEdi);
				break;
				
			case 3:
				bajaEdificio(arregloEdi,lector);
				break;
			case 4:
				modifEdificio(arregloEdi,lector);
			case 5:
				System.out.println("Se terminó");
				break;

			default:
				System.out.println("Opcion no disponible");
				break;
			}
			
		} while (opcion!=5);

	}
	
	public static void bajaEdificio(Edificio[] arregloEdi, Scanner lector) {
		System.out.println("Ingrese el codigo postal del Edificio a dar de baja: ");
		String codigo = lector.next();
		for(int i=0; i<arregloEdi.length; i++) {
			if (arregloEdi[i] != null && arregloEdi[i].getCodigo().equals(codigo)) {
				arregloEdi[i] = null;
				break;
			}
		}
	}
	
	public static void modifEdificio(Edificio[] arregloEdi, Scanner lector) {
		System.out.println("Ingresa el codigo postal del Edificio a modificar: ");
		String codigo = lector.next();
		for(int i=0; i<arregloEdi.length; i++) {
			if(arregloEdi[i] != null && arregloEdi[i].getCodigo().equals(codigo)) {
				System.out.println("Edificio encontrado");
				System.out.println("Ingresa el nuevo codigo postal del Edificio: ");
					String nuevo = lector.next();
					arregloEdi[i].setCodigo(nuevo);
				break;
			}
		}
	}
	
	public static void altaEdificio(Edificio[] arregloEdi, int cantidadRegistros, Scanner lector) {
		System.out.println("Que tipo de Edificio Quiere Ingresar");
		System.out.println("1_Apartamento");
		System.out.println("2_Casa");
		System.out.println("Ingrese una opcion");
		int op = lector.nextInt();
		switch (op) {
		case 1:
			System.out.println("Ingrese la direccion del Apartamento: ");
			String direcion = lector.next();
			System.out.println("Ingresa cuantos pisos tiene el Apartamento:  ");
			int pisos = lector.nextInt();
			System.out.println("Ingrese el codigo postal del departamento: ");
			String codigo = lector.next();
			System.out.println("Ingrese el Numero del Apartamento: ");
			int numDepartamentos = lector.nextInt();
			System.out.println("Ingrese cuanto paga por el Apartamento");
			double precio = lector.nextDouble();
			
			for(int i=0; i<arregloEdi.length; i++) {
				if(arregloEdi[i] == null) {
					arregloEdi[i] = (Edificio) new Apartamento(direcion, pisos, codigo, numDepartamentos, precio);
					break;
				}
			}
			break;
		case 2:
			System.out.println("Ingres la direccion de la Casa: ");
			String dir= lector.next();
			System.out.println("Ingresa cuantos pisos tiene la Casa: ");
			int pisosC = lector.nextInt();
			System.out.println("Ingresa el codigo postal de a Casa: ");
			String codigoC = lector.next();
			System.out.println("Ingresa La cantidad de habitaciones que tiene la Casa: ");
			int cantH = lector.nextInt();
			System.out.println("Ingrese la cantidad de metros cuadrados tiene la casa: ");
			int met2 = lector.nextInt();

			
			for (int i=0; i<arregloEdi.length; i++) {
				if(arregloEdi[i] == null) {
					arregloEdi[i] = (Edificio) new Casa(dir, pisosC, codigoC,cantH,met2);
					break;
				}
			}
			break;
		}	
	}
	public static void listarEdificio(Edificio[] arregloEdi) {
		
		for(int i=0; i<arregloEdi.length; i++) {
			if(arregloEdi[i] != null) {
				System.out.print(" Pocision: "+ i +" Direccion del Edificio: " + arregloEdi[i].getDireccion());
				System.out.print(" Pisos: " + arregloEdi[i].getPisos());
				System.out.println(" Codigo Postal: " + arregloEdi[i].getCodigo());
			}else {
				System.out.println("Pos N°" + i + "es null");
			}
			
		}
		
		
	}
	
}
