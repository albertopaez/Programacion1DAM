package ejercicio_19;

import java.io.IOException;
import java.util.ArrayList;

import utilidad.Prueba;

public class MainMenuOrdenacion {

	public static void main(String[] args) throws IOException {

		String mostrar = "";
		boolean failsafe = false;
		ArrayList<Integer> col = new ArrayList<Integer>();

		Prueba p = new Prueba();
		MenuOrdenacion m = new MenuOrdenacion();

		System.out.println("Introduzca el tamaño de la matriz caracol\n"
				+ "(tenga en cuenta que luego debera introducir los valores de la matriz uno a uno)");
		int tamanio = p.tryIntegerPositivo();

		int[][] matriz = new int[tamanio][tamanio];
		int[] columna = new int[tamanio];
		int[] vector = new int[tamanio];

		for (int x = 0; x < tamanio; x++) {
			for (int y = 0; y < tamanio; y++) {
				System.out.println("Introduzca el siguiente valor de la matriz");
				matriz[x][y] = p.tryInteger();
			}
		}

		for (int x = 0; x < tamanio; x++) {
			mostrar += "\n";
			for (int y = 0; y < tamanio; y++) {
				mostrar += matriz[x][y] + " ";
			}
		}

		System.out.println(mostrar);
		mostrar = "";

		System.out.println("Ahora creamos el vector con el que compararemos");

		for (int x = 0; x < tamanio; x++) {
			System.out.println("Introduzca el siguiente valor del vector");
			vector[x] = p.tryInteger();
		}

		for (int x = 0; x < tamanio; x++) {
			for (int y = 0; y < tamanio; y++) {

				columna[y] = matriz[y][x];
			}
			System.out.println(m.esIgual(columna, vector) + " " + (x + 1));
			if (m.esIgual(columna, vector) == "el vector es igual a la columna") {
				col.add(x);
			}
		}

		do {
			failsafe = false;
			System.out.println("Introduzca 1 para ordenar la columna por el meotodo de la burbuja\n"
					+ "Introduzca 2 para ordenar la columna por inserción directa");
			int eleccion = p.tryIntegerPositivo();

			int[] aux = vector;

			switch (eleccion) {
			case 1:
				m.burbuja(aux);
				for (int x = 0; x < col.size(); x++) {
					for (int i = 0; i < tamanio; i++) {
						matriz[tamanio-i-1][col.get(x)] = aux[i];
					}
				}
				break;
			case 2:
				m.insercionDirecta(aux);
				for (int x = 0; x < col.size(); x++) {
					for (int i = 0; i < tamanio; i++) {
						matriz[tamanio-i-1][col.get(x)] = aux[i];
					}
				}
				break;
			default:
				System.out.println("comando invalido");
				failsafe = true;
			}

		} while (failsafe == true);
		
		for (int x = 0; x < tamanio; x++) {
			mostrar += "\n";
			for (int y = 0; y < tamanio; y++) {
				mostrar += matriz[x][y] + " ";
			}
		}

		System.out.println(mostrar);

	}
}
