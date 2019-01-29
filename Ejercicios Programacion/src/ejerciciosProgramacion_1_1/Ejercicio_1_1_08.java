package ejerciciosProgramacion_1_1;

import java.io.IOException;

public class Ejercicio_1_1_08 {
	
	public static void main(String[] args) throws IOException {
		
		int n=100, spar=0, simpar=0;
		
		while(n>0) {				//bucle para recorrer todos los numeros de 100 a 0
			
			if(n%2==0) {			//comprobamos si es par
				spar = spar+n;		//si es par lo añadimos al sumatorio de numeros pares
			}else {					//si no es par es impar 
				simpar= simpar+n;	//y lo añadimos al sumatorio de numeros impares 
			}
			n--;
		}
		
		System.out.println("La suma de todos los numeros pares de 0 a 100 es "+spar+" y la suma de todos los numeros impares de 0 a 100 es "+simpar);

	}

}
