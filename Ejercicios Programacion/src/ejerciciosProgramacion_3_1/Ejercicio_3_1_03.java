package ejerciciosProgramacion_3_1;

public class Ejercicio_3_1_03 {

	public static void main(String[] args) {

		int[] random = new int[7]; // array de numeros del euromillon
		boolean repetido; // variable de control para ver si se repite el numero
		int numero; // variable para el nuevo random poder comprobar si se repite o no
		int numero2 = 0; // variable de control para la segunda parte del array

		for (int i = 0; i < random.length; i++) {

			// dividimos el for en 2 partes: los 5 primero random de 50 y los 2 ultimos de
			// 11

			if (i <= 4) { // 5 primeros random de 50
				do {
					repetido = false;
					numero = (int) (Math.random() * 50 + 1);

					for (int j = 0; j < random.length; j++) {
						// comprobamos si el numero se encuentra en el array ya o no
						if (numero == random[j]) {
							// si encontramos un numero repetido activamos la variable de control
							// y hacemos un break para terminar el ciclo y comenzar otro
							repetido = true;
							break;
						}
					}
				} while (repetido);

				random[i] = numero;
			} else { // 2 ultimos random de 11
				do {
					repetido = false;
					numero = (int) (Math.random() * 11 + 1);

					if (numero == numero2) { // comprobamos que el primer numero no sea igual al segundo
						repetido = true;
					} 
					numero2 = numero; // registramos el primer numero para poder compararlo con el segundo

				} while (repetido);
				random[i] = numero;
			}
			System.out.println(random[i]);
		}
	}

}