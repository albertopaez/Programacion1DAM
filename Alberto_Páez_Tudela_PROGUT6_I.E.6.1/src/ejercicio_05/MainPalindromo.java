package ejercicio_05;

import java.io.IOException;

public class MainPalindromo {

	public static void main(String[] args) throws IOException {

		Palindromo p = new Palindromo();
		System.out.println("Introduzca una cadena que quiera saber si es  un palindromo o no");
		System.out.println(p.esPalindromo());

	}
}
