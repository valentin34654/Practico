package SupermercadoArray;

public class Electronica extends Producto{
	private String tipo;
	private String modelo;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Electronica(String nombre, int precio, String marca, String tipo, String modelo) {
		super(nombre, precio, marca);
		this.tipo = tipo;
		this.modelo = modelo;
	}

}
