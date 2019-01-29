package ejercicio_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainVehiculo {
	
	public static void main(String[] args) throws IOException {
		
		boolean failsafe = true;
		String traccion;
		boolean cRuedas = false;
		double potencia = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Vehiculo v01 = new Vehiculo("Fiat");
		Vehiculo v02 = new Vehiculo("Mercedes");
		
		
		do {
			try {
				System.out.println("Introduzca la potencia del coche");
				potencia = Double.parseDouble(br.readLine());

				if (potencia <= 0) { // PREGUNTA SOBRE ESTO
					System.out.println("La potencia no puede ser cero o negativa");
					failsafe = true; // variable de control
				} else {
					failsafe = false; // variable de control
				}
			} catch (NumberFormatException ex) {
				System.out.println("Comando invalido");
			}
		} while (failsafe);
		v01.setPotencia(potencia);
		System.out.println("Escriba 'Si' si el coche :");
		traccion=(br.readLine());
		if (traccion.equalsIgnoreCase("Si")) {
			cRuedas = true;
		} else {
			cRuedas = false;
		}
		v01.setCRuedas(cRuedas);
		
		System.out.println(v01.imprimir());
		System.out.println(v02.imprimir());
		
	}	
}
