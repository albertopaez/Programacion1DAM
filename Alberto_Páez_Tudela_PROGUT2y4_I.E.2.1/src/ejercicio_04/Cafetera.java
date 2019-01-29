package ejercicio_04;

/**
 * <h2>Clase Cafetera, se usa para manipular cafeteras</h2>
 * @author Alberto P�ez Tudela
 * @since 03-12-2018
*/

public class Cafetera {
	// Atributo capacidad m�xima de cafe
	private int capacidad_maxima;
	// Atributo cantidad actual de cafe
	private int cantidad_actual;
	
	/**
	 * Constructor sin parametros
	 * Crea una cafetera generica por defecto vacia 
	 */
	public Cafetera(){
		this.capacidad_maxima=1000;
		this.cantidad_actual=0;
	}
	
	/**
	 * Constructor con 1 parametros
	 * Crea una cafetera donde se introduce la capacidad m�xima y llena de caf� por defecto
	 * @param capacidad m�xima
	 */
	public Cafetera(int capacidad_maxima){
		this.capacidad_maxima=capacidad_maxima;
		this.cantidad_actual=capacidad_maxima;
	}
	
	/**
	 * Constructor con 2 parametros
	 * Crea una cafetera asegunrandose de que la cantidad de caf� no supera la maximo haciendo que
	 * en caso de la cantidad superar la capacidad m�xima la cantidad seiguale a la capacidad m�xima
	 * @param capacidad m�xima
	 * @param cantidad de caf�
	 */
	public Cafetera(int capacidad_maxima, int cantidad_actual){
		this.capacidad_maxima=capacidad_maxima;
		if(capacidad_maxima >= cantidad_actual ) {
			this.cantidad_actual=cantidad_actual;
		}else {
			this.cantidad_actual=capacidad_maxima;
		}
	}
	
	//M�todos p�blicos

	public int getCapacidad_maxima() {
		return capacidad_maxima;
	}
	public int getCantidad_actual() {
		return cantidad_actual;
	}
	
	/**
	 * Llena de caf� la cafetera
	 */
	public void llenarCafetera () {
		this.cantidad_actual=this.capacidad_maxima;
	}
	
	/**
	 * Vacia de caf� la cafetera
	 */
	public void vaciarCafetera () {
		this.cantidad_actual=0;
	}
	
	/**
	 * A�ade caf� a la cafetera asegunrandose de no sobrepasar el m�ximo
	 * @param cantidad de cafe a a�adir
	 */
	public void agregarCafe (int cantidad_actual) {
		if (cantidad_actual + this.cantidad_actual >= this.capacidad_maxima) {
			this.cantidad_actual=this.capacidad_maxima;
		} else {
			this.cantidad_actual+=cantidad_actual;
		}
	}
	
	/**
	 * Sirve una taza gastando caf� asegunrandose de no llegar a numeros megativos
	 * @param caf� a gastar
	 */
	public void servirTaza (int cantidad_actual) {
		if (cantidad_actual <= this.cantidad_actual) {
			this.cantidad_actual-=cantidad_actual;
		} else {
			this.cantidad_actual=0;
		}
	}
	
	/**
	 * Devuelve los datos de la cafetera con strings para facilitar la legibilidad
	 */
	public String muestraCafetera() {
		return "Capacidad maxima: " + capacidad_maxima +
				"\nCantidad actual: " + cantidad_actual;
	}
	
	
}
