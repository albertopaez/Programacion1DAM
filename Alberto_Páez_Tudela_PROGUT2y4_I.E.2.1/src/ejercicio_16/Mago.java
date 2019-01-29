package ejercicio_16;

/**
 * <h2>Clase Mago, se usa para almacenar personajes magos en una BD</h2>
 * Hereda de ejercicio_07.Asignatura
 * @author Alberto Páez Tudela
 * @since 03-12-2018
*/
public class Mago extends Personaje{
	//Atributo con el poder del mago
	String poder;
	
	/**
	 * Constructor con 2 parametros de entradas
	 * La cantidad de energía maxima y actual se inicializa a 100
	 * @param nombre
	 * @param poder
	 */
	public Mago(String nombre, String poder) {
		super(nombre);
		this.poder=poder;
	}
	
	/**
	 * Reduce al energia actual en 2 y devuelve el poder
	 */
	public String encantar() {
		this.energiaActual-=2;
		return poder;
	}
	

}
