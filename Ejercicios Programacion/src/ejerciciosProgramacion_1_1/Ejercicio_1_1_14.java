package ejerciciosProgramacion_1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_1_1_14 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double dd = 0;
		double ddf;
		double iv;
		double ivf = 0;
		double km = 0;
		double sf;
		double sff = 0;
		double sl;
		boolean failsafe = true;
		do { // estructura para asegurarse de que se recibe el tipo de dato correcto por
				// consola
			try {
				System.out.println("Introduzca el sueldo fijo");
				sf = Double.parseDouble(bufEntrada.readLine());
				sff = sf - (sf / 100) * 18;// descontamos la retención del IRPF
				System.out.println("Introduzca el importe de ventas");
				iv = Double.parseDouble(bufEntrada.readLine());
				ivf = (iv / 100) * 5;// calculamos el importe de ventas
				System.out.println("Introduzca el kilometraje");
				km = Double.parseDouble(bufEntrada.readLine());// introducimos el kilometraje
				System.out.println("Introduzca dias de desplazamiento");
				dd = Double.parseDouble(bufEntrada.readLine());
				ddf = dd * 60;// calculamos las dietas por dia de desplazamiento
				// le añadimos al sueldo con el IRPF hecho importe de ventas, kilometraje y dias
				// de desplazamiento
				sl = sff + ivf + km + ddf - 150;
				System.out.println("El suelo liquido es " + sl);
				failsafe = false; // variable de control
			} catch (NumberFormatException ex) {
				System.out.println("No ha introducido un comando valido");
			}
		} while (failsafe);

	}

}