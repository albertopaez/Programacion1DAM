package ejercicio_05;

import ejercicio_06.Persona;

/**
 * <h2>Clase Empleado, se usa para almacenar empleados en una BD</h2>
 * Hereda de ejercicio_06.Persona
 * @author Alberto Páez Tudela
 * @since 03-12-2018
*/
public class Empleado extends Persona implements Cloneable  {
	// Atributo nif del empleado
	private long nif;
	// Atributo sueldo base del empleado
	private double sueldoBase;
	// Atributo pago por cada hora extra del empleado
	private double pagoHorasExtras;
	// Atributo cantidad de horas extras trabajadas del empleado
	private int horasExtras;
	// Atributo IRPF inicial del empleado
	private double tipo;
	// Atributo que indica si esta casado o no el empleado
	private boolean casado;
	// Atributo cantidad de hijos del empleado
	private int hijos;

	/**
	 * Constructor sin parametros
	 * Crea un empleado generico por defecto con todos los atributos
	 */
	public Empleado() {
		this.nif=100000000;
		this.sueldoBase=1000;
		this.pagoHorasExtras=5;
		this.horasExtras=10;
		this.tipo=5;
		this.casado=false;
		this.hijos=0;
	}

	public Empleado(long nif) {
	}

	public long getNif() {
		return nif;
	}

	public void setNif(long nif) {
		this.nif = nif;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public double getPagoHorasExtras() {
		return pagoHorasExtras;
	}

	public void setPagoHorasExtras(double pagoHorasExtras) {
		this.pagoHorasExtras = pagoHorasExtras;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	public double getTipo() {
		return tipo;
	}

	public void setTipo(double tipo) {
		this.tipo = tipo;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public int getHijos() {
		return hijos;
	}

	public void setHijos(int hijos) {
		this.hijos = hijos;
	}

	public double complementoHorasExtras() {
		return pagoHorasExtras * horasExtras;
	}

	/**
	 * Devuelve el irpf contancod con el tipo y los modificadores por estar casado y cantidad de hijos
	 */
	public double irpf() {
		double irpf = this.tipo;
		if (casado = true) {
			irpf -= 2;
		}
		irpf -= this.hijos;
		return irpf;
	}
	
	/**
	 * Devuelve el sueldo bruto contando las horas extras
	 */
	public double sueldoBruto() {
		return sueldoBase + this.complementoHorasExtras();
	}
	
	/**
	 * Devuelve el sueldo neto contando con el sueldo bruto y el irpf
	 */
	public double sueldoNeto() {
		return (this.sueldoBruto() - (this.sueldoBruto() / 100) * this.irpf());
	}

	public String println() {
		String casado;
		if (this.casado = true) {
			casado = "Si";
		} else {
			casado = "No";
		}
		return "NIF: " + this.nif + "\nNombre: "+ this.nombre + "\nCasado: " + 
		"\nEdad: "+ this.edad + casado + "\nHijos: " + this.hijos + "\nTipo IRPF: " + this.tipo +
		"\nHoras extra: " + this.horasExtras;
	}

	/**
	 * Devuelve los datos del empleado con strings para facilitar la legibilidad
	 */
	public String printAll() {
		return this.println() + "\nRetención IRPF: " + this.irpf() + "\nComplemento por horas extras: " +
		this.pagoHorasExtras + "\nSueldo base: " + this.sueldoBase + "\nSueldo base: " 
		+ this.sueldoBruto() + "\nSueldo base: " + this.sueldoNeto();
	}


	/**
	 * Devuelve un clos de un objeto Empleado
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Empleado newObj = new Empleado();

		newObj.setNif(nif);
		newObj.setSueldoBase(sueldoBase);
		newObj.setPagoHorasExtras(pagoHorasExtras);
		newObj.setHorasExtras(horasExtras);
		newObj.setTipo(tipo);
		newObj.setCasado(casado);
		newObj.setHijos(hijos);

		return newObj;

	}

}