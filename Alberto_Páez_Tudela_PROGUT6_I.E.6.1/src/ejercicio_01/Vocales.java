package ejercicio_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vocales {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public int vocales() throws IOException {
		int vocales = 0;
		String cadena = br.readLine();
		for (int x = 0; x < cadena.length(); x++) {
			if ((cadena.charAt(x) == 'a') || (cadena.charAt(x) == 'e') || (cadena.charAt(x) == 'i')
					|| (cadena.charAt(x) == 'o') || (cadena.charAt(x) == 'u') || (cadena.charAt(x) == 'A')
					|| (cadena.charAt(x) == 'E') || (cadena.charAt(x) == 'I') || (cadena.charAt(x) == 'O')
					|| (cadena.charAt(x) == 'U')) {
				vocales++;
			}
		}
		return vocales;
	}

}
