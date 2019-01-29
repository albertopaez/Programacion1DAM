package ejercicio_08;

import java.io.IOException;

public class MainTokenizerDouble {
	public static void main(String[] args) throws IOException {

		TokenizerDouble t = new TokenizerDouble();

		System.out.println(t.tokenizer("Juan Carlos \n 8.5 \n Andrés \n 4.9 \n Pedro \n 3.8 \n Juan \n 6.3"));

		double[] notas = t.TokenizerDouble("Juan Carlos \n 8.5 \n Andrés \n 4.9 \n Pedro \n 3.8 \n Juan \n 6.3");

		for (int x = 0; x < notas.length; x++) {
			System.out.println(notas[x]);
		}

	}

}
