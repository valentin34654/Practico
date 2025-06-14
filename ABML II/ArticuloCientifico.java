package Biblioteca;

public class ArticuloCientifico extends Publicacion{
	private String investigacion;
	private String DOI;

	public ArticuloCientifico(String titulo, String autor, String editorial, String investigacion, String DOI) {
		super(titulo, autor, editorial);
		this.investigacion = investigacion;
	}

	public String getInvestigacion() {
		return investigacion;
	}

	public void setInvestigacion(String investigacion) {
		this.investigacion = investigacion;
	}

	public String getDOI() {
		return DOI;
	}

	public void setDOI(String doi) {
		this.DOI = doi;
	}

}
