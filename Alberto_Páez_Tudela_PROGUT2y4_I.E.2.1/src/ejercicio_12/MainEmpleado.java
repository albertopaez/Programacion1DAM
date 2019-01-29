package ejercicio_12;

import java.io.IOException;

import utilidad.Prueba;

public class MainEmpleado {
	public static void main(String[] args) throws IOException {
		
		Empleado e1=new Empleado();
		Empleado e2=new Empleado();
		Empleado e3=new Empleado();
		Prueba p=new Prueba();
		
		
		System.out.println("Introduzca las horas y la tarifa de Pepe (en ese orden)");
		e1.setHoras(p.tryIntegerPositivo());
		e1.setTarifa(p.tryDoublePositivo());
		System.out.println("Introduzca las horas y la tarifa de Pedro (en ese orden)");
		e2.setHoras(p.tryIntegerPositivo());
		e2.setTarifa(p.tryDoublePositivo());
		System.out.println("Introduzca las horas y la tarifa de Antonio segundo (en ese orden)");
		e3.setHoras(p.tryIntegerPositivo());
		e3.setTarifa(p.tryDoublePositivo());
		
		System.out.println("Pepe "+e1.mostrarSueldo());
		System.out.println("Pedro "+e2.mostrarSueldo());
		System.out.println("Antonio "+e3.mostrarSueldo());
		
	}
}
