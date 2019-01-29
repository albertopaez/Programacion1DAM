package ejercicio_13;

public class PuntoSilla {

	public boolean menorFila(int[] fila, int punto) {
		boolean respuesta = true;
		for (int x = 0; x < fila.length; x++) {
			if (fila[x] < punto) {
				respuesta = false;
			}
		}
		return respuesta;
	}

	public boolean mayorColumna(int[] columna, int punto) {
		boolean respuesta = true;
		for (int x = 0; x < columna.length; x++) {
			if (columna[x] > punto) {
				respuesta = false;
			}
		}
		return respuesta;
	}
	
	public boolean puntoSilla (int[][] matriz, int fila, int columna) {
		boolean respuesta = false;
		int[] col = new int[matriz.length];
		int[] fil = new int[matriz.length];
		for (int i = 0; i < col.length; i++) {
			col[i] = matriz[i][columna];
		}
		for (int i = 0; i < col.length; i++) {
			fil[i] = matriz[fila][i];
		}
		if (menorFila(fil, matriz[fila][columna]) && mayorColumna(col, matriz[fila][columna])) {
			respuesta = true;
		}
		return respuesta;
	}
	

}
