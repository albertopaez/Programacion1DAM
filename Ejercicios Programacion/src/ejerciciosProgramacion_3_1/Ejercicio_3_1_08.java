package ejerciciosProgramacion_3_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ejercicio_3_1_08 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int numero = 0; // Variable para comprobar si el numero introducido es multipo de 3 o no
		int[] array = new int[5]; // array donde almacenar los multiplos de tres

		boolean failsafe = true;

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i <= 4; i++) {	//introducimos valores en los 5 datos del array

			do { // bucle para asegurarnos de que siempre se almacena un multiplo de 3

				do { // estructura para asegurarse de que se recibe el tipo de dato correcto por
						// consola
					try {
						System.out.println("Introduzca un numero multiplo de 3");
						numero = Integer.parseInt(teclado.readLine());

						failsafe = false; // variable de control
					} catch (NumberFormatException ex) {
						System.out.println("No ha introducido un numero");
					}
				} while (failsafe);

				if (numero % 3 == 0 && numero != 0) { 	//si el numero sea multiplo de 3 lo introducimos en el array
					array[i] = numero;
				}else {
					System.out.println("Ese numero no es multiplo de 3");
				}

			} while (numero % 3 != 0 || numero == 0);	//si el numero no es multiplo de 3 repetimos la entrada de numero

		}

		System.out.println("Los datos del array son " + Arrays.toString(array));

	}

}
