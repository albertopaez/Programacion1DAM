package ejercicio_03;

import java.io.IOException;

public class MainEliminaEspacios {
	
	public static void main(String[] args) throws IOException {
		
		EliminaEspacios e = new EliminaEspacios();
		
		System.out.println("Introduzca una cadena cuyos espacios quiere que sean eliminados");
		System.out.println(e.eliminaEspacios());
		
	}
}
