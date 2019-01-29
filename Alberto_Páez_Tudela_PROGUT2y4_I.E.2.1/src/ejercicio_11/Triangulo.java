package ejercicio_11;

import java.util.Arrays;

/**
 * <h2>Clase CasaConde, se usa para almacenar triangulos en una BD</h2>
 * @author Alberto Páez Tudela
 * @since 03-12-2018
*/
public class Triangulo {
	//Atributo longitud del primer lado
	private double long_lado1;
	//Atributo longitud del segundo lado
	private double long_lado2;
	//Atributo longitud del tercer lado
	private double long_lado3;

	public Triangulo() {
	}

	/**
	 * Constructor con 3 parametros
	 * @param longitud del primer lado
	 * @param longitud del segundo lado
	 * @param longitud del tercer lado
	 */
	public Triangulo(double long_lado1, double long_lado2, double long_lado3) {
		this.long_lado1 = long_lado1;
		this.long_lado2 = long_lado2;
		this.long_lado3 = long_lado3;
	}

	/**
	 * Compara dos triangulos y devuelve true si son iguales aunque distintas longitudes esten guardadas en
	 * cariables distintas y false en caso cotnrario
	 */
	public boolean compareTo_Triangulos(Triangulo a, Triangulo b) {
		double[] a1 = { a.long_lado1, a.long_lado2, a.long_lado3 };
		double[] b1 = { b.long_lado1, b.long_lado2, b.long_lado3 };

		Arrays.sort(a1);
		Arrays.sort(b1);

		return (Arrays.equals(a1, b1));
	}

	/**
	 * Devuelve 1 si el triangulo es equilátero, 2 si es isósceles y 3 si es escaleno
	 */
	public int tipo_Triangulo() {
		if (long_lado1 == long_lado2 && long_lado1 == long_lado3) {
			return 1;
		} else {
			if (long_lado1 == long_lado2 || long_lado1 == long_lado3 || long_lado2 == long_lado3) {
				return 2;
			} else {
				return 3;
			}
		}
	}

	/**
	 * Compara varios triangulos usando el metodo compareTo_Triangulo en todos ellos
	 * @see compareTo_Triangulo
	 */
	public boolean compareTo_VTriangulos(Triangulo v[]) {
		boolean comparador = true;
		for (int i = 0; i < v.length; i++) {
			if (compareTo_Triangulos(v[0], v[i]) == false) {
				comparador = false;
				break;
			}
		}
		return comparador;
	}
	
	/**
	 * Devuelve los datos del triangulo con strings para facilitar la legibilidad
	 */
	public String showTriangulo() {
		return long_lado1 + ", " + long_lado2 + ", " + long_lado3;
	}

}
