package Ejercicio_05;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import utilidad.Prueba;

public class Ejercicio_05 {
	public static void main(String[] args) throws IOException {

		Prueba p = new Prueba();

		System.out.println("Introduzca la longitud del array");

		int longitud = p.tryIntegerPositivo();

		int[] vector = new int[longitud];
		ArrayList<Integer> primos = new ArrayList<Integer>();

		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) (Math.random() * 100);
		}

		for (int i = 0; i < vector.length; i++) {
			boolean primo = true;
			for (int j = 2; j <= vector[i] / 2; j++) {
				if (vector[i] % j == 0) {
					primo = false;
					break;
				}
			}
			if (primo == true) {
				primos.add(vector[i]);
			}
		}
		System.out.println("El vector es: " + Arrays.toString(vector) + 
				"\nLos numeros primos dentro del vector son: "
				+ primos.toString());

	}
}
