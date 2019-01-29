package ejercicio_14;

import java.io.IOException;

public class Factorial {

	public long factorial(long numero) throws IOException {
		if (numero == 0) {
			return 1;
		} else {
			return numero * factorial(numero - 1);
		}
	}

}
