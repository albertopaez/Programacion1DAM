package ejercicio_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuscaEnCadena {

	private String cadena;

	public BuscaEnCadena(String cadena) {
		this.cadena = cadena;
	}

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public String invertir() throws IOException {
		String nuevaCadena = "";
		for (int x = cadena.length() - 1; x >= 0; x--) {
			nuevaCadena += cadena.charAt(x);
		}
		return nuevaCadena;
	}

	public String vocales() throws IOException {
		int a = 0;
		int e = 0;
		int o = 0;
		String avisoa = "";
		String avisoo = "";
		String avisoe = "";
		for (int x = 0; x < cadena.length(); x++) {
			if ((cadena.charAt(x) == 'a') || (cadena.charAt(x) == 'A')) {
				a++;
			}
			if ((cadena.charAt(x) == 'e') || (cadena.charAt(x) == 'E')) {
				e++;
			}
			if ((cadena.charAt(x) == 'o') || (cadena.charAt(x) == 'O')) {
				o++;
			}
		}

		if (a > 10) {
			avisoa = "Exceso de a";
		}
		if (o > 5) {
			avisoo = "Exceso de o";
		}
		if (e > 3) {
			avisoe = "Exceso de e";
		}

		return "En numero de veces que se repite a es: " + a + " " + avisoa
				+ "\nEn numero de veces que se repite o es: " + o + " " + avisoo
				+ "\nEn numero de veces que se repite e es: " + e + " " + avisoe;
	}

	public String busca() throws IOException {
		String palabra = br.readLine();
		String respuesta;
		if (cadena.contains(palabra)) {
			respuesta = "La palabra está en la cadena";
		} else {
			respuesta = "La palabra no está en la cadena";
		}
		return respuesta;
	}

}
