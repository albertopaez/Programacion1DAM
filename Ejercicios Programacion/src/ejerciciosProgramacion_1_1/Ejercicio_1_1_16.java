package ejerciciosProgramacion_1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_1_1_16 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double ca;
		int ce;
		int pa;
		double pr;
		double rep;
		int to;
		int v;
		boolean failsafe;
		do {
			v = 0;// variable para saber sobre que variedad verdura calcular
			ca = 0;// cantidad de semillas sobre las que calcular el precio
			to = 0;// variable para saber sobre que variedad de tomates calcular
			pa = 0;// variable para saber sobre que variedad de patata calcular
			ce = 0;// variable para saber sobre que variedad de cebolla calcular
			pr = 0;// acumulador del precio total
			rep = 1;
			do { // estructura para asegurarse de que se recibe el tipo de dato correcto por
					// consola
				failsafe = true;
				try {
					System.out.println("Introduzca la cantidad de semillas cuyo precio quiere calcular");
					ca = Double.parseDouble(bufEntrada.readLine());
					System.out.println(
							"Si desea calcular el precio de semillas de tomate introduzca 1, si son de repollo introduzca 2, si son de patata introduzca 3 y si son de cebolla introduzca 4");
					v = Integer.parseInt(bufEntrada.readLine());
					failsafe = false; // variable de control
				} catch (NumberFormatException ex) {
					System.out.println("No ha introducido un comando valido");
				}
			} while (failsafe);
			// usamos swtich anidados para calcular en base a la variedad especifica de la
			// verdura que nos han introducido previamente
			switch (v) {
			case 1:
				do { // estructura para asegurarse de que se recibe el tipo de dato correcto por
						// consola
					failsafe = true;
					try {
						System.out.println(
								"Si desea calcular el precio de semillas tipo pera introduzca 1, si es de semillas tipo ensalada introduzca 2");
						to = Integer.parseInt(bufEntrada.readLine());
						failsafe = false; // variable de control
					} catch (NumberFormatException ex) {
						System.out.println("No ha introducido un comando valido");
					}
				} while (failsafe);
				switch (to) {
				case 1:
					pr = ca * 15;
					break;
				case 2:
					pr = ca * 20;
					break;
				default:
					System.out.println("comando invalido");
				}
				break;
			case 2:
				pr = ca * 10;
				break;
			case 3:
				do { // estructura para asegurarse de que se recibe el tipo de dato correcto por
						// consola
					failsafe = true;
					try {
						System.out.println(
								"Si desea calcular el precio de semillas tipo criolla introduzca 1, si es de semillas tipo pastusa introduzca 2, si es de semillas tipo salentuna introduzca 3");
						pa = Integer.parseInt(bufEntrada.readLine());
						failsafe = false; // variable de control
					} catch (NumberFormatException ex) {
						System.out.println("No ha introducido un comando valido");
					}
				} while (failsafe);
				switch (pa) {
				case 1:
					pr = ca * 8;
					break;
				case 2:
					pr = ca * 9;
					break;
				case 3:
					pr = ca * 11;
					break;
				default:
					System.out.println("comando invalido");
				}
				break;
			case 4:
				do { // estructura para asegurarse de que se recibe el tipo de dato correcto por
						// consola
					failsafe = true;
					try {
						System.out.println(
								"Si desea calcular el precio de semillas tipo larga introduzca 1, si es de semillas tipo vieja introduzca 2");
						ce = Integer.parseInt(bufEntrada.readLine());
						failsafe = false; // variable de control
					} catch (NumberFormatException ex) {
						System.out.println("No ha introducido un comando valido");
					}
				} while (failsafe);
				switch (ce) {
				case 1:
					pr = ca * 15;
					break;
				case 2:
					pr = ca * 13;
					break;
				}
				break;
			default:
				System.out.println("Comando invalido");
			}
			System.out.println("El precio de las semillas seleccionadas es " + pr);
			do { // estructura para asegurarse de que se recibe el tipo de dato correcto por
					// consola
				failsafe = true;
				try {
					System.out.println(
							"Si desea repetir la operación introduzque 1. En caso contrario introduzque cualquier otro numero");
					rep = Double.parseDouble(bufEntrada.readLine());
					failsafe = false; // variable de control
				} catch (NumberFormatException ex) {
					System.out.println("No ha introducido un comando valido");
				}
			} while (failsafe);
		} while (rep == 1);
	}

}
