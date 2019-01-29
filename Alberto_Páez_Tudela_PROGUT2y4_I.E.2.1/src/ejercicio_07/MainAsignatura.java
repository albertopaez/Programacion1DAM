package ejercicio_07;

import java.io.IOException;

import utilidad.Prueba;

public class MainAsignatura {
	
	public static void main(String[] args) throws IOException {
		
		Asignatura a1 = new Asignatura("Biologia", 7.8);
		Prueba p=new Prueba();
		
		System.out.println("En la asignatura " + a1.getMateria() + " ha sacado un " + a1.getNota() +
				"\nConsecuentemente su calificación es " +a1.calificacion());
		
		System.out.println("Introduzca la nueva nota");
		a1.setNota(p.tryDouble());
		System.out.println("Ahora su calificación es "+a1.calificacion());
		
		
	}

}
