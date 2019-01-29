package personal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EstadisticaDadoObjetivo {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int a = 0;
		// las variables ax son contadores de veces que ha salido la cara x
		double a1 = 0;
		double a2 = 0;
		double a3 = 0;
		double a4 = 0;
		double a5 = 0;
		double a6 = 0;
		double a7 = 0;
		double a8 = 0;
		double a9 = 0;
		double a10 = 0;
		double pifia = 0;
		double aux;// auxiliar para el bucle de las tiradas
		double n = 0;// numero de tiradas
		// las variables ax son el procentaje de veces que ha salido la cara x
		double p1 = 0;
		double p2 = 0;
		double p3 = 0;
		double p4 = 0;
		double p5 = 0;
		double p6 = 0;
		double p7 = 0;
		double p8 = 0;
		double p9 = 0;
		double p10 = 0;
		double ppifia;
		int r1;
		int r2;
		int r3;
		boolean failsafe = true;
		do { // estructura para asegurarse de que se recibe el tipo de dato correcto por
				// consola
			try {
				System.out.println("Introduzca el numero de tiradas de dado que desea realizar:");
				n = Double.parseDouble(bufEntrada.readLine());
				failsafe = false; // variable de control
			} catch (NumberFormatException ex) {
				System.out.println("No ha introducido un comando valido");
			}
		} while (failsafe);
		aux = n;

		while (aux > 0) {

			r1 = (int) (Math.floor(Math.random() * 10) + 1);
			r2 = (int) (Math.floor(Math.random() * 10) + 1);
			r3 = (int) (Math.floor(Math.random() * 10) + 1);

			if (r1 == 1 && r2 == 1 && r3 == 1) {
				pifia++;
			}

			if ((r1 >= r2 && r1 <= r3) || (r1 >= r3 && r1 <= r2)) {
				a = r1;
			} else {
				if ((r2 >= r1 && r2 <= r3) || (r2 >= r3 && r2 <= r1)) {
					a = r2;
				} else {
					if ((r3 >= r2 && r3 <= r1) || (r3 >= r1 && r3 <= r2)) {
						a = r3;
					}
				}
			}

			switch (a) {
			case 1:
				a1 = a1 + 1;
				break;
			case 2:
				a2 = a2 + 1;
				break;
			case 3:
				a3 = a3 + 1;
				break;
			case 4:
				a4 = a4 + 1;
				break;
			case 5:
				a5 = a5 + 1;
				break;
			case 6:
				a6 = a6 + 1;
				break;
			case 7:
				a7 = a7 + 1;
				break;
			case 8:
				a8 = a8 + 1;
				break;
			case 9:
				a9 = a9 + 1;
				break;
			case 10:
				a10 = a10 + 1;
				break;

			}
			aux--;
		}
		p1 = (a1 / n) * 100;
		p2 = (a2 / n) * 100;
		p3 = (a3 / n) * 100;
		p4 = (a4 / n) * 100;
		p5 = (a5 / n) * 100;
		p6 = (a6 / n) * 100;
		p7 = (a7 / n) * 100;
		p8 = (a8 / n) * 100;
		p9 = (a9 / n) * 100;
		p10 = (a10 / n) * 100;
		ppifia = (pifia / n) * 100;
		System.out.println("Ha salido 1 un " + p1 + "% de las cuales ha sido pifia un " + ppifia + "%");
		System.out.println("Ha salido 2 un " + p2 + "%");
		System.out.println("Ha salido 3 un " + p3 + "%");
		System.out.println("Ha salido 4 un " + p4 + "%");
		System.out.println("Ha salido 5 un " + p5 + "%");
		System.out.println("Ha salido 6 un " + p6 + "%");
		System.out.println("Ha salido 7 un " + p7 + "%");
		System.out.println("Ha salido 8 un " + p8 + "%");
		System.out.println("Ha salido 9 un " + p9 + "%");
		System.out.println("Ha salido 10 un " + p10 + "%");
	}

}