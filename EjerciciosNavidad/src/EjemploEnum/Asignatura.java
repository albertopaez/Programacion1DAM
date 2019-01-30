package EjemploEnum;

/**
 * <h2>Clase Asignatura, se usa como clase abstracta para otras clases</h2>
 * @author Alberto Páez Tudela
 * @since 03-12-2018
*/

public class Asignatura {
	//Atributo materia de la asignatura
	protected Materia materia;
	//Atributo nota de la asignatura
	protected double nota;
	
	/**
	 * Constructor con 2 parametros
	 * @param materia
	 * @param nota
	 */
	public Asignatura(Materia materia, double nota){
		this.materia=materia;
		this.nota=nota;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public Materia getMateria() {
		return materia;
	}
	
	/**
	 * Devuelve la calificación de la asignatura basada en la nota
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
