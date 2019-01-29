package ejercicio_08;

import java.util.StringTokenizer;

public class TokenizerDouble {

	public String tokenizer(String entrada) {
		String respuesta = "";
		StringTokenizer st = new StringTokenizer(entrada, "\n");
		while (st.hasMoreTokens()) {
			respuesta += "El alumno " + st.nextToken();
			respuesta += " ha sacado la nota " + st.nextToken() + "\n";
		}
		return respuesta;
	}

	public double[] TokenizerDouble(String entrada) {
		StringTokenizer st = new StringTokenizer(entrada, "\n");
		double[] notas = new double[st.countTokens() / 2];
		for (int x = 0; x < notas.length; x++) {
			st.nextToken();
			notas[x] = Double.parseDouble(st.nextToken());
		}

		return notas;
	}

}
