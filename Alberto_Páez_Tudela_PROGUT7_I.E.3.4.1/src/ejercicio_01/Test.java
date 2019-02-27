package ejercicio_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import utilidad.Input;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Input i = new Input();
		
		String nif = br.readLine();
		String nombre = br.readLine();
		String apellidos = br.readLine();
		
		Persona p1 = new Persona(nif, nombre, apellidos);
		
		CuentaAhorro ca1 = new CuentaAhorro(111011011, 100, p1, 1);
		
		System.out.println(ca1.toString());
		
		
	}
}
