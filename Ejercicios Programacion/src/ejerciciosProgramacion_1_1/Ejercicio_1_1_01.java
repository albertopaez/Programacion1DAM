package ejerciciosProgramacion_1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_1_1_01 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		double nota=0; // acumulador de las notas introducidas por comando
		double media;
		double mediaFinal;
		boolean failsafe = true;

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

		do { // estructura para asegurarse de que se recibe el tipo de dato correcto por
				// consola

			try {
				System.out.println("Introduzca la nota de Programación");
				nota = Double.parseDouble(teclado.readLine());
				System.out.println("Introduzca la nota de Lenguaje de Marcas");
				nota += Double.parseDouble(teclado.readLine());
				System.out.println("Introduzca la nota de Bases de Datos");
				nota += Double.parseDouble(teclado.readLine());
				System.out.println("Introduzca la nota de Entornos de Desarrollo");
				nota += Double.parseDouble(teclado.readLine());
				System.out.println("Introduzca la nota de Sistemas Informaticos");
				nota += Double.parseDouble(teclado.readLine());
				System.out.println("Introduzca la nota de Formación y Orientación Laboral");
				nota += Double.parseDouble(teclado.readLine());

				failsafe = false; // variable de control
			}

			catch (NumberFormatException ex) {

				System.out.println("No ha introducido un comando valido");

			}

		} while (failsafe);

		media = (nota) / 6; // calculamos la media

		mediaFinal = Math.floor(media * 10) / 10; // reducimos la cantidad de decimales a 1

		System.out.println("la nota media es " + mediaFinal);

	}

}
