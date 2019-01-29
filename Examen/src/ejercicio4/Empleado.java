package ejercicio4;

public class Empleado {
	
	//nombre (de tipo String), salario (de tipo int) y dirección (de tipo Dirección).
	private String nombre;
	private int salario;
	private Direccion direccion;
	
	
	public Empleado(String nombre, int salario, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.salario = salario;
		this.direccion = direccion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getSalario() {
		return salario;
	}


	public void setSalario(int salario) {
		this.salario = salario;
	}


	public Direccion getDireccion() {
		return direccion;
	}


	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	public void mostrar() {
		System.out.println("Nombre: "+this.nombre+"\nSalario: "+this.salario+"\nDirección:\n	Calle: "+
	this.direccion.getCalle()+"\n	Numero: "+this.direccion.getNumero()+"\n	Piso: "+this.direccion.getPiso()+
	"\n	Ciudad: "+this.direccion.getCiudad());
	}

}
