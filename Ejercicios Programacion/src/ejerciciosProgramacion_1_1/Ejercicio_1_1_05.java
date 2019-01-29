package ejerciciosProgramacion_1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_1_1_05 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int i;						//iteraciones
		double n=0;					//numero introducido por consola
		
		double acneg = 0;			//acumulados de numeros negativos
		
		double acpos = 0;			//acumulados de numeros positivos
		
		double negcont = 0;			//contador de numeros negativos
		
		double poscont = 0;			//contador de numeros positivos
		
		double negmed = 0;			//media de numeros negativos
		
		double posmed = 0;			//contador de numeros negativos
		
		int ceros = 0;				//contador de ceros
		boolean failsafe=true;
		
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		
		for(i=1; i<=10; i++){
			
			do {		//estructura para asegurarse de que se recibe el tipo de dato correcto por consola
				try {
					System.out.println("Ingrese el numero "+i);
					n=Double.parseDouble(teclado.readLine());
					
					failsafe=false;		//variable de control
				}
				catch(NumberFormatException ex){
					
					System.out.println("No ha introducido un numero");
					i--;
				}
			}while(failsafe);
			
			if(n<0) {				//el numero es positivo
				acneg = acneg+n;
				negcont++;
			}else {
				if(n>0) {			//el numero es negativo
					acpos=acpos+n;
					poscont++;
				}else {
					ceros++;		//el numero es un cero
				}
			}
			
			}
			
			if(negcont!=0) {
				negmed = acneg/negcont;		//media de los negativos
			}
			if(poscont!=0) {
				posmed = acpos/poscont;		//media de los positivos
			}
			
			System.out.println("El promedio de los numeros negativos es "+negmed+" el promedio de los numeros positivos es "+posmed+" y hay "+ceros+" ceros");
		
		
	}

}
