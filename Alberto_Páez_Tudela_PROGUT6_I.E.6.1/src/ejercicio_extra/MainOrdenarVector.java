package ejercicio_extra;

import java.io.IOException;

import utilidad.Prueba;

public class MainOrdenarVector {

	public static void main(String[] args) throws IOException {
		
		Prueba p = new Prueba();
		OrdenarVector o = new OrdenarVector();
		
		System.out.println("introduzca el tamaño del vector");
		int tamanio = p.tryIntegerPositivo();
		
		int[] vector = new int[tamanio];
		
		for (int x = 0; x < vector.length; x++) {
			System.out.println("Introduzca el siguiente valor del vector");
			vector[x] = p.tryIntegerPositivo();
		}
		
		System.out.println("El vector actualmente es:\n"+vector.toString());
		
		o.ordenarVector(vector);
		
		System.out.println("El vector despues de ser ordenado es:\n"+vector.toString());
		
		

	}

}
