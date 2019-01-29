package ejercicio_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindromo {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public String esPalindromo() throws IOException {
		String cadena = br.readLine();
		String nuevaCadena = "";
		for (int x = cadena.length() - 1; x >= 0; x--) {
			nuevaCadena += cadena.charAt(x);
		}
		String respuesta;
		if (cadena.equalsIgnoreCase(nuevaCadena)) {
			respuesta = "Si es un palíndromo";
		} else {
			respuesta = "No es un palíndromo";
		}
		return respuesta;
	}
}
