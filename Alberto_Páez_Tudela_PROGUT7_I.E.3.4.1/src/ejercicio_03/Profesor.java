package ejercicio_03;

public class Profesor extends Persona {
	
	private String despacho;

	public Profesor() {
	}

	public Profesor(String despacho) {
		this.despacho = despacho;
	}

	public String getDespacho() {
		return despacho;
	}

	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}
	
	@Override
	public String toString() {
		return "NIF: "+getNif()+"\nNombre: "+getNombre()+"\nDespacho: "+getDespacho()+
				"\nApellidos: "+getApellidos()+"\nDirección: "+direccion.getCalle()+", "+
				direccion.getCiudad()+", "+direccion.getPais()+", "+direccion.getCodigoPostal();
	}
	
	@Override
	public String indentificate() {
		return "Tipo Profesor";
	}
	
	

}
