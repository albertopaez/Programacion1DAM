package ejercicio_16;

public class TrianguloTartaglia {

	public int calcularTartaglia(int altura, int posicion) {
		if (posicion == 1 || posicion == altura) {
			return 1;
		} else {
			return calcularTartaglia(altura - 1, posicion - 1) + calcularTartaglia(altura - 1, posicion);
		}
	}

	public String imprimirTartaglia(int altura) {
		String triangulo = "";

		for (int x = 1; x <= altura; x++) {
			for (int j = 0; j < altura - x; j++) {
				triangulo += " ";
			}
			
			for (int i = 1; i <= x; i++) {
				triangulo += calcularTartaglia(x, i);
				if(i==x) {
					triangulo += "\n";
				}else {
					triangulo += " ";
				}
				
			}
		}
		return triangulo;
	}

}
