package ejercicio_17;

/**
 * <h2>Clase Portatil, se usa para almacenar portatiles en una BD</h2>
 * Hereda de Ordenador
 * @author Alberto Páez Tudela
 * @since 03-12-2018
*/
public class Portatil extends Ordenador{
	//Atributo marca del portatil
	private String marca;
	//Atributo tamaño de la pantalla del portatil
	private int tamañoPantalla;
	//Atributo peso del portatil
	private double peso;
	
	/**
	 * Constructor con 8 parametros de entrada
	 * @param memoria RAM, heredado de Ordenador
	 * @param capacidad de disco duro, heredado de Ordenador
	 * @param precio, heredado de Ordenador
	 * @param modelo de procesador, heredado de Ordenador
	 * @param modelo de tarjeta grafica, heredado de Ordenador
	 * @param marca
	 * @param tamaño de la pantalla
	 * @param peso
	 */
	public Portatil(int memoriaRAM, int capacidadDisco, double precio, String modeloProcesador,
			String modeloTarjetaGrafica, String marca, int tamañoPantalla, double peso) {
		super(memoriaRAM, capacidadDisco, precio, modeloProcesador, modeloTarjetaGrafica);
		this.marca = marca;
		this.tamañoPantalla = tamañoPantalla;
		this.peso = peso;
	}

	/**
	 * Constructor con todos los parametros genericos por defecto
	 */
	public Portatil() {
		super();
		this.marca = "Hacendado";
		this.tamañoPantalla = 10;
		this.peso = 5;
	}
	
	/**
	 * establece todos los parametros del ordenador. Usa el metodo establecer() de Ordenador
	 * @see Ordenador
	 */
	public void establecer(int memoriaRAM, int capacidadDisco, double precio, String modeloProcesador,
			String modeloTarjetaGrafica, String marca, int tamañoPantalla, double peso) {
		this.establecer(memoriaRAM, capacidadDisco, precio, modeloProcesador, modeloTarjetaGrafica);
		this.marca = marca;
		this.tamañoPantalla = tamañoPantalla;
		this.peso = peso;
	}
	
	/**
	 * Muestra por consola los datos del ordenador con strings para facilitar la legibilidad
	 * Usa el metodo mostrar() de Ordenador
	 * @see Ordenador
	 */
	public void mostrar(){
		this.mostrar();
		System.out.println("\nMarca: "+this.marca+"\nPantalla: "+this.tamañoPantalla+"\nPeso: "+this.peso);
	}

	
	
	
	
	
	

}
