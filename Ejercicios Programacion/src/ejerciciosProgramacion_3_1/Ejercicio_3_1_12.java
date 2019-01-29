package ejerciciosProgramacion_3_1;

import java.io.IOException;
import java.util.Arrays;

public class Ejercicio_3_1_12 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int n = 0; // variable para calcular los numeros primos
		int divisor = 0; // variable para almacenar divisores
		int[] array = new int[22];
		// el array es de tamaño 22 porque es la cantidad de numeros primos entre 0 y 80
		// que hay
		int p = 0; // posición del array donde se guardara el numero

		while (n <= 80) { // hacemos un bucle para recorrer todos los numeros desde 0 hasta 80

			for (int i = 1; i <= n / 2; i++) { // calculamos la cantidad de divisores de la iteración de n

				if (n % i == 0) {
					divisor++;
				}

			}

			if (divisor == 1) { // si el numero de divisores es 1 sin contanser a si mismo es primo, por lo que
								// sumamos uno al contador de primos
				array[p] = n;
				p++;
			}

			divisor = 0; // restablecemos a 0 el contador de divisores
			n++; // restamos uno al numero para comenzar la siguiente iteración

		}

		System.out.println(Arrays.toString(array));

	}
}