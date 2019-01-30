package Ejercicio_01;

import java.io.IOException;
import java.util.Arrays;

import utilidad.Prueba;

public class Ejercicio_01 {
	public static void main(String[] args) throws IOException {

		int factorial = 1;

		int numero;

		int[] vector = new int[20];

		Prueba p = new Prueba();

		for (int i = 0; i < 20; i++) {

			System.out.println("Introduzca un numero cuyo factorial quiera introducir en el array");

			numero = p.tryIntegerPositivo();

			if (numero == 0 || numero == 1) {
				factorial = 1;
			} else {
				do {
					factorial = factorial * numero;
					numero--;
				} while (numero != 0);
			}

			vector[i] = factorial;

			factorial = 1;

		}

		System.out.println(Arrays.toString(vector));

	}

}
