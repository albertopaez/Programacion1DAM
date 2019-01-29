package ejercicio_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import utilidad.Prueba;

public class MainCafetera {
	public static void main(String[] args) throws IOException {
		
		String respuesta = "No";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Cafetera c01=new Cafetera();
		Cafetera c02=new Cafetera(500);
		Cafetera c03=new Cafetera(1100, 1200);
		Prueba p=new Prueba();
		
		System.out.println("Cafetera 1:");
		System.out.println(c01.muestraCafetera());
		System.out.println("Cafetera 2:");
		System.out.println(c02.muestraCafetera());
		System.out.println("Cafetera 3:");
		System.out.println(c03.muestraCafetera());
		
		System.out.println("¿Desea llenar la cafetera 1?");
		respuesta = br.readLine();
		if (respuesta.equalsIgnoreCase("Si") || respuesta.equalsIgnoreCase("Yes")) {
			c01.llenarCafetera();
		}
		System.out.println("A la cafetera 3 le queda " + c03.getCantidad_actual() + " café");
		System.out.println("¿Desea vaciar la cafetera 2?");
		respuesta = br.readLine();
		if (respuesta.equalsIgnoreCase("Si") || respuesta.equalsIgnoreCase("Yes")) {
			c02.vaciarCafetera();
		}
		System.out.println("A la cafetera 3 le queda " + c03.getCantidad_actual() + " café");
		System.out.println("Introduzca cuanto café desea servirse de la cafetera 3");
		c03.servirTaza(p.tryInteger());
		System.out.println("A la cafetera 3 le queda " + c03.getCantidad_actual() + " café");
		System.out.println("Introduzca cuanto café desea añadir de la cafetera 3");
		c03.agregarCafe(p.tryInteger());
		System.out.println("A la cafetera 3 le queda " + c03.getCantidad_actual() + " café");
	}
}
