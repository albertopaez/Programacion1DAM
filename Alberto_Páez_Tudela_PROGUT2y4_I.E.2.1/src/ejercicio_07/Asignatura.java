package ejercicio_07;

/**
 * <h2>Clase Asignatura, se usa como clase abstracta para otras clases</h2>
 * @author Alberto P�ez Tudela
 * @since 03-12-2018
*/

public class Asignatura {
	//Atributo materia de la asignatura
	protected String materia;
	//Atributo nota de la asignatura
	protected double nota;
	
	/**
	 * Constructor con 2 parametros
	 * @param materia
	 * @param nota
	 */
	public Asignatura(String materia, double nota){
		this.materia=materia;
		this.nota=nota;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getMateria() {
		return materia;
	}
	
	/**
	 * Devuelve la calificaci�n de la asignatura basada en la nota
	 */
	public String calificacion() {
		String calificacion;
		if(this.nota >= 5) {
			calificacion="Aprobado";
		}else {
			calificacion="Suspenso";
		}
		return calificacion;
	}
}
