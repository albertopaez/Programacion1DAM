package ejercicio_09;

import java.io.IOException;

import utilidad.Prueba;

/**
 * <h2>Clase Docente, se usa para almacenar docentes en una BD</h2>
 * Hereda de Persona
 * @author Alberto Páez Tudela
 * @since 03-12-2018
*/
public class Estudiante extends Persona {
	//Atributo codigo del estudiante
	private int codigo;
	//Atributo categoria del estudiante
	private String categoria;
	//Atributo colegio de procedencia del estudiante
	private String colegioProcedencia;
	//Atributo pago de la pensión del estudiante
	private double pagoPension;

	Prueba p = new Prueba();
	
	/**
	 * Constructor con estudiante generico con parametros por defecto
	 */
	public Estudiante() {
		super();
		this.codigo = 10001;
		this.categoria = "Actually pretty good!";
		this.colegioProcedencia = "Hermelinda Nuñez";
		this.pagoPension = 101;
	}

	/**
	 * Constructor con 8 parametros
	 * @param codigo
	 * @param categoria
	 * @param colegio de procedencia
	 * @param pensión
	 * @param apellidos, heredado de persona
	 * @param nombre, heredado de persona
	 * @param dni, heredado de persona
	 * @param sexo, heredado de persona
	 */
	public Estudiante(int codigo, String categoria, String colegioProcedencia, int pagoPension, String apellidos,
			String nombre, String dni, String sexo) {
		super(apellidos, nombre, dni, sexo);
		this.codigo = codigo;
		this.categoria = categoria;
		this.colegioProcedencia = colegioProcedencia;
		this.pagoPension = pagoPension;
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

	public String getColegioProcedencia() {
		return colegioProcedencia;
	}

	public void setColegioProcedencia(String colegioProcedencia) {
		this.colegioProcedencia = colegioProcedencia;
	}

	public double getPagoPension() {
		return pagoPension;
	}

	public void setPagoPension(double pagoPension) {
		this.pagoPension = pagoPension;
	}

	/**
	 * Devuelve la pensión del almuno tras calcular el posible descuento en basse a su promedio ponderado
	 * pidiendo dentro del metodo dicho promedio ponderado
	 */
	public double getDescuentoPension() throws IOException {
		int promedio;
		double pension;
		System.out.println("Introduzca el promedio ponderado del alumno");
		promedio = p.tryInteger();
		if (promedio >= 13 && promedio <= 16) {
			pension = this.pagoPension - (this.pagoPension / 100) * 8;
		} else {
			pension = this.pagoPension - (this.pagoPension / 100) * 15;
		}

		return pension;
	}

}
