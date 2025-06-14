package SupermercadoArray;

public class Ropa extends Producto{
	private String talla;
	private String logo;
	
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public Ropa(String nombre, int precio, String marca, String talla, String logo) {
		super(nombre, precio, marca);
		this.talla = talla;
		this.logo = logo;
	}

}
