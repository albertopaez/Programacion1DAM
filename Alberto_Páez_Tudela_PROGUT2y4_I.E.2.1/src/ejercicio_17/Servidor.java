package ejercicio_17;

/**
 * <h2>Clase Portatil, se usa para almacenar portatiles en una BD</h2>
 * Hereda de Ordenador
 * @author Alberto Páez Tudela
 * @since 03-12-2018
*/
public class Servidor extends Ordenador{
	//Atributo tamaño del monitor del ordenador. No puede ser menor de 14
	private int tamanoMonitor;
	//Atributo modelo del teclado del ordenador
	private String modeloTeclado;
	//Atributo modelo del ratón del ordenador
	private String modeloRaton;
	
	/**
	 * Constructor con 8 parametros de entrada
	 * @param memoria RAM, heredado de Ordenador
	 * @param capacidad de disco duro, heredado de Ordenador
	 * @param precio, heredado de Ordenador
	 * @param modelo de procesador, heredado de Ordenador
	 * @param modelo de tarjeta grafica, heredado de Ordenador
	 * @param tamaño del monitor
	 * @param modelo del teclado
	 * @param modelo del ratón
	 */
	public Servidor(int memoriaRAM, int capacidadDisco, double precio, String modeloProcesador,
			String modeloTarjetaGrafica, int tamanoMonitor, String modeloTeclado, String modeloRaton) {
		super(memoriaRAM, capacidadDisco, precio, modeloProcesador, modeloTarjetaGrafica);
		this.tamanoMonitor = tamanoMonitor;
		this.modeloTeclado = modeloTeclado;
		this.modeloRaton = modeloRaton;
	}

	/**
	 * Constructor con todos los parametros genericos por defecto
	 */
	public Servidor() {
		super();
		this.tamanoMonitor = 14;
		this.modeloTeclado = "Hacendado";
		this.modeloRaton = "Mickey";
	}
	
	/**
	 * establece todos los parametros del ordenador. Usa el metodo establecer() de Ordenador
	 * @see Ordenador
	 */
	public void establecer(int memoriaRAM, int capacidadDisco, double precio, String modeloProcesador,
			String modeloTarjetaGrafica, int tamanoMonitor, String modeloTeclado, String modeloRaton) {
		this.establecer(memoriaRAM, capacidadDisco, precio, modeloProcesador, modeloTarjetaGrafica);
		this.tamanoMonitor = tamanoMonitor;
		this.modeloTeclado = modeloTeclado;
		this.modeloRaton = modeloRaton;
	}
	
	/**
	 * Muestra por consola los datos del ordenador con strings para facilitar la legibilidad
	 * Usa el metodo mostrar() de Ordenador
	 * @see Ordenador
	 */
	public void mostrar(){
		this.mostrar();
		System.out.println("\nModelo de teclado: "+this.modeloTeclado+"\nMonitor: "+this.tamanoMonitor+
				"\nNodelo de ratón: "+this.modeloRaton);
	}

	
}
