package ejercicio_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import utilidad.Prueba;

/**
 * <h2>Clase Alimento, se usa para almacenar alimentos en una BD</h2>
 * @author Alberto Páez Tudela
 * @since 03-12-2018
*/
public class Alimento {
	//Atributo nombre del alimento
	private String nombre;
	//Atributo cantidad de lipidos en % del alimento
	private double lipidos;
	//Atributo cantidad de hidratos de carbono en % del alimento
	private double hidratos;
	//Atributo cantidad de proteinas en % del alimento
	private double proteinas;
	//Atributo orgigen del alimento, true=origen animal false=no origen animal
	private boolean origen;
	//Atributo cantidad de vitaminas del alimento: "A" (alto) "M" (medio) o "B" (bajo)
	private String vitaminas;
	//Atributo cantidad de minerales del alimento: "A" (alto) "M" (medio) o "B" (bajo)
	private String minerales;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Prueba p = new Prueba();

	/**
	 * Constructor sin parametros
	 * Crea un alimento generico por defecto con todos los atributos
	 */
	public Alimento(String nombre) {
		this.nombre = nombre;
		this.lipidos = 33.12;
		this.hidratos = 54.6;
		this.proteinas = 6.13;
		this.origen = false;
		this.vitaminas = "B";
		this.minerales = "B";
	}

	/**
	 * Constructor con 7 parametros
	 * Se asegura de que la suma del % de lipidos hidratos y protenias no supere el 100% obligandote a repetir
	 * la entrada de datos hasta que los numeros cuadren
	 * @param nombre
	 * @param cantidad de lipidos
	 * @param cantidad de hidratos de carbono
	 * @param cantidad de proteinas
	 * @param origen (true si es animal, false si no lo es)
	 * @param cantidad de vitaminas: "A" (alto) "M" (medio) o "B" (bajo)
	 * @param cantidad de minerales: "A" (alto) "M" (medio) o "B" (bajo)
	 */
	public Alimento(String nombre, double lipidos, double hidratos, double proteinas, boolean origen, String vitaminas,
			String minerales) {
		this.nombre = nombre;
		this.lipidos = lipidos;
		this.hidratos = hidratos;
		this.proteinas = proteinas;
		this.origen = origen;
		this.vitaminas = vitaminas;
		this.minerales = minerales;
		if(lipidos+hidratos+proteinas>100) {
			System.out.println("la suma de los percentajes no puede ser superior a 100\nLos valores han sido reseteados a 0");
		}
	}

	public String getNombre() {
		return nombre;
	}

	/**
	 * Introduce un nombre para el alimento por consola de comandos
	 */
	public void setNombre() throws IOException {
		this.nombre = br.readLine();
	}

	public double getLipidos() {
		return lipidos;
	}

	/**
	 * Introduce cantidad de lipidos del alimento por consola de comandos con try catch incluido
	 * se asegura de que la suma de lipidos, hidratos y proteinas no supere el 100%
	 * @see utilidad.Prueba
	 */
	public void setLipidos() throws IOException {
		do {
			this.lipidos = p.tryDoublePositivo();
		}while(this.lipidos+this.hidratos+this.proteinas>0);
	}

	public double getHidratos() {
		return hidratos;
	}

	/**
	 * Introduce cantidad de hidratos de carbono del alimento por consola de comandos con try catch incluido
	 * se asegura de que la suma de lipidos, hidratos y proteinas no supere el 100%
	 * @see utilidad.Prueba
	 */
	public void setHidratos() throws IOException {
		do {
			this.hidratos = p.tryDoublePositivo();
		}while(this.lipidos+this.hidratos+this.proteinas>0);
	}

	public double getProteinas() {
		return proteinas;
	}

	/**
	 * Introduce cantidad de proteinas del alimento por consola de comandos con try catch incluido
	 * se asegura de que la suma de lipidos, hidratos y proteinas no supere el 100%
	 * @see utilidad.Prueba
	 */
	public void setProteinas() throws IOException {
		do {
			this.proteinas = p.tryDoublePositivo();
		}while(this.lipidos+this.hidratos+this.proteinas>0);
	}

	public boolean isOrigen() {
		return origen;
	}

	/**
	 * Cambia el valor del atributo "origen" usando unn string que entra por la consola de comandos
	 * Si recibe "si" (sin tener en cuenta mayusculas) cambiara el valor de origen a true y en cualquier
	 * otro caso lo cambiara a false
	 */
	public void setOrigen() throws IOException {
		String respuesta = br.readLine();
		if (respuesta.equalsIgnoreCase("si")) {
			this.origen = true;
		} else {
			this.origen = false;
		}
	}

	public String getVitaminas() {
		return vitaminas;
	}

	/**
	 * Introduce un string para el atributo "vitaminas" por consola de comandos. El metodo se asegura de
	 * que el valor introducido es "A", o "M" o "B"
	 */
	public void setVitaminas() throws IOException {
		String vitamina;
		do {
			vitamina = br.readLine();
			if (!vitamina.equals("A") && !vitamina.equals("M") && !vitamina.equals("B")) {
				System.out.println("El valor debe ser A (alto) M (medio) o B (bajo)");
			}
		} while (!vitamina.equals("A") && !vitamina.equals("M") && !vitamina.equals("B"));
		this.vitaminas = vitamina;
	}

	public String getMinerales() {
		return minerales;
	}

	/**
	 * Introduce un string para el atributo "minerales" por consola de comandos. El metodo se asegura de
	 * que el valor introducido es "A", o "M" o "B"
	 */
	public void setMinerales() throws IOException {
		String mineral;
		do {
			mineral = br.readLine();
			if (!mineral.equals("A") && !mineral.equals("M") && !mineral.equals("B")) {
				System.out.println("El valor debe ser A (alto) M (medio) o B (bajo)");
			}
		} while (!mineral.equals("A") && !mineral.equals("M") && !mineral.equals("B"));
		this.minerales = mineral;
	}

	/**
	 * Devuelve true si la cantidad de lipidos es menor al 20% y vitaminas es distinto de "B"
	 */
	public boolean esDietetico() {
		if (lipidos < 20 && !vitaminas.equals("B")) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Devuelve "Si" si esDietetico devuelve true y devuelve "No" si esDietetico devuelve false
	 * @see esDietetico()
	 */
	public String muestraDietetico() {
		if (this.esDietetico()) {
			return "Si";
		} else {
			return "No";
		}

	}

	/**
	 * Devuelve "Animal" si origen es igual a true y devuelve "No animal" si origen es igual a false
	 * @see esDietetico()
	 */
	public String muestraOrigen() {
		if (origen == true) {
			return "Animal";
		} else {
			return "No animal";
		}
	}

	/**
	 * Devuelve los datos del alimento con strings para facilitar la legibilidad 
	 */
	public String muestraAlimento() {
		return "\nNombre: " + this.nombre + "\nContenido de lipidos: " + this.lipidos + "%\nHidratos de carbono: "
				+ this.hidratos + "%\nProteinas: " + this.proteinas + "%\nOrigen: " + this.muestraOrigen()
				+ "\nConteindo de vitaminas: " + vitaminas + "\nContenido de minerales: " + minerales
				+ "\nEs ditetico: " + this.muestraDietetico();
	}

}
