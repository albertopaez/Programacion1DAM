package ejercicio_17;

/**
 * <h2>Clase Portatil, se usa para almacenar portatiles en una BD</h2>
 * Hereda de Ordenador
 * @author Alberto P�ez Tudela
 * @since 03-12-2018
*/
public class Portatil extends Ordenador{
	//Atributo marca del portatil
	private String marca;
	//Atributo tama�o de la pantalla del portatil
	private int tama�oPantalla;
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
	 * @param tama�o de la pantalla
	 * @param peso
	 */
	public Portatil(int memoriaRAM, int capacidadDisco, double precio, String modeloProcesador,
			String modeloTarjetaGrafica, String marca, int tama�oPantalla, double peso) {
		super(memoriaRAM, capacidadDisco, precio, modeloProcesador, modeloTarjetaGrafica);
		this.marca = marca;
		this.tama�oPantalla = tama�oPantalla;
		this.peso = peso;
	}

	/**
	 * Constructor con todos los parametros genericos por defecto
	 */
	public Portatil() {
		super();
		this.marca = "Hacendado";
		this.tama�oPantalla = 10;
		this.peso = 5;
	}
	
	/**
	 * establece todos los parametros del ordenador. Usa el metodo establecer() de Ordenador
	 * @see Ordenador
	 */
	public void establecer(int memoriaRAM, int capacidadDisco, double precio, String modeloProcesador,
			String modeloTarjetaGrafica, String marca, int tama�oPantalla, double peso) {
		this.establecer(memoriaRAM, capacidadDisco, precio, modeloProcesador, modeloTarjetaGrafica);
		this.marca = marca;
		this.tama�oPantalla = tama�oPantalla;
		this.peso = peso;
	}
	
	/**
	 * Muestra por consola los datos del ordenador con strings para facilitar la legibilidad
	 * Usa el metodo mostrar() de Ordenador
	 * @see Ordenador
	 */
	public void mostrar(){
		this.mostrar();
		System.out.println("\nMarca: "+this.marca+"\nPantalla: "+this.tama�oPantalla+"\nPeso: "+this.peso);
	}

	
	
	
	
	
	

}
