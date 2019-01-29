package ejercicio_extra;

import java.util.ArrayList;

public class OrdenarVector {

	public static void ascendenteBurbuja(int[] array) {
		int i, j, aux;
		for (i = 0; i < array.length - 1; i++) {
			for (j = 0; j < array.length - i - 1; j++) {
				if (array[j + 1] < array[j]) {
					aux = array[j + 1];
					array[j + 1] = array[j];
					array[j] = aux;

				}
			}
		}
	}

	public int[] ordenarVector(int[] vector) {

		ArrayList<Integer> pares = new ArrayList<Integer>();
		ArrayList<Integer> impares = new ArrayList<Integer>();

		for (int x = 0; x < vector.length; x++) {
			if (vector[x] % 2 == 0) {
				pares.add(vector[x]);
			} else {
				impares.add(vector[x]);
			}
		}
		int[] par = new int[pares.size()];
		int[] impar = new int[impares.size()];

		for (int x = 0; x < par.length; x++) {
			par[x] = pares.get(x);
		}
		for (int x = 0; x < impar.length; x++) {
			impar[x] = impares.get(x);
		}

		int[] aux = impar;

		ascendenteBurbuja(par);
		ascendenteBurbuja(aux);

		for (int x = 0; x < impar.length; x++) {
			impar[x] = aux[aux.length - x];
		}

		ArrayList<Integer> contenedor = new ArrayList<Integer>();

		for (int x = 0; x < par.length; x++) {
			contenedor.add(par[x]);
		}

		for (int x = 0; x < impar.length; x++) {
			contenedor.add(impar[x]);
		}

		for (int x = 0; x < vector.length; x++) {
			vector[x] = contenedor.get(x);
		}

		return vector;
	}

}
