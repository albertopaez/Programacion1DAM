package ejercicio_18;

import java.io.IOException;

import utilidad.Prueba;

public class MainMetodoBurbuja {
	public static void main(String[] args) throws IOException {

		String mostrar="";
		int fila;
		
		MetodoBurbuja m = new MetodoBurbuja();
		Prueba p = new Prueba();

		int[][] matriz = new int[5][5];

		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz.length; y++) {
				matriz[x][y] = (int) (Math.random() * 10);
			}
		}
		
		for(int x=0; x<matriz.length; x++) {
			mostrar+="\n";
			for(int y=0; y<matriz.length; y++) {
				mostrar+= matriz[x][y]+" ";
			}
		}
		
		System.out.println(mostrar);
		
		
		System.out.println("Introduzca la fila que desea organizar (1 para la primera, 2 para la segunda, etc)");
		
		do {
		fila = p.tryIntegerPositivo();
		if(fila == 0 || fila > 5) {
			System.out.println("Comando invalido");
		}
		}while(fila == 0 || fila > 5);
		
		
		m.burbuja(matriz[fila-1]);
		
		mostrar = "";
		
		for(int x=0; x<matriz.length; x++) {
			mostrar+="\n";
			for(int y=0; y<matriz.length; y++) {
				mostrar+= matriz[x][y]+" ";
			}
		}
		
		System.out.println(mostrar);
		

	}
}
