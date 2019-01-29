package ejercicio_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import utilidad.Prueba;

public class MainPersona {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Persona p1 = new Persona();
		Prueba p = new Prueba();
		
		System.out.println("Introduzca su nombre");
		p1.setNombre(br.readLine());
		System.out.println("Introduzca su edad");
		p1.setEdad(p.tryInteger());
		System.out.println("Nombre: " + p1.getNombre() + "\nEdad : " + p1.getEdad());
		
		
		
		
		
		
		
		
		
	}
}
