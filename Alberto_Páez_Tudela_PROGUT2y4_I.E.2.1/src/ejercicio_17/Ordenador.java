package ejercicio_17;

/**
 * <h2>Clase Ordenador, se usa como clase abstracta para otras clases</h2>
 * @author Alberto Páez Tudela
 * @since 03-12-2018
*/
public class Ordenador {
	//Atributo cantidad de memoria RAM del ordenador
	protected int memoriaRAM;
	//Atributo capacidad del disco duro del ordenador
	protected int capacidadDisco;
	//Atributo precio del ordenador
	protected double precio;
	//Atributo modelo de procesador del ordenador. Solo puede ser "Core i3", "Core i5", "Core i7" o "Core i9" 
	protected String modeloProcesador;
	//Atributo modelo de tarjeta grafica del ordenador
	protected String modeloTarjetaGrafica;
	
	/**
	 * Constructor con 5 parametros de entrada
	 * @param memoria RAM
	 * @param capacidad de disco duro
	 * @param precio
	 * @param modelo de procesador
	 * @param modelo de tarjeta grafica
	 */
	public Ordenador(int memoriaRAM, int capacidadDisco, double precio, String modeloProcesador,
			String modeloTarjetaGrafica) {
		this.memoriaRAM = memoriaRAM;
		this.capacidadDisco = capacidadDisco;
		this.precio = precio;
		this.modeloProcesador = modeloProcesador;
		this.modeloTarjetaGrafica = modeloTarjetaGrafica;
	}
	
	/**
	 * Constructor con todos los parametros genericos por defecto
	 */
	public Ordenador() {
		this.memoriaRAM = 2;
		this.capacidadDisco = 1000;
		this.precio = 300;
		this.modeloProcesador = "Core i5";
		this.modeloTarjetaGrafica = "GT 710";
	}
	
	/**
	 * establece todos los parametros del ordenador
	 */
	public void establecer(int memoriaRAM, int capacidadDisco, double precio, String modeloProcesador,
			String modeloTarjetaGrafica) {
		this.memoriaRAM = memoriaRAM;
		this.capacidadDisco = capacidadDisco;
		this.precio = precio;
		this.modeloProcesador = modeloProcesador;
		this.modeloTarjetaGrafica = modeloTarjetaGrafica;
	}
	
	/**
	 * Muestra por consola los datos del ordenador con strings para facilitar la legibilidad
	 */
	public void mostrar(){
		System.out.println("Menoria RAM: "+this.memoriaRAM+"\nCapacidad de disco duro: "+this.capacidadDisco+
				"\nProceador: "+this.modeloProcesador+"\nTarjeta Grafica: "+this.modeloTarjetaGrafica+
				"\nPrecio: "+this.precio);
	}

}
