package ejerciciosProgramacion_3_1;

import java.io.IOException;

public class Ejercicio_3_1_14 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int[][] matriz = new int[4][2]; // matriz de 5 filas x 8 columnas
		int aux = 0; // variable auxiliar
		int suma = 0; // acumulador de todos los valores de la matriz
		int menor = 10; // variable donde guardar el menor valor de la matriz
		int mayor = 0; // variable donde guardar el mayor valor de la matriz

		for (int i = 0; i < matriz.length; i++) { // generamos la matriz
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * 10);
			}
		}

		for (int i = 0; i < matriz.length; i++) { // recorremos la matriz ya generada
			for (int j = 0; j < matriz[i].length; j++) {
				aux = matriz[i][j];
				suma = suma + aux;
				if (aux > mayor) {
					mayor = aux;
				}
				if (aux < mayor) {
					menor = aux;
				}
			}
		}

		System.out.println("La suma de todos los elementos de la matriz es: " + suma);
		System.out.println("El mayor de todos los elementos de la matriz es: " + mayor);
		System.out.println("El menor de todos los elementos de la matriz es: " + menor);

	}

}
