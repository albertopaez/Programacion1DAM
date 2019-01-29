package ejerciciosProgramacion_1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_1_1_18 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int a;
		int aux;
		int b;
		int c = 0;
		int n = 0;
		boolean failsafe;
		do { // estructura para asegurarse de que se recibe el tipo de dato correcto por
				// consola
			failsafe = true;
			try {
				System.out.println("introduzca el numero hasta el que quiere que se calculen"
						+ " los centros numericos desde el cero");
				n = Integer.parseInt(bufEntrada.readLine());
				failsafe = false; // variable de control
			} catch (NumberFormatException ex) {
				System.out.println("No ha introducido un comando valido");
			}
		} while (failsafe);
		while (n > 1) {// hacemos un ciclo que recorra todos los numeros desde 0 hasta el numero
						// introducido
			aux = n;
			a = 0;
			b = 0;
			while (aux > 0) {// calculamos la suma desde el numero hasta 0
				aux--;
				a = a + aux;
			}
			aux = n;
			while (b < a) {// acumulamos la suma de los valores desde el numero hasta que la suma sea mayor
							// o igual al calculo anterior
				aux++;
				b = b + aux;
			}
			if (a == b) {// si los 2 acumuladores antriores son iguales, el numero es amigo
				System.out.println(n + " es un centro numerico");
				c++;
			}
			n--;// reducimos el numero introducido por comando en uno y empezamos el siguiente
				// ciclo hasta 0
		}
		System.out.println("Hay " + c + " centros numericos en total");
	}

}
