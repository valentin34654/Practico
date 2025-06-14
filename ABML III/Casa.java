package EdificioArray;

public class Casa extends Edificio{
	private int cantHabitaciones;
	private int metCuadrados;
	public int getCantHabitaciones() {
		return cantHabitaciones;
	}
	public void setCantHabitaciones(int cantHabitaciones) {
		this.cantHabitaciones = cantHabitaciones;
	}
	public int getMetCuadrados() {
		return metCuadrados;
	}
	public void setMetCuadrados(int metCuadrados) {
		this.metCuadrados = metCuadrados;
	}
	public Casa(String direccion, int pisos, String codigo, int cantHabitaciones, int metCuadrados) {
		super(direccion, pisos, codigo);
		this.cantHabitaciones = cantHabitaciones;
		this.metCuadrados = metCuadrados;
	}

}
