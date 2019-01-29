package ejercicio_06;

import java.io.IOException;

public class MainVerificaNIF {
	public static void main(String[] args) throws IOException {

		VerificaNIF v = new VerificaNIF();
		
		System.out.println("Introduzca una cadena para verificar si es un NIF o no");
		System.out.println(v.verificaNIF());

	}
}
