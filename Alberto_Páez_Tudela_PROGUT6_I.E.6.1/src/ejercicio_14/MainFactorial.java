package ejercicio_14;

import java.io.IOException;

import utilidad.Prueba;

public class MainFactorial {
	public static void main(String[] args) throws IOException {
		
		Factorial f = new Factorial();
		Prueba p = new Prueba();
		
		System.out.println("Introduzca un numero cuyo factorial quiera conocer");
		System.out.println(f.factorial(p.tryLongPositivo()));
		
	}
}
