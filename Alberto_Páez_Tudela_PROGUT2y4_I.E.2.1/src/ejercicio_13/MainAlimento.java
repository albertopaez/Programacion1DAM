package ejercicio_13;

import java.io.IOException;

public class MainAlimento {
	public static void main(String[] args) throws IOException {

		Alimento a1 = new Alimento("Chuletón de ternera de Avila", 13.45, 5.6, 57.82, true, "B", "M");
		Alimento a2 = new Alimento("Manzana");

		System.out.println(a1.muestraAlimento());
		
		System.out.println("Introduzca nombre del alimento");
		a2.setNombre();
		System.out.println("Introduzca porcentaje de lipidos del alimento");
		a2.setLipidos();
		System.out.println("Introduzca porcentaje de hidratos de carbono del alimento");
		a2.setHidratos();
		System.out.println("Introduzca porcentaje de proteinas del alimento");
		a2.setProteinas();
		System.out.println("Introduzca si el origen del alimento es animal (si) o no (no)");
		a2.setOrigen();
		System.out.println("Introduzca contenido de vitaminas en el alimento");
		a2.setVitaminas();
		System.out.println("Introduzca contenido de miinerales en el alimento");
		a2.setMinerales();
		
		System.out.println(a2.muestraAlimento());

	}
}
