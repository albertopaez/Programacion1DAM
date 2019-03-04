package ejercicio_05;

public abstract class Empleado implements Calculos{
	
	protected String nombre;
	protected String dni;
	
	
	public Empleado(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public String getDni() {
		return dni;
	}

	public abstract double calcularSueldo();

	
}
