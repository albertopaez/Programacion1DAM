package ejercicio_03;

import java.io.IOException;
import utilidad.Prueba;

public class MainCuenta {
	
	public static void main(String[] args) throws IOException {
		
		Cuenta c01 = new Cuenta();
		Cuenta c02 = new Cuenta(44441333, 105.68, 1.8);
		Prueba p=new Prueba();
		
		System.out.println("Introduzca el dni");
		c01.setDni(p.tryLong());
		System.out.println("introduzca el saldo");
		c01.setSaldo(p.tryDouble());
		System.out.println("introduzca el interes anual");
		c01.setInteres_anual(p.tryDouble());
		
		System.out.println("Estado de nuestra cuenta");
		System.out.println(c01.muestraCuenta());
		System.out.println("Estado de una cuenta de control");
		System.out.println(c02.muestraCuenta());
		
		System.out.println("Aplicamos el interes anual a nuestra cuenta");
		c01.actualizarSaldo();
		System.out.println("Y revisamos el saldo");
		System.out.println(c01.getSaldo());
		System.out.println("Ingresamo dinero al saldo");
		c01.ingresar(p.tryDouble());
		System.out.println("Y revisamos el saldo");
		System.out.println(c01.getSaldo());
		System.out.println("Retiramos dinero al saldo");
		c01.retirar(p.tryDouble());
		System.out.println("Y revisamos el saldo");
		System.out.println(c01.getSaldo());
		
		
	}

}
