package ejercicio_07;

import java.util.StringTokenizer;

public class Tokenizer {
	
	
	public String tokenizer(String entrada) {
		String respuesta="";
		StringTokenizer st = new StringTokenizer(entrada, "\n");
	     while (st.hasMoreTokens()) {
	         respuesta +="El alumno "+st.nextToken();
	         respuesta +=" ha sacado la nota "+st.nextToken()+"\n";
	     }
		return respuesta;
	}

}
