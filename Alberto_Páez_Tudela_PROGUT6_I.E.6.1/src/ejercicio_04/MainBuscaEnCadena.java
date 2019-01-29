package ejercicio_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainBuscaEnCadena {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("introduca una cadena en al que realizar las operaciones");
		
		BuscaEnCadena b = new BuscaEnCadena(br.readLine());
		
		System.out.println("Ahora invertiremos la cadena");
		System.out.println(b.invertir());
		System.out.println("Ahora contaremos las vocales a, e y o");
		System.out.println(b.vocales());
		System.out.println("Ahora introduzca una palabra a buscar en la cadena");
		System.out.println(b.busca());
	}
}
