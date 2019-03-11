package ejercicio_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import utilidad.Input;

public class Test {

	public static void main(String[] args) throws IOException {
		
		int operacion=0;
		int cuenta=0;
		long numerocuenta=1;
		double saldo=0;
		double interes=0;
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Input i = new Input();
		
		System.out.println("introduzca sus datos personales para poder asociar las cuentas a su perfil");
		System.out.println("introduzca su NIF");
		String nif = br.readLine();
		System.out.println("introduzca su nombre");
		String nombre = br.readLine();
		System.out.println("introduzca sus apellidos");
		String apellidos = br.readLine();
		
		Persona cliente = new Persona(nif, nombre, apellidos);
		
		
		CuentaAhorro cuentaA = new CuentaAhorro(numerocuenta, saldo, cliente, interes);
		
		CuentaCorriente cuentaC = new CuentaCorriente(numerocuenta, saldo, cliente);
		
		List<Cuenta> cuentas = new ArrayList<Cuenta>();
		
		
		do {
			System.out.println("Si desea crear una Cuenta Ahorro introduzca 1"
					+ "\nSi desea crear una Cuenta Corriente introduzca 2"
					+ "\nSi desea añadir saldo a una cuenta introduzca 3"
					+ "\nSi desea retirar saldo a una cuenta introduzca 4"
					+ "\nSi desea actualizar el saldo en base al interes una cuenta introduzca 5"
					+ "\nSi desea actualizar el interes de una cuenta introduzca 6"
					+ "\nSi desea ver los datos de una cuenta introduzca 7"
					+ "\nSi desea crear un nuevo perfil que asociar a las cuentas que creem introduzca 8"
					+ "\nSi desea salir del programa introduzca 0");
			operacion=i.tryIntegerAcotado(0, 8);
			switch(operacion) {
			case 0:
				System.out.println("Gracias por usar nuestro servicio");
				break;
			case 1:
				System.out.println("Introduza saldo inicial (los 20 euros obligatorios ya están registrados)");
				saldo=i.tryDoublePositivo();
				System.out.println("Introduza el interes");
				interes=i.tryDoublePositivo();
				cuentaA = new CuentaAhorro(numerocuenta, saldo, cliente, interes);
				cuentas.add(cuentaA);
				numerocuenta++;
				break;
			case 2:
				System.out.println("Introduza saldo inicial");
				saldo=i.tryDoublePositivo();
				cuentaC = new CuentaCorriente(numerocuenta, saldo, cliente);
				cuentas.add(cuentaC);
				numerocuenta++;
				break;
			case 3:
				System.out.println("Elija en que cuenta desea realizar la operación (1 para la primera cuenta, 2 para la segunda, etc)");
				cuenta=i.tryIntegerPositivo();
				if(cuenta <=cuentas.size()) {
					System.out.println("introduzca el saldo que desea ingresar");
					saldo = i.tryDoublePositivo();
					cuentas.get(cuenta-1).ingresar(saldo);
				}else {
					System.out.println("No existe esa cuenta");
				}
				break;
			case 4:
				System.out.println("Elija en que cuenta desea realizar la operación (1 para la primera cuenta, 2 para la segunda, etc)");
				cuenta=i.tryIntegerPositivo();
				if(cuenta <=cuentas.size()) {
					System.out.println("introduzca el saldo que desea retirar");
					saldo = i.tryDoublePositivo();
					cuentas.get(cuenta-1).retirar(saldo);
				}else {
					System.out.println("No existe esa cuenta");
				}
				break;
			case 5:
				System.out.println("Elija en que cuenta desea realizar la operación (1 para la primera cuenta, 2 para la segunda, etc)");
				cuenta=i.tryIntegerPositivo();
				if(cuenta <=cuentas.size()) {
					cuentas.get(cuenta-1).actualizarSaldo();
				}else {
					System.out.println("No existe esa cuenta");
				}
				break;
			case 6:
				System.out.println("Elija en que cuenta desea realizar la operación (1 para la primera cuenta, 2 para la segunda, etc)");
				cuenta=i.tryIntegerPositivo();
				if(cuenta <=cuentas.size()) {
					if(cuentas.get(cuenta-1) instanceof CuentaAhorro) {
						System.out.println("Introduzca el nuevo interes de la cuenta");
						interes=i.tryDoublePositivo();
						((CuentaAhorro) cuentas.get(cuenta-1)).actualizarInteres(interes);
					}else {
						System.out.println("Las cuentas corrientes tienen un interes fijo del 1'5%");
					}
				}else {
					System.out.println("No existe esa cuenta");
				}
				break;
			case 7:
				System.out.println("Elija en que cuenta desea realizar la operación (1 para la primera cuenta, 2 para la segunda, etc)");
				cuenta=i.tryIntegerPositivo();
				if(cuenta <=cuentas.size()) {
					System.out.println(cuentas.get(cuenta-1).toString());
				}else {
					System.out.println("No existe esa cuenta");
				}
				break;
			case 8:
				System.out.println("introduzca sus datos personales para poder asociar las cuentas a su perfil");
				System.out.println("introduzca su NIF");
				nif = br.readLine();
				System.out.println("introduzca su nombre");
				nombre = br.readLine();
				System.out.println("introduzca sus apellidos");
				apellidos = br.readLine();
				cliente = new Persona(nif, nombre, apellidos);
				break;
			default:
				System.out.println("Comando erroneo");
			}
			
		}while(operacion!=0);
		
	}
	
}
