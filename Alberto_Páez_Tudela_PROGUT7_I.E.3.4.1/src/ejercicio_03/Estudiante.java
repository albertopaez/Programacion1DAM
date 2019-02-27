package ejercicio_03;

public class Estudiante extends Persona{
	
	private String idEstudiante;

	public Estudiante() {
	}

	public Estudiante(String idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public String getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(String idEstudiante) {
		this.idEstudiante = idEstudiante;
	}
	
	
	@Override
	public String toString() {
		return "ID Estudiante: "+getIdEstudiante()+"\nNIF: "+getNif()+"\nNombre: "+getNombre()+
				"\nApellidos: "+getApellidos()+"\nDirección: "+direccion.getCalle()+", "+
				direccion.getCiudad()+", "+direccion.getPais()+", "+direccion.getCodigoPostal();
	}
	
	@Override
	public String indentificate() {
		return "Tipo Estudiante";
	}
	

}
