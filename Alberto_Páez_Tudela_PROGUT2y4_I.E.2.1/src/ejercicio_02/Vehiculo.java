package ejercicio_02;

/**
 * <h2>Clase Vehiculo, se usa para almacenar y acceder a vehiculos en una BD</h2>
 * @author Alberto P�ez Tudela
 * @since 03-12-2018
*/

public class Vehiculo {
	/**
	 * Atributo modelo del veihuculo
	 */
	private String modelo;
	/**
	 * Atributo potencia del veihuculo
	 */
	private double potencia;
	/**
	 * Atributo que indica si el veihuculo tiene tracci�n a 4 ruedas o no
	 */
	private boolean cRuedas;
	
	/**
	 * Constructor con 1 parametros
	 * Crea un objeto vehiculo con modelo, potencia y tracci�n a 4 ruedas del vehiculo
	 * @param modelo
	 */
	public Vehiculo(String modelo){
		this.modelo=modelo;
		this.potencia=99.9;
		this.cRuedas=true;
	}
	
	//M�todos p�blicos
	
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	public boolean iscRuedas() {
		return cRuedas;
	}
	public boolean getcRuedas() {
		return cRuedas;
	}
	public void setCRuedas(boolean cRuedas) {
		this.cRuedas = cRuedas;
	}
	
	/**
	 * Devuelve los datos del vehiculo con strings para facilitar la legibilidad
	 */
	public String imprimir() {
		String traccion;
		if (cRuedas = true) {
			traccion = "Si";
		}else {
			traccion = "No";
		}
		
		return "Modelo: " + modelo + "\nPotencia: " + potencia + "\nCon tracci�n cuentra ruedas: " + traccion;
		
	}

}
