package Ejercicio_09;

import java.io.IOException;
import java.util.Arrays;

public class ArrayContenido {
	public static void main(String[] args) throws IOException {

		int[] contenido = { 2, 2};
		int[] contenedor = new int[50];
		boolean esContenido = false;

		for (int i = 0; i < contenedor.length; i++) {
			contenedor[i] = (int) (Math.random() * 10);
		}

		for (int i = 0; i < contenedor.length - 2; i++) {
			if (contenedor[i] == contenido[0] && contenedor[i + 1] == contenido[1]) {
						esContenido = true;
			}

		}

		if (esContenido == false) {
			System.out.println("El array no esta contenido");
		} else {
			System.out.println("El array si esta contenido");
		}

		System.out.println(Arrays.toString(contenedor));

	}
}
