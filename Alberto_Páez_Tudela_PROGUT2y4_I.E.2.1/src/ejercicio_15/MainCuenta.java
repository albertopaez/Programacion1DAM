package ejercicio_15;

import java.io.IOException;
import java.util.ArrayList;

import utilidad.Prueba;

public class MainCuenta {
	public static void main(String[] args) throws IOException {

		ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
		int operacion;
		int cuenta;
		float aux;
		

		Prueba p = new Prueba();

		do {
			System.out.println("Si desea crear una cuenta vacia introduzca 1"
					+ "\nSi desea crear una cuenta con saldo introduzca 2" + "\nSi desea ingresar dinero introduzca 3"
					+ "\nSi desea sacar dinero introduzca 4" + "\nSi desea ver el saldo de la cuenta introduzca 5"
					+ "\nSi desea salir del programa introduzca 6");
			operacion = p.tryInteger();

			switch (operacion) {

			case 1:
				cuentas.add(new Cuenta());
				System.out.println("Cuenta creada");
				break;
			case 2:
				System.out.println("Introduzca saldo inicial");
				cuentas.add(new Cuenta(p.tryFloatPositivo()));
				System.out.println("Cuenta creada");
				break;
			case 3:
				System.out.println("Elija en que cuenta desea realizar la operación (1 para la primera cuenta, 2 para la segunda, etc)");
				cuenta=p.tryIntegerPositivo();
				if(cuenta <=cuentas.size()) {
					System.out.println("Introduzca la cantidad de dinero que desee ingresar");
					aux=p.tryFloatPositivo();
					cuentas.get(cuenta-1).ingresar(aux);
					
				}else {
					System.out.println("No existe esa cuenta");
				}
				break;
			case 4:
				System.out.println("Elija en que cuenta desea realizar la operación (1 para la primera cuenta, 2 para la segunda, etc)");
				cuenta=p.tryIntegerPositivo();
				if(cuenta <=cuentas.size()) {
					System.out.println("Introduzca la cantidad de dinero que desee retirar");
					aux=p.tryFloatPositivo();
					cuentas.get(cuenta-1).extraer(aux);
				}else {
					System.out.println("No existe esa cuenta");
				}
				break;
			case 5:
				System.out.println("Elija en que cuenta desea realizar la operación (1 para la primera cuenta, 2 para la segunda, etc)");
				cuenta=p.tryIntegerPositivo();
				if(cuenta <=cuentas.size()) {
					System.out.println("Su saldo es de "+(cuentas.get(cuenta-1).getSaldo()));
				}else {
					System.out.println("No existe esa cuenta");
				}
				break;
			case 6:
				System.out.println("Gracias por tulizar nuestros serivicio. Buenos dias");
				break;
			default:
				System.out.println("Comando erroneo");
			}
		} while (operacion != 6);

	}
}
