package ejercicio_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainDVDCine {

	public static void main(String[] args) throws IOException {

		boolean failsafe = true;
		int duracion = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		DVDCine c01 = new DVDCine();
		System.out.println("introduzca el nombre de la pelicula");
		c01.setNombre(br.readLine());
		System.out.println("introduzca el nombre del autor de la pelicula");
		c01.setAutor(br.readLine());
		System.out.println("introduzca actores destacados de la pelicula");
		c01.setActores(br.readLine());
		System.out.println("Introduzca el género de la pelicula:");
		c01.setGenero(br.readLine());
		System.out.println("Introduzca resumen de la pelicula (opcional):");
		c01.setResumen(br.readLine());

		do {		//estructura de control
			try {
				System.out.println("Introduzca duración de la pelicula (en minutos):");
				duracion = Integer.parseInt(br.readLine());
				if (duracion <= 0) {
					System.out.println("La duración no puede ser cero o negativa");
					failsafe = true; // variable de control
				} else {
					failsafe = false; // variable de control
				}
			} catch (NumberFormatException ex) {
				System.out.println("Comando invalido");
			}
		} while (failsafe);
		c01.setDuracion(duracion);
		
		System.out.println(c01.muestraDVDCine());

		System.out.println(c01.esThriller());

		System.out.println(c01.tieneResumen());
		
		System.out.println(c01.muestraDuracion());

		

	}

}
