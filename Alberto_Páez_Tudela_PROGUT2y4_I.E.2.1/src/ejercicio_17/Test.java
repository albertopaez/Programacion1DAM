package ejercicio_17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h2>Clase Test, se usa para testear las clases Ordenador, Portatil y Servidor</h2>
 * @author Alberto Páez Tudela
 * @since 03-12-2018
*/
public class Test {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * Introduce un integer por consola aplicando los try catch y asegurando de que el comando es valido y 
	 * con valor 0 o mayor
	 */
	public int tryIntegerPositivo() throws IOException {
		int numero = 0;
		boolean failsafe = true;
		do {
			try {
				numero = Integer.parseInt(br.readLine());
				failsafe = false;
			} catch (NumberFormatException ex) {
				System.out.println("Comando invalido");
			}
			if (numero < 0) {
				System.out.println("Comando invalido");
				failsafe = true;
			}
		} while (failsafe);
		return numero;
	}

	/**
	 * Introduce un double por consola aplicando los try catch y asegurando de que el comando es valido y 
	 * con valor 0 o mayor
	 */
	public double tryDoublePositivo() throws IOException {
		double numero = 0;
		boolean failsafe = true;
		do {
			try {
				numero = Double.parseDouble(br.readLine());
				failsafe = false;
			} catch (NumberFormatException ex) {
				System.out.println("Comando invalido");
			}
			if (numero < 0) {
				System.out.println("Comando invalido");
				failsafe = true;
			}
		} while (failsafe);
		return numero;
	}

	/**
	 * Introduce un integer por consola aplicando los try catch y asegurando de que el comando es valido y 
	 * con valor mayor a 14, para el tamaño del monitor de un servidor
	 */
	public int MonitorMayor14() throws IOException {
		int numero = 0;
		boolean failsafe = true;
		do {
			try {
				numero = Integer.parseInt(br.readLine());
				failsafe = false;
			} catch (NumberFormatException ex) {
				System.out.println("Comando invalido");
			}
			if (numero < 14) {
				System.out.println("Comando invalido");
				failsafe = true;
			}
		} while (failsafe);
		return numero;
	}

	/**
	 * Introduce un string por consola asegurandose de que el string introducido forma parte de la lista
	 * de procesadores admitidos
	 */
	public String ListaProcesadores() throws IOException {
		String modelo;
		boolean failsafe = true;
		do {
			modelo = br.readLine();
			failsafe = false;

			if (modelo.contains("Core i3") || modelo.contains("Core i5") || modelo.contains("Core i7")
					|| modelo.contains("Core i9")) {
				
			}else {
				System.out.println("Comando invalido");
				failsafe = true;
			}
		} while (failsafe);
		return modelo;
	}
	
	/**
	 * Introduce un string por consola asegurandose de que no es un string vacio
	 */
	public String stringNoNulo() throws IOException {
		String modelo;
		boolean failsafe = true;
		do {
			modelo = br.readLine();
			failsafe = false;

			if (modelo.isEmpty()==true) {
				System.out.println("Comando invalido");
				failsafe = true;
			}
		} while (failsafe==true);
		return modelo;
	}

	public static void main(String[] args) throws IOException {

		Test t = new Test();
		
		System.out.println("Introduzca en orden: Memoria RAM, capacidad del disco duro,  "
				+ "precio, modelo del procesador, modelo de la tarjeta gráfica, "
				+ "tamaño del monitor, modelo del teclado y modelo del ratón");
		Servidor s1 = new Servidor(t.tryIntegerPositivo(), t.tryIntegerPositivo(), t.tryDoublePositivo(), 
				t.ListaProcesadores(), t.stringNoNulo(), t.MonitorMayor14(), t.stringNoNulo(),
				t.stringNoNulo());
		s1.mostrar();
		System.out.println("Introduzca en orden: Memoria RAM, capacidad del disco duro,  "
				+ "precio, modelo del procesador, modelo de la tarjeta gráfica, "
				+ "tamaño del monitor, modelo del teclado y modelo del ratón");
		Servidor s2 = new Servidor(t.tryIntegerPositivo(), t.tryIntegerPositivo(), t.tryDoublePositivo(), 
				t.ListaProcesadores(), t.stringNoNulo(), t.MonitorMayor14(), t.stringNoNulo(),
				t.stringNoNulo());
		s2.mostrar();
		System.out.println("Introduzca en orden: Memoria RAM, capacidad del disco duro,  "
				+ "precio, modelo del procesador, modelo de la tarjeta gráfica, "
				+ "tamaño del monitor y peso");
		Portatil p1 = new Portatil(t.tryIntegerPositivo(), t.tryIntegerPositivo(), t.tryDoublePositivo(), 
				t.ListaProcesadores(), t.stringNoNulo(), t.stringNoNulo(), t.tryIntegerPositivo(),
				t.tryDoublePositivo());
		p1.mostrar();
		System.out.println("Introduzca en orden: Memoria RAM, capacidad del disco duro,  "
				+ "precio, modelo del procesador, modelo de la tarjeta gráfica, "
				+ "tamaño del monitor y peso");
		Portatil p2 = new Portatil(t.tryIntegerPositivo(), t.tryIntegerPositivo(), t.tryDoublePositivo(), 
				t.ListaProcesadores(), t.stringNoNulo(), t.stringNoNulo(), t.tryIntegerPositivo(),
				t.tryDoublePositivo());
		p2.mostrar();
		Servidor s3 = new Servidor();
		s3.mostrar();
		System.out.println("Introduzca en orden: Memoria RAM, capacidad del disco duro,  "
				+ "precio, modelo del procesador, modelo de la tarjeta gráfica, "
				+ "tamaño del monitor, modelo del teclado y modelo del ratón");
		s3.establecer(t.tryIntegerPositivo(), t.tryIntegerPositivo(), t.tryDoublePositivo(),
				t.ListaProcesadores(), t.stringNoNulo(), t.MonitorMayor14(), t.stringNoNulo(),
				t.stringNoNulo());
		s3.mostrar();
		Portatil p3 = new Portatil();
		p3.mostrar();
		System.out.println("Introduzca en orden: Memoria RAM, capacidad del disco duro,  "
				+ "precio, modelo del procesador, modelo de la tarjeta gráfica, "
				+ "tamaño del monitor y peso");
		p3.establecer(t.tryIntegerPositivo(), t.tryIntegerPositivo(), t.tryDoublePositivo(),
				t.ListaProcesadores(), t.stringNoNulo(), t.stringNoNulo(), t.tryIntegerPositivo(),
				t.tryDoublePositivo());
		p3.mostrar();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
