package ejercicio_15;

public class Fibonacci {

	public int CalcularFibonacci(int n)  {
	    if(n == 0)
	        return 0;
	    else if(n == 1)
	      return 1;
	   else
	      return CalcularFibonacci(n - 1) + CalcularFibonacci(n - 2);
	}
	
	public String imprimirFibonacci(int n) {
		String cadena="";
		for (int x=0; x <= n; x++) {
			cadena += CalcularFibonacci(x)+" ";
		}
		return cadena;
	}
	
	
}
