package ejercicio_15;

import java.io.IOException;
import utilidad.Prueba;

public class MainFibonacci {
	public static void main(String[] args) throws IOException {

		Fibonacci f = new Fibonacci();
		Prueba p = new Prueba();

		System.out.println("Introduzca la cantidad de numeros de la secuencia de Fibonacci que desea conocer");
		System.out.println(f.imprimirFibonacci(p.tryIntegerPositivo()));

	}
}
