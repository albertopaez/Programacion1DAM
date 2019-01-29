package ejercicio_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import utilidad.Prueba;

public class Test {
	public static void main(String[] args) throws IOException {
		
		double pago;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Docente d1 = new Docente();
		Estudiante e1= new Estudiante();
		Prueba p = new Prueba();
		
		
		System.out.println(d1.mostrarDatos());
		
		
		System.out.println("Introduzca el nombre del estudiante");
		e1.setNombre(br.readLine());
		System.out.println("Introduzca los apellidos del estudiante");
		e1.setApellidos(br.readLine());
		System.out.println("Introduzca el dni del estudiante");
		e1.setDni(br.readLine());
		System.out.println("Introduzca el sexo del estudiante");
		e1.setSexo(br.readLine());
		System.out.println("Introduzca el código del estudiante");
		e1.setCodigo(p.tryInteger());
		System.out.println("Introduzca la categoria del estudiante");
		e1.setCategoria(br.readLine());
		System.out.println("Introduzca colegio de procedencia del estudiante");
		e1.setColegioProcedencia(br.readLine());
		System.out.println("Introduzca la pensión base del estudiante");
		e1.setPagoPension(p.tryDouble());
		pago=e1.getDescuentoPension();
		
		
		System.out.println("Ficha del alumno\n");
		System.out.println("Nombre: " + e1.getNombre());
		System.out.println("Apellidos: " + e1.getApellidos());
		System.out.println("Sexo: " + e1.sexo);
		System.out.println("DNI: " + e1.getDni());
		System.out.println("Código: " + e1.getCodigo());
		System.out.println("Categoria: " + e1.getCategoria());
		System.out.println("Colegio de procedencia: " + e1.getCategoria());
		System.out.println("Pensión base: " + e1.getPagoPension());
		System.out.println("Pensión final: " + pago);
		
	}
}
