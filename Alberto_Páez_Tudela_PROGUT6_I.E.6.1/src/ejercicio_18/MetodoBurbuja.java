package ejercicio_18;

public class MetodoBurbuja {

	public static void burbuja(int[] array) {
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

}
