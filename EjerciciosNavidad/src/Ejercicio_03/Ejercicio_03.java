package Ejercicio_03;

import java.io.IOException;
import java.util.Arrays;

public class Ejercicio_03 {
	public static void main(String[] args) throws IOException {

		int[][] matriz = new int[3][3];
		int mayor = 0;
		String coordenadasMayor = null;
		int menor = 100;
		String coordenadasMenor = null;

		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				matriz[i][j] = (int) (Math.random() * 100);
			}
		}

		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				if (matriz[i][j] > mayor) {
					mayor = matriz[i][j];
					coordenadasMayor = (i + 1) + ", " + (1 + j);
				}

				if (matriz[i][j] < menor) {
					menor = matriz[i][j];
					coordenadasMenor = (i + 1) + ", " + (1 + j);
				}

			}
		}

		System.out.println("Matriz: " + Arrays.deepToString(matriz) + "\nLa dirección del numero mas pequeño es: "
				+ coordenadasMenor + "\nLa dirección del numero mas grande es: " + coordenadasMayor);

	}
}
