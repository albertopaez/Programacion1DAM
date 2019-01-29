package ejercicio_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EliminaEspacios {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public String eliminaEspacios() throws IOException {
		String cadena = br.readLine();
		String nuevaCadena = "";
		for (int x = 0; x < cadena.length(); x++) {
			if ((cadena.charAt(x) != ' ')) {
				nuevaCadena += cadena.charAt(x);
			}
		}
		return nuevaCadena;
	}

}
