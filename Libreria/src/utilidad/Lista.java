package utilidad;

import java.util.ArrayList;

public class Lista {

	// RECIBE UN ARRAY INTEGER Y DEVUELVE UN ARRAYLIST INTEGER
	public ArrayList<Integer> arrayIntToArrayList(int[] array) {
		ArrayList<Integer> contenedor = new ArrayList<Integer>();

		for (int x = 0; x < array.length; x++) {
			contenedor.add(array[x]);
		}
		return contenedor;
	}

	// RECIBE UN ARRAYLIST INTEGER Y DEVUELVE UN ARRAY INTEGER
	public int[] arrayListToArrayInt(ArrayList<Integer> contenedor) {
		int[] array = new int[contenedor.size()];

		for (int x = 0; x < array.length; x++) {
			array[x] = contenedor.get(x);
		}
		return array;
	}

}
