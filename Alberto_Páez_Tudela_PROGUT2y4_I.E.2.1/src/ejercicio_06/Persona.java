package ejercicio_06;

/**
 * <h2>Clase Persona, se usa como clase abstracta para otras clases</h2>
 * @author Alberto Páez Tudela
 * @since 03-12-2018
*/
public class Persona {
	// Atributo nombre de la persona
	protected String nombre;
	// Atributo edad de la persona
	protected int edad;
	
	/**
	 * Constructor sin parametros
	 * Crea una persona generica por defecto con todos los atributos
	 */
	public Persona() {
		this.nombre="Antonio";
		this.edad=20;
	}
	
	/**
	 * Constructor con 2 parametros
	 * @param nombre
	 * @param edad
	 */
	public Persona(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

}
