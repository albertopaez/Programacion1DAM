package personal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class EstadisticaDadosMultiples {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double a = 0;
		double n = 0;// numero de tiradas
		double aux;
		// las variables ax son el procentaje de veces que ha salido la cara x
		double p = 0;
		double d = 0;
		ArrayList<Integer> tirada = new ArrayList<Integer>();

		boolean failsafe = true;
		do { // estructura para asegurarse de que se recibe el tipo de dato correcto por
				// consola
			try {
				System.out.println("Introduzca el numero de tiradas de dado que desea realizar:");
				n = Double.parseDouble(bufEntrada.readLine());
				System.out.println("Introduzca el numero de dados por tirada:");
				d = Double.parseDouble(bufEntrada.readLine());
				failsafe = false; // variable de control
			} catch (NumberFormatException ex) {
				System.out.println("No ha introducido un comando valido");
			}
		} while (failsafe);
		aux = n;

		while (aux > 0) {

			tirada.clear();

			for (int i = 0; i < d; i++) {
				tirada.add((int) (Math.floor(Math.random() * 10) + 1));
			}

			if (tirada.contains(10)) {
				a++;
			}

			aux--;
		}

		p = (a / n) * 100;

		System.out.println("Ha salido al menos un 10 un " + p + "%");
	}

}