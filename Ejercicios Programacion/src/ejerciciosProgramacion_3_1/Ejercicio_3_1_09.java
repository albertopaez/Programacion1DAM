package ejerciciosProgramacion_3_1;

import java.util.Arrays;

public class Ejercicio_3_1_09 {

	public static void main(String[] args) {

		int[] vector = new int[20];
		int numero = 0; // variable para comparar datos del vector y ver cual es mayor
		int posicion = 0; // variable para almacenar la posición del dato de mayor valor

		for (int i = 0; i <= 19; i++) {

			vector[i] = (int) (Math.random() * 100 + 1);

			if (vector[i] > numero) {
				numero = vector[i];
				posicion = i + 1;
			}

		}

		System.out.println("Los datos del vector son: " + Arrays.toString(vector));
		System.out.println("El dato de mayor valor esta en la posición " + posicion + " y su valor es " + numero);

	}

}
