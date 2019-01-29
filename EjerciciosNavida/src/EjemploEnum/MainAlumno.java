package EjemploEnum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import utilidad.Prueba;

public class MainAlumno {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Materia m = null;
		
		Alumno a1 = new Alumno("Juan", 17, m, 7.8);
		Alumno a2 = new Alumno("Antonio", 18, m, 2.7);
		Alumno a3 = new Alumno("Marta", 16, m, 6.7);
		Prueba p=new Prueba();
		
		System.out.println("Introduzca el nombre del alumno 1");
		a1.setNombre(br.readLine());
		System.out.println("Introduzca la edad del alumno 1");
		a1.setEdad(p.tryInteger());
		System.out.println("Introduzca la nota del alumno 1");
		a1.setNota(p.tryDouble());
		System.out.println("Nombre del alumno 1: " + a1.getNombre());
		System.out.println("Materia del alumno 1: " + a1.getMateria());
		System.out.println("Edad del alumno 1: " + a1.getEdad());
		System.out.println("Nota del alumno 1: " + a1.getNota());
		System.out.println("Calificación del alumno 1: " + a1.calificacion());
		System.out.println("Datos del alumno 2\n" +a2.mostrarDatos());
		System.out.println("Datos del alumno 3\n" +a3.mostrarDatos());
		
		
	}

}
