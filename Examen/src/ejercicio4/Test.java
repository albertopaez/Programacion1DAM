package ejercicio4;

public class Test {
	public static void main(String[] args) {
		
		Direccion d1=new Direccion("Araba", 1, 1, "Sevilla");
		Direccion d2=new Direccion("Berebe", 2, 2, "Cadiz");
		Direccion d3=new Direccion("Curucu", 3, 3, "Madrid");
		
		Empleado e1=new Empleado("Antonio", 1000, d1);
		Empleado e2=new Empleado("Alicia", 1001, d2);
		Empleado e3=new Empleado("Marcos", 1002, d3);
		
		e1.mostrar();
		e2.mostrar();
		e3.mostrar();
		
		
		
		
		
	}
}
