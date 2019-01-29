package ejercicio_16;

import java.io.IOException;

import utilidad.Prueba;

public class Test {
	public static void main(String[] args) throws IOException {

		int personaje;
		int accion;

		Prueba p = new Prueba();

		Mago m1 = new Mago("Paracelsus", "Transmutar");
		Guerrero g1 = new Guerrero("Guts", 1000, "Matadragones");

		System.out.println("Hola, mi nombre es "+ m1.getNombre()+" y soy un mago");
		System.out.println("Hola, mi nombre es "+ g1.getNombre()+" y soy un guerrero y mi energia es "+
		g1.getEnergiaActual());
		
		do {
			System.out.println("Si desea realizar una acción con el mago introduca 1"
					+ "\nSi desea usar al guerrero introduzca 2\nSi desea salir del programa introduca 3");
			personaje = p.tryIntegerPositivo();

			switch (personaje) {

			case 1:
				System.out.println("Si desea encantar introduzca 1" + "\nSi desea comer introduzca 2");
				accion = p.tryIntegerPositivo();
				switch (accion) {
				case 1:
					System.out.println(m1.encantar());
					break;
				case 2:
					m1.comer();
					break;
				default:
					System.out.println("Comando invalido");
				}
				break;
			case 2:
				System.out.println("Si desea atacar 1" + "\nSi desea comer introduzca 2");
				accion = p.tryIntegerPositivo();
				switch (accion) {
				case 1:
					System.out.println("Introduzca la cantidad de energia que sea gastar en el combate");
					System.out.println(g1.combatir(p.tryIntegerPositivo()));
					break;
				case 2:
					g1.comer();
					break;
				default:
					System.out.println("Comando invalido");
				}
				break;
			default:
				System.out.println("Comando invalido");
			}
		} while (personaje != 3);

	}
}
