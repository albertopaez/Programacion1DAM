package ejercicio_09;

import java.io.IOException;

import utilidad.Prueba;

public class Capicua {

	Prueba p = new Prueba();

	public Boolean esCapicua() throws IOException {
		int numero = p.tryIntegerPositivo();
		String cadena = String.valueOf(numero);
		String nuevaCadena = "";
		boolean respuesta;
		for (int x = cadena.length() - 1; x >= 0; x--) {
			nuevaCadena += cadena.charAt(x);
		}
		if (cadena.equalsIgnoreCase(nuevaCadena)) {
			respuesta = true;
		} else {
			respuesta = false;
		}

		return respuesta;
	}
}
