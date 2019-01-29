package ejerciciosProgramacion_1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_1_1_03 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int n = 0;
		int numero = 0;
		int d = 0;
		int p = 0;
		boolean failsafe = true;

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

		do { // estructura para asegurarse de que se recibe el tipo de dato correcto por
				// consola

			try {

				System.out.println("Ingrese un numero igual o menor a 100");
				n = Integer.parseInt(teclado.readLine());
				numero = n;

				failsafe = false; // variable de control
			}

			catch (NumberFormatException ex) {

				System.out.println("No ha introducido un numero");
			}

		} while (failsafe);

		while (n > 0) { // hacemos un bucle para recorrer todos los numeros desde n a 0

			for (int i = 1; i <= n / 2; i++) { // calculamos la cantidad de divisores de la iteración de n

				if (n % i == 0) {
					d++;
				}

			}

			if (d == 1) { // si el numero de divisores es 1 sin contanse a si mismo es primo, por lo que sumamos uno al contador
							// de primos
				p++;
			}

			d = 0; // restablecemos a 0 el contador de divisores
			n--; // restamos uno al numero para comenzar la siguiente iteración

		}

		System.out.println("La cantidad de numeros primos entre 0 y " + numero + " es " + p);

	}
}
