package ejercicio_05;

public class Directivo extends Empleado{
	
	private double sueldo;
	private double comision;
	
	
	public double getSueldo() {
		return sueldo;
	}


	public double getComision() {
		return comision;
	}


	public Directivo(String nombre, String dni) {
		super(nombre, dni);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public double calcularSueldo() {
		return sueldo+comision;
	}


	@Override
	public double retencion() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double gratifiacion(int hijos) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double calcular() {
		// TODO Auto-generated method stub
		return 0;
	}

}
