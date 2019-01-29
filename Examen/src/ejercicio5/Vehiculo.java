package ejercicio5;

public class Vehiculo {
	private String matricula;
	private String color;
	//numero de ruedas del vehiculo
	private int nruedas;
	//no tengo ni idea de como funciona la cilindrada de un coche.
	//he puesto double porque creo que es un numero con decimales, pero por poner algo.
	private double cilindrada;
	private int potencia;
	
	
	public Vehiculo(String matricula, String color, int nruedas) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.nruedas = nruedas;
		this.cilindrada = 12;
		this.potencia= 12;
	}

	public Vehiculo(String matricula, String color, int nruedas, double cilindrada) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.nruedas = nruedas;
		this.cilindrada = cilindrada;
		this.potencia= 12;
	}

	public Vehiculo(String matricula, String color, int nruedas, double cilindrada, int potencia) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.nruedas = nruedas;
		this.cilindrada = cilindrada;
		this.potencia = potencia;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getColor() {
		return color;
	}

	public int getNruedas() {
		return nruedas;
	}
	

}
