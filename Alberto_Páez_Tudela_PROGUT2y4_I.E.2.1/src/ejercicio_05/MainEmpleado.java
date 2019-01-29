package ejercicio_05;

import java.io.IOException;

import utilidad.Prueba;

public class MainEmpleado {
	public static void main(String[] args) throws IOException, CloneNotSupportedException {
		
		Empleado e1=new Empleado();
		final Empleado eClon = (Empleado) e1.clone();
		Prueba p=new Prueba();
		
		
		System.out.println("Empleado 1");
		System.out.println(e1.printAll());
		System.out.println("Copia de 1");
		System.out.println(eClon.printAll());
		System.out.println("modificamos la copia del empleado uno asigandole otro NIF");
		eClon.setNif(p.tryLong());
		System.out.println("Comprobamos los datos básicos para comprobar que son diferentes tras la modificación");
		System.out.println("Empleado 1");
		System.out.println(e1.println());
		System.out.println("Copia de 1");
		System.out.println(eClon.println());
		System.out.println("Calculamos el bono por horas extras");
		System.out.println(eClon.getPagoHorasExtras());
		
	}
}
