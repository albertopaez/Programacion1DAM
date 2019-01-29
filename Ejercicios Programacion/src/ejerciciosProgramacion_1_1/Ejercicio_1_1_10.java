package ejerciciosProgramacion_1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_1_1_10 {
	public static void main(String args[]) throws IOException {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		double intentos = 0;// acumulador de intentos
		double ni = 0;// numero introducido
		double ns;// numero secreto
		boolean failsafe = true;

		ns = Math.floor(Math.random() * 100) + 1;// generamos un numero aleatorio del 1 al 100
		do { // estructura para asegurarse de que se recibe el tipo de dato correcto por
				// consola
			try {
				System.out.println("Adivine el numero (de 1 a 100):");
				ni = Double.parseDouble(teclado.readLine());

				failsafe = false; // variable de control
			} catch (NumberFormatException ex) {
				System.out.println("No ha introducido un comando valido");
			}
		} while (failsafe);
		do {
			if (ns > ni) {// comprobamos si el numero secreto es mayor al introducido
				System.out.println("Muy bajo");
			} else {// comprobamos si el numero secreto es mayor al introducido
				System.out.println("Muy alto");
			}
			intentos++;
			ni = Double.parseDouble(teclado.readLine());
		} while (ns != ni);// bucle del que salimos cuando el numero secreto y el introducido coinciden
		System.out.println(
				"Correcto, el numero secreto es " + ns + " y usted lo ha adivinado en " + intentos + " intentos.");
	}

}
