package ejercicio_17;

public class MatrizCaracol {

	public int[][] caracol(int tamanio) {
		int[][] matriz = new int[tamanio][tamanio];
		int contador = 0;
		int aux = tamanio;

		// Utilizamos aux-tamanio para que el tamaño se vaya ajustando conforme vamos
		// haciendo ciclos y evitar pisar numeros
		do {
			for (int x = aux - tamanio; x < tamanio; x++) {
				contador++;
				matriz[aux - tamanio][x] = contador;
			}

			for (int x = aux - tamanio + 1; x < tamanio; x++) {
				contador++;
				matriz[x][tamanio - 1] = contador;
			}

			for (int x = tamanio - 2; x >= aux - tamanio; x--) {
				contador++;
				matriz[tamanio - 1][x] = contador;
			}

			for (int x = tamanio - 2; x > aux - tamanio; x--) {
				contador++;
				matriz[x][aux - tamanio] = contador;
			}

			tamanio--;

		} while (tamanio > 1);

		return matriz;
	}

}
