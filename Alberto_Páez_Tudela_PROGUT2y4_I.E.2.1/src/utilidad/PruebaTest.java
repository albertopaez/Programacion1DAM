package utilidad;

import java.io.IOException;

public class PruebaTest {
	
	public static void main(String[] args) throws IOException {
		
		double numero;
		
		Prueba p=new Prueba();
		
		System.out.println("Introduzca un numero double");
		numero = p.tryDouble();
		System.out.println(numero);
		
		
	}

}
