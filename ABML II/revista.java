package Biblioteca;

public class revista extends Publicacion{
	private int numEdicion;
    private String periodicidad;
    
	public revista(String titulo, String autor, String editorial, int numEdicion, String periodicidad) {
		super(titulo, autor, editorial);
		this.numEdicion = numEdicion;
		this.periodicidad = periodicidad;
	}
	public int getNumEdicion() {
		return numEdicion;
	}
	public void setNumEdicion(int numEdicion) {
		this.numEdicion = numEdicion;
	}
	public String getPeriodicidad() {
		return periodicidad;
	}
	public void setPeriodicidad(String periodicidad) {
		this.periodicidad = periodicidad;
	}

}
