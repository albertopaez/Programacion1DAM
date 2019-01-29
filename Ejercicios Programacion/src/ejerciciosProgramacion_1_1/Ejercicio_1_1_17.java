package ejerciciosProgramacion_1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_1_1_17 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int a = 0;
		int b = 0;
		int c = 0;
		int may = 0;// contador numeros mayores a la baliza
		int mayt = 0;
		int men = 0;// contador numeros menores a la baliza
		boolean failsafe;
		do { // estructura para asegurarse de que se recibe el tipo de dato correcto por
				// consola
			failsafe = true;
			try {
				System.out.println("Introduzca el numero baliza");
				b = Integer.parseInt(bufEntrada.readLine());
				System.out.println("Introduzca la cantidad de numeros a comparar");
				c = Integer.parseInt(bufEntrada.readLine());
				failsafe = false; // variable de control
			} catch (NumberFormatException ex) {
				System.out.println("No ha introducido un comando valido");
			}
		} while (failsafe);
		for (int i = 1; i <= c; i++) { //bucle para introducir tantos numeros como nos han indicado
			do { // estructura para asegurarse de que se recibe el tipo de dato correcto por
					// consola
				failsafe = true;
				try {
					System.out.println("Introduzca un numero");
					a = Integer.parseInt(bufEntrada.readLine());
					failsafe = false; // variable de control
				} catch (NumberFormatException ex) {
					System.out.println("No ha introducido un comando valido");
				}
			} while (failsafe);
			if (a < b) {// comprobamos si el numeor es menor a la baliza
				men++;
			}
			if (a > b) {// comprobamos si el numeor es menor a la baliza
				may++;
				mayt = mayt + a;// acumulamos los numeros mayores a la baliza
			}

		}
		System.out.println("Hay " + men + " numeros menores que la baliza, " + may
				+ " numeros mayores que la baliza y la suma de los mayores es " + mayt);
	}
}
