package ejercicio_01;

public class Persona {
	
	private String nif;
	private String NombreYApellidos;
	
	public Persona(String nif, String nombreYApellidos) {
		this.nif = nif;
		NombreYApellidos = nombreYApellidos;
	}
	
	public Persona() {
	}
	
	
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getNombreYApellidos() {
		return NombreYApellidos;
	}
	public void setNombreYApellidos(String nombreYApellidos) {
		NombreYApellidos = nombreYApellidos;
	}

}
