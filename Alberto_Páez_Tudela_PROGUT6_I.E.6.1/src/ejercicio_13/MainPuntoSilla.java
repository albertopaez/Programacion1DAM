package ejercicio_13;

import java.io.IOException;

import utilidad.Prueba;

public class MainPuntoSilla {
	public static void main(String[] args) throws IOException {

		Prueba p = new Prueba();
		PuntoSilla s = new PuntoSilla();

		System.out.println("Introduzca el tamaño de la matriz");
		int tamanio = p.tryIntegerPositivo();
		int[][] matriz = new int[tamanio][tamanio];
		String mostrar = "";

		for (int x = 0; x < tamanio; x++) {
			for (int y = 0; y < tamanio; y++) {
				matriz[x][y] = (int) (Math.random() * 100);
			}
		}

		for (int x = 0; x < tamanio; x++) {
			mostrar += "\n";
			for (int y = 0; y < tamanio; y++) {
				mostrar += matriz[x][y] + " ";
			}
		}
		System.out.println(mostrar);

		for (int x = 0; x < tamanio; x++) {
			for (int y = 0; y < tamanio; y++) {
				if (s.puntoSilla(matriz, x, y)) {
					System.out.println("El punto " + (x+1) + ", " + (y+1) + " es un punto de silla.");
				}
			}
		}
	}
}
