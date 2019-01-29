package ejerciciosExtra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TelaDeArana {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int telarana = 0;
		int peso = 0;// variable para introducir el peso de los elefante en la lista
		boolean failsafe = true;
		ArrayList<Integer> elefante = new ArrayList<Integer>();
		ArrayList<Integer> elefanteFinal = new ArrayList<Integer>();

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

		do { // estructura para asegurarse de que se recibe el tipo de dato correcto por
				// consola
			try {
				System.out.println("Introduzca la resistencia de la telaraña");
				telarana = Integer.parseInt(teclado.readLine());

				System.out.println("Introduzca la os elefantes por su peso."
						+ " Cuando haya introducido todos los elefantes que dese introduzca 0");
				peso = Integer.parseInt(teclado.readLine());
				elefante.add(peso);

				do {
					System.out.println("Peso del siguiente elefante:");
					peso = Integer.parseInt(teclado.readLine());
					elefante.add(peso);
				} while (peso != 0);

				failsafe = false; // variable de control
			} catch (NumberFormatException ex) {
				System.out.println("No ha introducido un comando valido");
			}
		} while (failsafe);

		peso = 0;// iniciañizamos peso a 0 para aprovecharlo como acumulador del peso de los
					// elefantes

		for (int i = 0; i < elefante.size(); i++) {
			peso += elefante.get(i);

			elefanteFinal.add(elefante.get(i));

			if (peso > telarana) {
				break;
			}
		}

		System.out.println(elefanteFinal.size() - 1);

	}

}
