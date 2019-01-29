package ejerciciosProgramacion_1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_1_1_06 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		double nota=0;
		boolean failsafe=true;
		
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		 
		
		do {		//estructura para asegurarse de que se recibe el tipo de dato correcto por consola
			try {
				System.out.println("Introduzca la nota");
			    nota=Double.parseDouble(teclado.readLine());
			    
			    failsafe=false;		//variable de control
			}
			catch(NumberFormatException ex){
				System.out.println("No ha introducido un numero");
			}
		}while(failsafe);
	    
	    
		//Hacemos una serie de ifs anidados para determinar en que rango esta el numero introducido
		
	    if(nota<0) {
	    	System.out.println("La nota no es valida por ser inferior a 0");
	    	
	    }else {
	    	if(nota<5) {
	    		System.out.println("El alumno esta suspenso");
	    		
	    	}else
	    		if(nota<=6) {
	    			System.out.println("El alumno esta aprobado");
	    			
	    		}else {
	    			if(nota<=8) {
	    				System.out.println("El alumno ha obtenido un notable");
	    				
	    			}else
	    				if(nota<=10) {
	    					System.out.println("El alumno ha obtenido un sobresaliente");
	    					
	    				}else {
	    					System.out.println("La nota no es valida por ser superior a 10");
	    					
	    				}
	    					
	    		}
	    	
	    }
	    
	}

}
