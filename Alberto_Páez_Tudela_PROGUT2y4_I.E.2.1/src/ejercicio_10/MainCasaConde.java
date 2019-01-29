package ejercicio_10;

import java.io.IOException;

import utilidad.Prueba;

public class MainCasaConde {
	public static void main(String[] args) throws IOException {
		
		CasaConde c1=new CasaConde(10, 19);
		Prueba p=new Prueba();
		
		c1.showChocos();
		c1.showPapas();
		System.out.println("Los comensales a los que puedes servir ahora son " + c1.getComensales());
		System.out.println("Introduzca el numero de kg de chocos que desee añadir");
		c1.addChocos(p.tryInteger());
		c1.showChocos();
		System.out.println("Introduzca el numero de kg de papas que desee añadir");
		c1.addPapas(p.tryInteger());
		c1.showPapas();
		System.out.println("Los comensales a los que puedes servir ahora son " + c1.getComensales());
		

	}
}
