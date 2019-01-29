package ejercicio_01;

import java.io.IOException;

public class MainVocales {
	
	public static void main(String[] args) throws IOException {
		

		Vocales v = new Vocales();
		
		System.out.println("Introduzca cadena de caracteres cuyas vocales desee contar");
		
		System.out.println(v.vocales());
		
	}
}
