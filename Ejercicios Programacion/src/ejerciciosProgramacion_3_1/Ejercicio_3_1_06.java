package ejerciciosProgramacion_3_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ejercicio_3_1_06 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int[] vector = new int[5];
		boolean failsafe = true;

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 5; i++) {
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

		System.out.println(Arrays.toString(vector));

	}

}
