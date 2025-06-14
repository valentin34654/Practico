package Biblioteca;

public class libro extends Publicacion{
	private int numPaginas;
    private String genero;
    
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public libro(String titulo, String autor, String editorial, int numPaginas, String genero) {
		super(titulo, autor, editorial);
		this.numPaginas = numPaginas;
		this.genero = genero;
	}

}
