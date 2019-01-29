package ejercicio_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VerificaNIF {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public String verificaNIF() throws IOException {
		String cadena = br.readLine();
		String respuesta = "";

		if (cadena.length() == 9) {

			if (Character.isDigit(cadena.charAt(0)) && Character.isDigit(cadena.charAt(1))
					&& Character.isDigit(cadena.charAt(2)) && Character.isDigit(cadena.charAt(3))
					&& Character.isDigit(cadena.charAt(4)) && Character.isDigit(cadena.charAt(5))
					&& Character.isDigit(cadena.charAt(6)) && Character.isDigit(cadena.charAt(7))
					&& Character.isLetter(cadena.charAt(8))) {
				respuesta = "Es un NIF";
			} else {
				respuesta = "No es un NIF";
			}

		} else {
			respuesta = "No es un NIF";
		}

		return respuesta;
	}

}
