package ejercicio_09;

/**
 * <h2>Clase Persona, se usa como clase abstracta para otras clases</h2>
 * @author Alberto Páez Tudela
 * @since 03-12-2018
*/
public class Persona {
	//Atributo apellidos de la persona
	protected String apellidos;
	//Atributo nombre de la persona
	protected String nombre;
	//Atributo dni de la persona
	protected String dni;
	//Atributo sexo de la persona
	protected String sexo;	//true=hombre y false=mujer
	
	
	/**
	 * Constructor con persona generica con parametros por defecto
	 */
	public Persona() {
		this.apellidos="Perex Perez";
		this.nombre="Pedro";
		this.dni="999999999R";
		this.sexo="hombre";
	}
	
	/**
	 * Constructor con 4 parametros
	 * @param apellidos
	 * @param nombre
	 * @param dni
	 * @param sexo
	 */
	public Persona(String apellidos, String nombre, String dni, String sexo) {
		super();
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.dni = dni;
		this.sexo = sexo;
	}


	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String isSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	/**
	 * Devuelve los datos de la persona con strings para facilitar la legibilidad
	 */
	public String mostrarDatos() {
		return "\nNombre: " + this.nombre + "\nApellidos: " + this.apellidos +
				"\nDNI: " + this.dni + "\nSexo: " + this.sexo;
	}
	
	
	
}
