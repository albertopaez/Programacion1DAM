package ejerciciosProgramacion_3_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_3_1_07 {

	public static void main(String[] args) throws NumberFormatException, NegativeArraySizeException, IOException {

		int longitud = 1; // longitud del array
		boolean failsafe = true;

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

		do {			//estructura para asegurarse de que se recibe el tipo de dato correcto por consola
			try {
				System.out.println("Introduzca la longitud del array");
				longitud = Integer.parseInt(teclado.readLine());
				failsafe = false;			//variable de control
			} 
			catch (NegativeArraySizeException ex) {
				System.out.println("El array no puede tener longitud negativa");
			} 
			catch (NumberFormatException ex) {
				System.out.println("No ha introducido un numero");
			}

		} while (failsafe);

		int[] array = new int[longitud]; // array con la longitud elegida por el usuario

		double acumulador = 0; // variable donde acumularemos todos los valores del array
		double media = 0; // variable donde calcularemos la media de los valores del array

		System.out.print("Los valores del array son ");

		for (int i = 0; i < longitud; i++) {

			array[i] = (int) (Math.random() * 100);

			System.out.print(array[i] + " ");

			acumulador = acumulador + array[i];
		}

		System.out.println();

		media = acumulador / array.length;

		System.out.println("El sumatorio de todos los valores del array es " + acumulador
				+ " y la media de los mismos es " + media);
	}

}
