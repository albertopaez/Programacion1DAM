package ejercicio_03;

/**
 * <h2>Clase Cuenta, se usa para almacenar y acceder a cuentas bancarias en una BD</h2>
 * @author Alberto Páez Tudela
 * @since 03-12-2018
*/
public class Cuenta {
	// Variable global usada para generar los numeros de cuenta
	public static long generador_cuenta =10001;
	// Atributo numero de cuenta, sirve como identificador de la cuenta
	private long numero_cuenta;
	// Atributo dni del propientario, sirve como identificador del propietario
	private long dni;
	// Atributo saldo de la cuenta
	private double saldo;
	// Atributo interes anual de la cuenta
	private double interes_anual;
	
	/**
	 * Constructor sin parametros
	 * Crea una cuenta bancaria generica por defecto
	 * El numero de cuenta se genera de forma automatica y siempre es distinto de cualquier otra cuenta
	 */
	public Cuenta(){
		generador_cuenta++;
		this.numero_cuenta=generador_cuenta;
	}
	
	/**
	 * Constructor con 3 parametros
	 * Crea un objeto cuenta con dni, salado e interes anual
	 * El numero de cuenta se genera de forma automatica y siempre es distinto de cualquier otra cuenta
	 * @param dni
	 * @param saldo
	 * @param interes anual
	 */
	public Cuenta(long dni, double saldo, double interes_anual){
		generador_cuenta++;
		this.numero_cuenta=generador_cuenta;
		this.dni=dni;
		this.saldo=saldo;
		this.interes_anual=interes_anual;
	}
	
	//Métodos públicos
	
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getInteres_anual() {
		return interes_anual;
	}
	public void setInteres_anual(double interes_anual) {
		this.interes_anual = interes_anual;
	}
	public long getNumero_cuenta() {
		return numero_cuenta;
	}
	
	/**
	 * Actualiza el saldo aplicandole el interes anual
	 */
	public void actualizarSaldo() {
		this.saldo=this.saldo+this.saldo/(this.interes_anual/365);
	}
	
	/**
	 * Ingresa saldo en la cuenta
	 * @param saldo
	 */
	public void ingresar (double saldo) {
		this.saldo+=saldo;
	}
	
	/**
	 * Retira saldo de la cuenta asegunrandose de no llegar a numeros rojos
	 * @param saldo
	 */
	public void retirar (double saldo) {
		if (this.saldo >0 && saldo <= this.saldo) {
			this.saldo-=saldo;
		} else {
			System.out.println("No puede retirar esa cantidad ahora mismo");
		}
	}
	
	/**
	 * Devuelve los datos de la cuenta con strings para facilitar la legibilidad
	 */
	public String muestraCuenta() {
		return "Numero de cuenta: " + numero_cuenta +
				"\nDNI: " + dni +
				"\nSaldo: " + saldo +
				"\nInteres anual: " + interes_anual;
	}
	

}
