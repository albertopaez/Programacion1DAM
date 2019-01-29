package ejerciciosProgramacion_3_1;

public class Ejercicio_3_1_02 {
	
	public static void main(String[] args) {
		
		int a=4;		//numero de iteraciones
		int b=0;		//numero de ciclos del for de asterisco
		int e=3;		//numero de ciclos del for de espacio
		int c;			//ciclos del for de asterisco
		int d;			//ciclos del for de espacio
		String asterisco;
		String espacio;
		
		
		
		
		while(a>0) {
			
			a--;		//una iteración menos
			b++;		//una ciclo de for mas para añadir 2 asteriscos
			e--;		//un ciclo for contrario al de asterisco para espacio, es decir, vamos restando espacios
			asterisco = "*";
			espacio="";
			
			for(c=2; c<=b; c++){
				
				asterisco = asterisco + "**";		//concatenación de asteriscos en el for
			}
			
			for(d=0; d<=e; d++){
				
				espacio = espacio + " ";		//concatenación de espacios en el for
			}
			
			System.out.println(espacio+asterisco);
		}
		
		
		
		while(a<3) {
			
			
			a++;		//una iteración menos
			b--;		//una ciclo de for menos para eliminar 2 asteriscos
			e++;		//seguimos con un ciclo for contrario al de asterisco para espacio, es decir, ahora sumamos un espacio
			asterisco = "*";
			espacio="";
			
			for(c=2; c<=b; c++){
				
				asterisco = asterisco + "**";		//concatenación de asteriscos en el for
			}
			
			for(d=0; d<=e; d++){
				
				espacio = espacio + " ";		//concatenación de asteriscos en el for
			}
			
			System.out.println(espacio+asterisco);
			
		}
		
		
	}

}
