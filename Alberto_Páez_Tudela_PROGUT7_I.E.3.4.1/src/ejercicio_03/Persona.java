package ejercicio_03;

public class Persona implements Humano {
	
	private String nif;
	private String nombre;
	private String apellidos;
	private Direccion direccion;
	
	
	public Persona(String nif, String nombre, String apellidos, Direccion direccion) {
		this.nif = nif;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
	}


	public String getNif() {
		return nif;
	}


	public void setNif(String nif) {
		this.nif = nif;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	public String indentificate() {
		return "Persona";
	}
	
	
	
}