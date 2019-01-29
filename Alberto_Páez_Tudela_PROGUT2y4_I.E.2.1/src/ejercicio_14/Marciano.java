package ejercicio_14;

/**
 * <h2>Clase Marciano, se usa para almacenar marcianos en una BD y controlar si estan vivos o muertos</h2>
 * @author Alberto Páez Tudela
 * @since 03-12-2018
*/
public class Marciano {
	//Atributo global de la cantidad de marcianos vivos
	public static int numMarcianos=0;
	//Atributo nombre del marciano
	private String nombre;
	//Atributo que indica si el marciano esta vivo (true) o muerto (false) inicializado pro defecto en false
	private boolean vivo=false;
	
	
	/**
	 * Constructor con 1 parametros
	 * Suma uno a la variable global del numero de marcianos, pone la variable "vivo"
	 *  automaticamente a true y llama al metodo "nace"
	 * @param nombre
	 */
	public Marciano(String nombre) {
		numMarcianos++;
		this.nombre = nombre;
		this.vivo=true;
		this.nace();
	}

	/**
	 * Imprime en pantalla un mensaje avisando de que el marciano ha nacido
	 */
	public void nace() {
		System.out.println("Hola, he nacido y soy el marciano "+this.nombre);
	}
	
	/**
	 *Imprime en pantalla un mensaje avisando de que el marciano ha muerto o ya esta muerto si lo estaba de antes
	 *Reduce la variable global del numero de marcianos vivos en 1
	 */
	public void muere() {
		if(this.vivo==true) {
			this.vivo=false;
			numMarcianos--;
			System.out.println("El marcinao "+this.nombre+" ha muerto");
		} else {
			System.out.println("El marciano ya está muerto");
		}
	}
	
	/**
	 * Imprime un mensaje mostrando si el marciano esta vivo o no
	 */
	public void estaVivo() {
		if(this.vivo==true) {
			System.out.println("El marciano "+this.nombre+" está vivo");
		} else {
			System.out.println("El marciano "+this.nombre+" está muerto");
		}
	}
	
	/**
	 *Imprime un mensaje mostrando la cantidad de marcianos vivos en el momento
	 */
	public void cuentaMarcianos() {
		System.out.println("Actualmente hay "+numMarcianos+" vivos");
	}

}
