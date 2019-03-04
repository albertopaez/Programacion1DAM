package ejercicio_05;

public class Comercial extends Empleado{

	private double sueldoBruto;
	private double importeVentas;
	
	
	public Comercial(String nombre, String dni) {
		super(nombre, dni);
		// TODO Auto-generated constructor stub
	}

	
	public double sueldo() {
		// TODO Auto-generated constructor stub
		return 0;
	}
	
	public double calcularComision() {
		return importeVentas/10;
	}
	
	@Override
	public double calcularSueldo() {
		// TODO Auto-generated constructor stub
		return 0;
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
