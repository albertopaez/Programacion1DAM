package ejerciciosProgramacion_1_1;

public class Ejercicio_1_1_04 {
	
	public static void main(String[] args) {
		
		int a=5;		//numero de iteraciones
		int b=0;		//numero de ciclos del for
		int c;			//ciclos del for
		String asterisco;
		
		while(a>0) {
			
			a--;		//una iteraci�n menos
			b++;		//una ciclo de for mas para a�adir un asterisco
			asterisco = "";
			
			for(c=1; c<=b; c++){
				
				asterisco = asterisco + "*";		//concatenaci�n de asteriscos en el for
			}
			
			System.out.println(asterisco);
		}
		
	}

}
