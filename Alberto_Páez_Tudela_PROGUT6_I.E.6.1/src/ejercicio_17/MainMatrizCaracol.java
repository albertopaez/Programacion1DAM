package ejercicio_17;

import java.io.IOException;

import utilidad.Prueba;

public class MainMatrizCaracol {
	public static void main(String[] args) throws IOException {
		
		String mostrar="";
		
		Prueba p = new Prueba();
		MatrizCaracol m = new MatrizCaracol();
		System.out.println("Introduzca el tamaño de la matriz caracol");
		int tamanio=p.tryIntegerPositivo();
		int[][] matriz = m.caracol(tamanio);
		
		
		//tulizo este emtodo en vez de deepToString para que sea más fácil ver el "caracol"
		for(int x=0; x<tamanio; x++) {
			mostrar+="\n";
			for(int y=0; y<tamanio; y++) {
				mostrar+= matriz[x][y]+" ";
			}
		}
		
		System.out.println(mostrar);
		
	}
}