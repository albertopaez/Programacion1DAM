package ejercicio_09;

/**
 * <h2>Clase Docente, se usa para almacenar docentes en una BD</h2>
 * Hereda de Persona
 * @author Alberto Páez Tudela
 * @since 03-12-2018
*/
public class Docente extends Persona{
	//Atributo codigo del doncente
	private int codigo;
	//Atributo categoria del doncente
	private String categoria;
	//Atributo estudios de posgrado del doncente
	private String estuduiosPostgrado;
	//Atributo horas de clase dadas por el doncente
	private int horasClase;
	//Atributo pago por horas de clases dadas por el doncente
	private double pagoHoras;
	
	/**
	 * Constructor con doncente generico con parametros por defecto
	 */
	public Docente() {
		super();
		this.codigo=10001;
		this.categoria="Kept you waiting huh?";
		this.estuduiosPostgrado="Física Cuantica";
		this.horasClase=20;
		this.pagoHoras=11.18;
	}
	
	/**
	 * Constructor con 9 parametros
	 * @param codigo
	 * @param categoria
	 * @param estudios de posgrado
	 * @param horas de clases dadas
	 * @param por por hora de clase dada
	 * @param apellidos, heredado de persona
	 * @param nombre, heredado de persona
	 * @param dni, heredado de persona
	 * @param sexo, heredado de persona
	 */
	public Docente(int codigo, String categoria, String estuduiosPostgrado, int horasClase, double pagoHoras,
			String apellidos, String nombre, String dni, String sexo) {
		super(apellidos, nombre, dni, sexo);
		this.codigo = codigo;
		this.categoria = categoria;
		this.estuduiosPostgrado = estuduiosPostgrado;
		this.horasClase = horasClase;
		this.pagoHoras = pagoHoras;
	}



	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getEstuduiosPostgrado() {
		return estuduiosPostgrado;
	}

	public void setEstuduiosPostgrado(String estuduiosPostgrado) {
		this.estuduiosPostgrado = estuduiosPostgrado;
	}

	public int getHorasClase() {
		return horasClase;
	}

	public void setHorasClase(int horasClase) {
		this.horasClase = horasClase;
	}

	public double getPagoHoras() {
		return pagoHoras;
	}

	public void setPagoHoras(double pagoHoras) {
		this.pagoHoras = pagoHoras;
	}
	
	/**
	 * Devuelve el pago de las horas dadas (double)
	 */
	public double getPagoParcial() {
		return horasClase*pagoHoras;
	}
	
	/**
	 * Devuelve los datos del docente con strings para facilitar la legibilidad
	 */
	public String mostrarDatos() {
		return "\nNombre: " + this.nombre + "\nApellidos: " + this.apellidos +
				"\nDNI: " + this.dni + "\nSexo: " + this.sexo;
	}


}
