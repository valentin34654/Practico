package SupermercadoArray;

public class Alimento extends Producto{
	private String fechaCaducidad;
	public Alimento(String nombre, int precio, String marca, String fechaCaducidad) {
		super(nombre, precio, marca);
		this.fechaCaducidad = fechaCaducidad;
	}
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

}
