package ejerciciosProgramacion_1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_1_1_12 {
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int a;
		// las variables ax son contadores de veces que ha salido la cara x
		double a1;
		double a2;
		double a3;
		double a4;
		double a5;
		double a6;
		double aux;// auxiliar para el bucle de las tiradas
		double n=0;// numero de tiradas
		// las variables ax son el procentaje de veces que ha salido la cara x
		double p1;
		double p2;
		double p3;
		double p4;
		double p5;
		double p6;
		boolean failsafe=true;
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
		a1 = 0;
		a2 = 0;
		a3 = 0;
		a4 = 0;
		a5 = 0;
		a6 = 0;
		while (aux > 0) {
			a = (int) (Math.floor(Math.random() * 6) + 1);// generamos un numero aleatorio que representa la tirada de
															// dados
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
			}
			aux--;
		}
		p1 = (a1 / n) * 100;
		p2 = (a2 / n) * 100;
		p3 = (a3 / n) * 100;
		p4 = (a4 / n) * 100;
		p5 = (a5 / n) * 100;
		p6 = (a6 / n) * 100;
		System.out.println("Ha salido 1 cara un " + p1 + "%");
		System.out.println("Ha salido 2 cara un " + p2 + "%");
		System.out.println("Ha salido 3 cara un " + p3 + "%");
		System.out.println("Ha salido 4 cara un " + p4 + "%");
		System.out.println("Ha salido 5 cara un " + p5 + "%");
		System.out.println("Ha salido 6 cara un " + p6 + "%");
	}

}