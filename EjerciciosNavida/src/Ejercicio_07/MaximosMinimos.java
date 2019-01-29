package Ejercicio_07;

import java.io.IOException;
import java.util.Arrays;

public class MaximosMinimos {
	public static void main(String[] args) throws IOException {

		int[][] matrizA = new int[3][3];
		int[][] matrizB = new int[3][3];
		int mayor = 0;
		int menor = 20;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrizA[i][j] = (int) (Math.random() * 20);
				matrizB[i][j] = (int) (Math.random() * 20);
			}
		}
		
		System.out.println("Matriz A antes del intercambio: "+Arrays.deepToString(matrizA)+
				"\nMatriz B antes del intercambio: "+Arrays.deepToString(matrizB));

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (matrizA[i][j] < menor) {
					menor = matrizA[i][j];
				}
				if (matrizB[i][j] > mayor) {
					mayor = matrizB[i][j];
				}

			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (matrizA[i][j] == menor) {
					matrizA[i][j] = mayor;
				}
				if (matrizB[i][j] == mayor) {
					matrizB[i][j] = menor;
				}
			}
		}

		System.out.println("Matriz A despues del intercambio: "+Arrays.deepToString(matrizA)+
				"\nMatriz B despues del intercambio: "+Arrays.deepToString(matrizB));
		
		
	}
}
