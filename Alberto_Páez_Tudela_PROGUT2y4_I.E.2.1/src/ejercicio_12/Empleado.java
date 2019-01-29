package ejercicio_12;


/**
 * <h2>Clase Empleado, se usa para almacenar empleados en una BD</h2>
 * @author Alberto Páez Tudela
 * @since 03-12-2018
*/
public class Empleado {
	//Atributo horas trabajadas
	private int horas;
	//Atributo precio horas trabajadas
	private double tarifa;
	
	/**
	 * Constructor sin parametros
	 * Crea un empleado generico por defecto con todos los atributos
	 */
	public Empleado() {
		horas=40;
		tarifa=20;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	
	/**
	 * Devuelve los datos del empleado con strings para facilitar la legibilidad y teniendo en cuenta el
	 * aumento de tarifa (*1.5) por superar las 40 horas
	 */
	public String mostrarSueldo() {
		if(horas>40) {
			return "ha trabajado "+horas+" horas con una tarifa de "+tarifa+"."+
					"\nPor lo tanto le corresponde un sueldo de "+(40*tarifa+(horas-40)*1.5*tarifa);
		}else {
			return "ha trabajado "+horas+" horas con una tarifa de "+tarifa+"."+
					"\nPor lo tanto le corresponde un sueldo de "+(horas*tarifa);
		}
	}
	

}
