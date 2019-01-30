package Ejercicio_02;

import java.io.IOException;
import java.util.Arrays;

public class Ejercicio_02 {
	public static void main(String[] args) throws IOException {

		int[][] matrizA = { { 3, 8, 4 }, { 9, 6, 9 }, { 8, 7, 1 } };
		int[][] matrizB = { { 2, 4, 7 }, { 4, 4, 8 }, { 8, 9, 2 } };
		int[][] matriz = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = matrizA[i][j] + matrizB[i][j];
			}
		}

		System.out.println("Matriz A: "+Arrays.deepToString(matrizA));
		System.out.println("Matriz B: "+Arrays.deepToString(matrizB));
		System.out.println("Resultado de la suma de matrices: "+Arrays.deepToString(matriz));

	}
}
