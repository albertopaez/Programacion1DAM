package ejerciciosProgramacion_3_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ejercicio_3_1_10 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int[] array = new int[25];
		int numero = 0; // variable donde almacenar el numero introducido por consola
		int contador = 0; // variable para contar las veces que un valor del array es igual a numero
		boolean failsafe = true;

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

		do { // estructura para asegurarse de que se recibe el tipo de dato correcto por
				// consola
			try {
				System.out.println("Introduzca numero entero entre 1 y 20");
				numero = Integer.parseInt(teclado.readLine());

				failsafe = false; // variable de control
			} catch (NumberFormatException ex) {

				System.out.println("No ha introducido un numero entero");
			}
		} while (failsafe || numero < 1 || numero > 20);

		for (int i = 0; i <= 24; i++) {

			array[i] = (int) (Math.random() * 20 + 1);

			if (array[i] == numero) {
				contador++;
			}

		}

		System.out.println("Los datos del vector son: " + Arrays.toString(array));
		System.out.println("La cantidad de veces que el " + numero + " se encuentra en el array es " + contador);

	}

}
