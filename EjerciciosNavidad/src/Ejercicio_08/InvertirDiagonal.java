package Ejercicio_08;

import java.io.IOException;
import java.util.Arrays;

import utilidad.Prueba;

public class InvertirDiagonal {
	public static void main(String[] args) throws IOException {
		
		int aux1;
		int aux2;
		
		Prueba p = new Prueba();
		
		System.out.println("introduzca las dimensiones de la matriz "
				+ "(es cuadrada,a si que solo debe introducir una longitud): ");
		int longitud = p.tryIntegerPositivo();
		
		int[][] matriz = new int[longitud][longitud];

		for (int i = 0; i < longitud; i++) {
				matriz[i][i] = (int) (Math.random() * 9+1);
		}
		
		System.out.println("Matriz diagonal: "+Arrays.deepToString(matriz));
		
		for (int i = 0; i < longitud/2; i++) {
			aux1=longitud-i-1;
			aux2=matriz[i][i];
			matriz[i][i]=matriz[aux1][aux1];
			matriz[aux1][aux1]=aux2;
	}
		
		System.out.println("Matriz diagonal invertida: "+Arrays.deepToString(matriz));
		
	}

}
