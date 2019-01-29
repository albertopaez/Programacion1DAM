package ejercicio_02;

import java.io.IOException;

public class MainCambioPalabra {

	public static void main(String[] args) throws IOException {

		CambiaPalabra c = new CambiaPalabra();

		System.out.println("Introduzca una palabra seguida de un espacio en blanco y otra palabra");

		System.out.println(c.cambiaPalabra());

	}
}
