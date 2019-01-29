package ejerciciosProgramacion_1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_1_1_09 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int a = 0; // primer termino de la operación
		int b = 0; // segundo termino de la operación
		int c = 1; // selector de operación a realizar
		boolean failsafe = true;

		do { // bucle para repetir operaciones hasta que el usuario desee salir del programa

			do { // estructura para asegurarse de que se recibe el tipo de dato correcto por
					// consola
				try {
					System.out.println("Introduzca el primer numero:");
					a = Integer.parseInt(bufEntrada.readLine());
					System.out.println("Introduzca el segundo numero:");
					b = Integer.parseInt(bufEntrada.readLine());

					System.out.println("Si desea sumar ambos numeros introduzca 1");
					System.out.println("Si desea restar el segundo numero al primero introduzca 2");
					System.out.println("Si desea multiplicar ambos numeros introduzca 3");
					System.out.println("Si desea divir el primer numero entre el segundo introduzca 4");
					System.out.println("Si desea salir del programa introduzca 5");
					c = Integer.parseInt(bufEntrada.readLine());

					failsafe = false; // variable de control
				} catch (NumberFormatException ex) {
					System.out.println("No ha introducido un comando valido");
				}
			} while (failsafe);

			switch (c) {
			case 1:
				System.out.println("El resultado de la suma es " + (a + b));
				break;
			case 2:
				System.out.println("El resultado de la resta es " + (a - b));
				break;
			case 3:
				System.out.println("El resultado de la multiplicación es " + a * b);
				break;
			case 4:
				try { // estructura para asegurarse de que no dividimos por 0
					if(b==0) {
						System.out.println("No se puede dividir entre 0");
					}else {
						System.out.println("El resultado de la división es " + a / b);
					}
				} catch (ArithmeticException ex) {
					System.out.println("Comando erroneo, introduzca comando de nuevo");
				}

				break;
			case 5:
				break;
			default:
				System.out.println("Comando erroneo, introduzca comando de nuevo");
			}
		} while (c != 5);
	}

}
