package ejercicio_01;

import java.util.StringTokenizer;

public class CuentaPalabras {
	
	public int cuentaPalabras(String entrada) {
		StringTokenizer st = new StringTokenizer(entrada, " ");
		return st.countTokens();
	}

}