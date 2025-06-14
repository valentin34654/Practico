package EdificioArray;

public class Apartamento extends Edificio{
	private int numDepartamento;
	private double precio;
	public int getNumDepartamento() {
		return numDepartamento;
	}
	public void setNumDepartamento(int numDepartamento) {
		this.numDepartamento = numDepartamento;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Apartamento(String direccion, int pisos,String codigo, int numDepartamento, double precio) {
		super(direccion, pisos, codigo);
		this.numDepartamento = numDepartamento;
		this.precio = precio;
	}

}