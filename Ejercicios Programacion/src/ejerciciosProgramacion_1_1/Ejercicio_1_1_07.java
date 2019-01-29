package ejerciciosProgramacion_1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_1_1_07 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int n=0;
		int cont=0;					//contador de multiplos de 3
		String multiplos;			//string donde acumularemos todos los multiplos de 3 calculados
		boolean failsafe=true;
		
		
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		
		multiplos="";
		
		do {
			do {		//estructura para asegurarse de que se recibe el tipo de dato correcto por consola
				try {
					System.out.println("Introduzca un numero mayor a 0");
				    n=Integer.parseInt(teclado.readLine());
				    
				    failsafe=false;		//variable de control
				}
				catch(NumberFormatException ex){
					System.out.println("No ha introducido un numero");
				}
			}while(failsafe);
		}while(n<0);
		
		while(n>0){
			
			if(n%3==0) {		//comprobamos si el numero es multiplo de 3
				
				multiplos=multiplos+n+" ";		//acumulamos los multiplos de 3 e un string concatenado
				cont++;
			}
			n--;
		}
		
		System.out.println(multiplos);
		System.out.println("El numero de multiplos de 3 es "+cont);
	}

}
