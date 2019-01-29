package ejercicio_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CambiaPalabra {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public String cambiaPalabra() throws IOException {
		String cadena = br.readLine();
		String palabra1 = "";
		String palabra2 = "";
		boolean aux = false;

		for (int x = 0; x < cadena.length(); x++) {
			if (aux == false) {
				palabra1 = palabra1 + cadena.charAt(x);
			} else {
				palabra2 = palabra2 + cadena.charAt(x);
			}

			if ((cadena.charAt(x) == ' ')) {
				aux = true;
			}
		}

		return palabra2 + " " + palabra1.substring(0, palabra1.length() - 1);
	}

}
