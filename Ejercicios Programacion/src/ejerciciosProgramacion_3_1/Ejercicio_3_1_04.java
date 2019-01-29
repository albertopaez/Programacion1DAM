package ejerciciosProgramacion_3_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_3_1_04 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int pasajero=0;
		int km=0;
		double precio=20;			//el precio base de los billetes es de 20 euros
		boolean failsafe=true;
		
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		
		
		do {			//estructura para asegurarse de que se recibe el tipo de dato correcto por consola
			try {
				System.out.println("Introduzca el numero de pasajeros");
				pasajero=Integer.parseInt(teclado.readLine());
				
				System.out.println("Introduzca la distancia del viaje en kilometros");
				km=Integer.parseInt(teclado.readLine());
				
				
				failsafe=false;		//variable de control
			}
			catch(NumberFormatException ex){
				
				System.out.println("No ha introducido un numero");	
			}
			if(pasajero<1 | km<0) {
				System.out.println("Debe haber al menos un pasajero y un Kilometro recorrido de distancia");	
				failsafe=true;		//usamos la variable de control para forzar la entrada de nuevos valores
									//si se introducen valores ilogicos
			}
			
		}while(failsafe);
		
		
		if(km>200) {			//calculamos la posibilidad de que el viaje sea mayor a 200 km
			precio=precio+(km-200)*0.03;
		}else {
			if(km>400) {		//calculamos la posibilidad de que el viaje sea mayor a 400 km
				precio=(precio+(km-200)*0.03)/15;
			}
		}
		if(pasajero>=3) {		//calculamos la posibilidad de que haya 3 o mas pasajeros
			precio=precio/15;	
		}
		
		System.out.println("El precio del billete individual es "+Math.floor(precio*100)/100
				+" y el precio total del viaje es "+Math.floor(precio*pasajero*100)/100);
		//usamos math.floor(x*100)/100 para dejar solo los 2 primeros decimales, que representan los centimos
		
	}

}
