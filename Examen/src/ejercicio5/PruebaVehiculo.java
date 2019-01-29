package ejercicio5;

public class PruebaVehiculo {
	public static void main(String[] args) {
		
		Coche c1 = new Coche("0000BBB", "gris plata");
		c1.setNumPuertas(3);
		Moto m1 = new Moto("2222BBB", "negro");
		m1.setNumPlazas(2);
		
		c1.mostrar();
		m1.mostrar();
		
	}
}
