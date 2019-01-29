package ejerciciosProgramacion_1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_1_1_02 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		double numero = 0000;
		double aux;
		double digito;
		double pot;
		int i;
		boolean failsafe=true;
		
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		
		
		do {		//estructura para asegurarse de que se recibe el tipo de dato correcto por consola
			
		try {
			System.out.println("Introduzca un numero de 4 cifras");
			numero=Integer.parseInt(teclado.readLine());
		    
		    failsafe=false;		//variable de control
		}
		
	    catch(NumberFormatException ex){
	    	
	    	System.out.println("No ha introducido un numero de 4 cifras");	
	    	
	    }
		
		}while(failsafe);
	    
	    aux = numero;
	    
	    for(i=1; i<=4; i++) {
	    	
	    	pot = Math.pow(10, 4-i);		//calculamos en que cifra estamos trabajando
	    	
	    	digito = Math.floor(aux/pot);	//calculamos el valor de dicha cifra
	    			
	    	aux = aux - digito*pot;			//le quitamos al numero dicha cifra para la siguiente iteración
	    	
	    	long cifra = (long) digito;
	    	
	    	System.out.println("El digito "+i+" es "+cifra);
	    }
	}
}
