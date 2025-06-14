package EdificioArray;

public class Edificio {
	private String direccion;
	private int pisos;
	private String codigo;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getPisos() {
		return pisos;
	}
	public void setPisos(int pisos) {
		this.pisos = pisos;
	}
	public Edificio(String direccion, int pisos, String codigo) {
		super();
		this.direccion = direccion;
		this.pisos = pisos;
		this.codigo = codigo;
	}
	

}