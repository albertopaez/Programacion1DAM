package ejercicio_10;


/**
 * <h2>Clase CasaConde, se usa para manejar los datos de un restaurante especializado en papas con chocos</h2>
 * @author Alberto Páez Tudela
 * @since 03-12-2018
*/
public class CasaConde {
	//Atributo cantidad de papas del restaurante
	private double papas;
	//Atributo cantidad de chocos del restaurante
	private double chocos;
	
	/**
	 * Constructor con papas y chocos a 0 por defecto
	 */
	public CasaConde(){
		this.papas=0;
		this.chocos=0;
	}
	
	/**
	 * Constructor con 2 parametros
	 * @param kilos de papas en reserva
	 * @param kilos de chocos en reserva
	 */
	public CasaConde(double papas, double chocos){
		this.papas=papas;
		this.chocos=chocos;
	}

	/**
	 * Añade chocos al restaurante
	 */
	public void addChocos(int chocos) {
		this.chocos += chocos;
	}
	
	/**
	 * Añade papas al restaurante
	 */
	public void addPapas(int papas) {
		this.papas += papas;
	}
	
	/**
	 * Devuelve la cantidad de comensales a los que se puede servir dada la cantidad de papas y chocos
	 */
	public int getComensales() {
		int comensales;
		if(this.papas*2<=this.chocos) {
			comensales =  (int) (this.papas*3);
		} else {
			comensales = (int) (this.chocos*6);
		}
		return comensales;
	}
	
	/**
	 * Devuelve la cantidad de chocos del restaurante con strings para facilitar la legibilidad
	 */
	public void showChocos() {
		System.out.println("Hay " + chocos + "Kg de chocos");
	}
	
	/**
	 * Devuelve la cantidad de papas del restaurante con strings para facilitar la legibilidad
	 */
	public void showPapas() {
		System.out.println("Hay " + papas + "Kg de papas");
	}
	

}
