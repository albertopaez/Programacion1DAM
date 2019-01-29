package ejerciciosProgramacion_1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_1_1_11 {
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double a = 0;// primer numero
		double aux;
		double b = 0;// segundo numero
		double da;// acumulador de los divisores del primer termino
		double db;// acumulador de los divisores del segundo termino
		double salida = 1;// variable de control para salir del programa
		double ia;// numero de 1 al primer termino que calculamos si son divisores del primer
					// termino
		double ib;// numero de 1 al segundo termino que calculamos si son divisores del segundo
					// termino
		boolean failsafe = true;
		do {
			do { // estructura para asegurarse de que se recibe el tipo de dato correcto por
					// consola
				try {
					System.out.println("Introduzca el primer numero:");
					a = Double.parseDouble(bufEntrada.readLine());
					System.out.println("Introduzca el segundo numero:");
					b = Double.parseDouble(bufEntrada.readLine());
					failsafe = false; // variable de control
				} catch (NumberFormatException ex) {
					System.out.println("No ha introducido un comando valido");
				}
			} while (failsafe);
			ia = 1;
			ib = 1;
			da = 0;
			db = 0;
			while (ia < a) {// recorremos
				aux = a % ia;// calculamo si esta iteracion es divisor del primer termino
				if (aux == 0) {
					da = da + ia;// si es asi la acumulamos
				}
				ia++;
			}
			while (ib < b) {
				aux = b % ib;// calculamo si esta iteracion es divisor del segundo termino
				if (aux == 0) {
					db = db + ib;// si es asi la acumulamos
				}
				ib = ib + 1;
			}
			if (da == b) {// comparamos los acumuladores para saber si los numeros son amigos o no
				if (db == a) {
					System.out.println("Los 2 numeros introducidos son amigos");
				} else {
					System.out.println("los 2 numeros introducidos no son amigos");
				}
			} else {
				System.out.println("los 2 numeros introducidos no son amigos");
			}
			do { // estructura para asegurarse de que se recibe el tipo de dato correcto por
					// consola
				failsafe=true;
				try {
					System.out.println(
							"Si desea cerrar el programa, introduzca 0, si desea continuar introduzca cualquier otro numero");
					salida = Double.parseDouble(bufEntrada.readLine());
					failsafe = false; // variable de control
				} catch (NumberFormatException ex) {
					System.out.println("No ha introducido un comando valido");
				}
			} while (failsafe);
		} while (salida != 0);
	}

}
