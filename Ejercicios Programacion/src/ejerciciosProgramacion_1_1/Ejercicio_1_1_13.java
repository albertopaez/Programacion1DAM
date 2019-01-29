package ejerciciosProgramacion_1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_1_1_13 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double df;
		int dh;
		double dl = 0;// dia de llegada
		double dm;
		double ds = 0;// dia de salida
		double hl = 0;// hora de llegada
		double hs = 0;// hora de salida
		double mdl;
		double mds;
		double mhl;
		double mhs;
		double ml = 0;// minuto de llegada
		double mlf;
		double ms = 0;// minuto de salida
		double msf;
		boolean failsafe = true;
		do { // estructura para asegurarse de que se recibe el tipo de dato correcto por
				// consola
			try {
				System.out.println("Introduzca el dia de salida del tren");
				ds = Double.parseDouble(bufEntrada.readLine());
				System.out.println("Introduzca la hora de salida del tren");
				hs = Double.parseDouble(bufEntrada.readLine());
				System.out.println("Introduzca el minuto de salida del tren");
				ms = Double.parseDouble(bufEntrada.readLine());
				System.out.println("Introduzca el dia de llegada del tren");
				dl = Double.parseDouble(bufEntrada.readLine());
				System.out.println("Introduzca la hora de llegada del tren");
				hl = Double.parseDouble(bufEntrada.readLine());
				System.out.println("Introduzca el minuto de llegada del tren");
				ml = Double.parseDouble(bufEntrada.readLine());
				failsafe = false; // variable de control
			} catch (NumberFormatException ex) {
				System.out.println("No ha introducido un comando valido");
			}
		} while (failsafe);

		mds = ds * 24 * 60;// pasamos los dias de salida a muntos
		mhs = hs * 60;// pasamos las horas de salida a minutos
		msf = mds + mhs + ms;// calculamos los minutos de salida finales
		// repetimos la misma operacion para el tiempo de llegada
		mdl = dl * 24 * 60;
		mhl = hl * 60;
		mlf = mdl + mhl + ml;
		df = mlf - msf;// calculamos el tiempo duración
		dh = (int) Math.floor(df / 60);// calculamos las horas de duración
		dm = df % 60;
		if (msf > mlf) {// comprobamos que la salida no es anterior a la llegada
			System.out.println("Error, el tren no ppuede llegar antes de que salga");
		} else {
			System.out.println("El tren llegara en " + dh + " horas y " + dm + " minutos");
		}
	}

}