package ejercicio_19;

public class MenuOrdenacion {

	public static void insercionDirecta(int[] array) {
		int p, j;
		int aux;
		for (p = 1; p < array.length; p++) { // desde el segundo elemento hasta
			aux = array[p]; // el final, guardamos el elemento y
			j = p - 1; // empezamos a comprobar con el anterior
			while ((j >= 0) && (aux < array[j])) { // mientras queden posiciones y el
													// valor de aux sea menor que los
				array[j + 1] = array[j]; // de la izquierda, se desplaza a
				j--; // la derecha
			}
			array[j + 1] = aux; // colocamos aux en su sitio
		}
	}
	
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
	
	public String esIgual(int[] array1, int[] array2) {
		String respuesta = "";
		boolean igual = true;
		
		if(array1.length != array2.length){
			return "el tamaño de los arrays son distintos";
		}
		
		for (int i = 0; i < array1.length - 1; i++) {
			if(array1[i] != array2[i]) {
				igual=false;
			}
		}
		
		if(igual == true) {
			respuesta = "el vector es igual a la columna";
		}else {
			respuesta = "el vector es distinto a la columna";
		}
		
		return respuesta;
	}

	
	
}
