package EjemploEnum;

/**
 * <h2>Clase Alumno, se usa para almacenar alumnos en una BD</h2>
 * Hereda de ejercicio_07.Asignatura
 * @author Alberto Páez Tudela
 * @since 03-12-2018
*/
public class Alumno extends Asignatura {
	//Atributo nombre del alumno
	private String nombre;
	//Atributo edad del alumno
	private int edad;
	
	/**
	 * Constructor con 4 parametros
	 * @param nombre
	 * @param edad
	 * @param materia, heredado de asignatura
	 * @param nota, heredado de asignatura
	 */
	Alumno(String nombre, int edad, Materia materia, double nota) {
		super(materia, nota);
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
	
	/**
	 * Devuelve los datos del alumno con strings para facilitar la legibilidad
	 */
	public String mostrarDatos() {
		return "Nombre: "+this.nombre+"\nEdad: "+this.edad+"\nMateria: "+this.materia+
				"\nNota: "+this.nota+"\nCalificación: "+this.calificacion();
	}

	

}