package ejercicio_16;

/**
 * <h2>Clase Guerrero, se usa para almacenar personajes guerreros en una BD</h2>
 * Hereda de ejercicio_07.Asignatura
 * @author Alberto Páez Tudela
 * @since 03-12-2018
*/
public class Guerrero extends Personaje{
	//Atributo arma del guerrero
	String arma;
	
	/**
	 * Constructor con 3 parametros de entradas
	 * @param nombre
	 * @param energía máxima
	 * @param arma
	 */
	public Guerrero(String nombre, int energiaMaxima, String arma) {
		super(nombre, energiaMaxima);
		this.arma=arma;
	}
	
	/**
	 * Reduce la energia dle personaje y devuelve un string con el arma y la energia gastada concatenados
	 * Si intenta gastar toda o mas energia de la que tiene devuelve solo la que quedaba y da un mensaje de aviso
	 */
	public String combatir(int energia) {
		if(this.energiaActual>energia) {
			this.energiaActual-=energia;
			return arma+energia;
		}else {
			energia=this.energiaActual;
			this.energiaActual=0;
			return arma+energia+" (has agotado toda tu energía, seria recomendable comer un poco)";
		}
		
	}


}
