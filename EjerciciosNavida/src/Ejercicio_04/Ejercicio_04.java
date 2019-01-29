package Ejercicio_04;

import java.io.IOException;
import java.util.Arrays;

public class Ejercicio_04 {
	public static void main(String[] args) throws IOException {
		
		int[] vector = new int[20];
		int pares=0;
		int imparMayor=0;

		for (int i = 0; i < 20; i++) {
			vector[i] = (int) (Math.random() * 100);
		}
		
		for (int i = 0; i < 20; i++) {
			if(vector[i]%2==0) {
				pares+=vector[i];
			}else {
				if(vector[i]>imparMayor) {
					imparMayor=vector[i];
				}
			}
		}
		
		System.out.println("Vector: "+Arrays.toString(vector)+
				"\nLa suma de los numeros pares es: "+pares+
				"\nEl mayor de los numeros impares es: "+imparMayor);
		
		
	}
}
