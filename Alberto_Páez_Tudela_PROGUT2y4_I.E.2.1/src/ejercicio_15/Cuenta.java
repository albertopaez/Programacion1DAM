package ejercicio_15;

/**
 * <h2>Clase Cuenta, se usa para almacenar y acceder a cuentas bancarias en una BD</h2>
 * @author Alberto Páez Tudela
 * @since 03-12-2018
*/
public class Cuenta {
	//Atributo cantidad de saldo actual de la cuenta
	private float saldo;

	/**
	 * Constructor con el saldo inicializado a 0
	 */
	public Cuenta() {
		this.saldo = 0;
	}

	/**
	 * Constructor con 1 parametro de entrada
	 * @param saldo
	 */
	public Cuenta(float saldo) {
		this.saldo = saldo;
	}

	/**
	 * Ingresa saldo en la cuenta y luego de muestra cual es el saldo tras la operación
	 */
	public void ingresar(float c) {
		this.saldo += c;
		System.out.println("Su saldo actual es de "+this.saldo);
	}

	/**
	 * Retira saldo de la cuenta y luego de muestra cual es el saldo tras la operación
	 * Se asegura de que el saldo no llegue a numeros negativos
	 */
	public void extraer(float c) {
		if (this.saldo >= c) {
			this.saldo-=c;
			System.out.println("Su saldo actual es de "+this.saldo);
		}else {
			System.out.println("No tiene suficiente saldo para realizar la operación");
			System.out.println("Su saldo actual es de "+this.saldo);
		}
	}

	public float getSaldo() {
		return saldo;
	}

}
