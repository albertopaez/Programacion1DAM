package ejercicio_09;

import java.io.IOException;

public class MainCapicua {
	public static void main(String[] args) throws IOException {
		
		Capicua c = new Capicua();
		
		System.out.println("Introduzca un numero para averiguar si es capicua");
		if(c.esCapicua()) {
			System.out.println("Es capicua");
		}else {
			System.out.println("No es capicua");
		}
		
	}
}
