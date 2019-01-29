package ejerciciosProgramacion_1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_1_1_15 {

	public static void main(String args[]) throws IOException {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		int it = 0;
		int m1;//variable donde guardaremos el mayor numero
		int m2;//variable donde guardaremos el segundo mayor numeor
		int n = 0;
		boolean failsafe = true;
		do {
			do { // estructura para asegurarse de que se recibe el tipo de dato correcto por
					// consola
				try {
					System.out.println("Introduzca la cantidad de numeros a evaluar (como minimo 2)");
					it = Integer.parseInt(teclado.readLine());
					failsafe = false; // variable de control
				} catch (NumberFormatException ex) {
					System.out.println("No ha introducido un comando valido");
				}
			} while (failsafe);
			if (it < 2) {
				System.out.println("Cantidad de numeros no valida, introduzca comando de nuevo");
			}
		} while (it < 2); // controlamos que la cantidad de numeros a comparar no sea menor a 2
		m1 = 0;
		m2 = 0;
		for (int i = 1; i <= it; i++) {//bucle para introducir y procesar tantos numeros como nos hayan indicado
			do { // estructura para asegurarse de que se recibe el tipo de dato correcto por
					// consola
				failsafe = true;
				try {
					System.out.println("Introduzca un numero entero");
					n = Integer.parseInt(teclado.readLine());
					failsafe = false; // variable de control
				} catch (NumberFormatException ex) {
					System.out.println("No ha introducido un comando valido");
				}
			} while (failsafe);
			if (n > m1) {//comprobamos si el numero nuevo es mayor al mayor numeor guardado
				m2 = m1;//si es asi el segundo mayor valor adquiere el valor dle primero
				m1 = n;//y el mayor adquiere el nuevo valor
			} else {//sino comprobamos si el numero es mayor al segundo mayor valor hasta ahora
				if (n > m2) {
					m2 = n;//y si es asi sustituimos el segundo mayor valor por el nuevo
				}
			}
		}

		System.out.println(" Los 2 numeros mayores de la secuencia son " + m1 + " y " + m2);
	}

}