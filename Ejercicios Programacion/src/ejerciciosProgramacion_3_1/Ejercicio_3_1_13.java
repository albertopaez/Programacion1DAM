package ejerciciosProgramacion_3_1;

import java.io.IOException;

public class Ejercicio_3_1_13 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int[][] matriz = new int[5][8]; // matriz de 5 filas x 8 columnas

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * 10);
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

	}

}
