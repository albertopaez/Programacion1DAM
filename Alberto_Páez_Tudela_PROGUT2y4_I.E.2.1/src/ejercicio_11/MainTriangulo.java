package ejercicio_11;

import java.io.IOException;

public class MainTriangulo {
	public static void main(String[] args) throws IOException {
		
		int tipo;
		
		Triangulo t1=new Triangulo(1, 2, 3);
		Triangulo t2=new Triangulo(2, 3, 1);
		Triangulo t3=new Triangulo(3, 2, 1);
		Triangulo t4=new Triangulo(3, 1, 2);
		Triangulo t5=new Triangulo(2, 2, 2);
		Triangulo[] at1= { t1, t2, t3, t4 };
		Triangulo[] at2= { t1, t2, t3, t4, t5 };
		
		System.out.println("Las medidas de los lados del triangulo 1 son: "+t1.showTriangulo());
		
		System.out.println("Las medidas de los lados del triangulo 2 son: "+t2.showTriangulo());
		
		System.out.println(t1.compareTo_Triangulos(t1, t2));
		
		System.out.println("Ahora que hemos corroborado que son iguales, comprobamos que tipo de triangulo son");
		
		tipo=t1.tipo_Triangulo();
		
		switch (tipo) {
		
		case 1:System.out.println("El triangulo es equilátero");
			
		case 2:System.out.println("El triangulo es isóscele");	
		
		case 3:System.out.println("El triangulo es escaleno");
		}
		
		System.out.println("Las medidas de los lados del triangulo 1 son: "+t1.showTriangulo());
		System.out.println("Las medidas de los lados del triangulo 2 son: "+t2.showTriangulo());
		System.out.println("Las medidas de los lados del triangulo 3 son: "+t3.showTriangulo());
		System.out.println("Las medidas de los lados del triangulo 4 son: "+t4.showTriangulo());
		System.out.println("Comparamos los 4 triangulos para ver si son iguales");
		if(t1.compareTo_VTriangulos(at1)) {
			System.out.println("Todos los triangulos son iguales");
		}else {
			System.out.println("No todos los triangulos son iguales");
		}
		System.out.println("Ahora añadimos el triangulo 5 cuyos lados son"+t5.showTriangulo());
		if(t1.compareTo_VTriangulos(at2)) {
			System.out.println("Todos los triangulos son iguales");
		}else {
			System.out.println("No todos los triangulos son iguales");
		}
	}
}
