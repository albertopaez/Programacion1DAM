package ejerciciosProgramacion_3_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_3_1_05 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int codigo=1;
		int categoria=0;
		double terror=0;		//acumulador peliculas de terror. Es del tipo double para poder calcular el porcentaje
		int infantil=0;			//acumulador de peliculas infantiles
		int iteracion=0;		//acumulador de peliculas pedidas
		double precio=0;
		boolean failsafe=true;
		
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		
		do {
			
			do {			//estructura para asegurarse de que se recibe el tipo de dato correcto por consola
				try {
					System.out.println("Introduzca el codigo de la pelicula");
					codigo=Integer.parseInt(teclado.readLine());
					if(codigo==0) { //si se introduce el codigo 0 nos saltamos la selección de categoria para salir del
						break;		//programa automaticamente
					}
					
					System.out.println("Elija una categoria: 1.Suspense, 2.Acción, 3.Romántica, 4.Ciencia Ficción,"
							+ " 5.Terror o 6.Infantil");
					categoria=Integer.parseInt(teclado.readLine());
					
					
					failsafe=false;		//variable de control
				}
				catch(NumberFormatException ex){
					
					System.out.println("No ha introducido un numero");	
				}
				
				if(categoria<1||categoria>6){	//comprobamos que la categoria es valida
					System.out.println("Categoria no valida");	
					failsafe=true;				//y usamos la variable de control para redirigirlo si no es asi
				}
				
			}while(failsafe);
			if(codigo==0) {
				break;
			}
			switch(categoria) {
			
			
			case 1: precio=precio+2;
			break;
			
			case 2: precio=precio+2;
			break;
			
			case 3: precio=precio+1.8;
			break;

			case 4: precio=precio+1.8;
			break;

			case 5: precio=precio+2;
			terror++;
			
			break;
			
			case 6: precio=precio+1.5;
			infantil++;
			break;
			}
			iteracion++;
			
		}while(codigo!=0);		//el programa termina cuandos e introduce el codigo 0
	
		terror = (terror/iteracion)*100;
		
		System.out.println("El precio total es "+precio+" euros, el porcentaje de peliculas de terror compradas es "
		+Math.floor(terror*10)/10+"% y la cantidad de peliculas infantiles compradas es "+infantil);
		
		
		
		
		
		
	}

}
