package SupermercadoArray;

public class Producto {
	private String nombre;
	private int precio;
	private String marca;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Producto(String nombre, int precio,String marca) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.marca = marca;
	}

}
