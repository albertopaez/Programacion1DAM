package ejerciciosProgramacion_3_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_3_1_11 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int[] vector = new int[20];
		boolean failsafe = true;

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 20; i++) { // registramos lo 20 valores del array
			do { // estructura para asegurarse de que se recibe el tipo de dato correcto por
					// consola
				try {
					System.out.println("Introduzca numero");
					vector[i] = Integer.parseInt(teclado.readLine());

					failsafe = false; // variable de control
				} catch (NumberFormatException ex) {

					System.out.println("No ha introducido un numero, sera contado como un 0");
				}
			} while (failsafe);
		}

		for (int i = 19; i >= 0; i--) { // mostramos los 20 valores del array en orden inverso
			System.out.print(vector[i]);
			System.out.println();
		}

	}

}
