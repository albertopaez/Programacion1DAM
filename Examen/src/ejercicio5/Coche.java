package ejercicio5;

public class Coche extends Vehiculo{
	//numero de puertas del coche
	private int numPuertas;

	
	//En los constructores asignamos 4 al numero de ruedas porque en todos los coche el numero de ruedas es 4
	public Coche(String matricula, String color) {
		super(matricula, color, 4);
		this.numPuertas = 4;
	}

	public Coche(String matricula, String color, double cilindrada) {
		super(matricula, color, 4, cilindrada);
		this.numPuertas = 4;
	}
	
	public Coche(String matricula, String color, double cilindrada, int potencia) {
		super(matricula, color, 4, cilindrada, potencia);
		this.numPuertas = 4;
	}
	
	public Coche(int numPuertas, String matricula, String color, double cilindrada, int potencia) {
		super(matricula, color, 4, cilindrada, potencia);
		this.numPuertas = numPuertas;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	
	//metodo para imprimir por pantalla los datos del coche
	public void mostrar() {
		System.out.println("Matricula: "+this.getMatricula()+"\nColor: "+this.getColor()+
				"\nCilindrada: "+this.getCilindrada()+"\nPotencia: "+this.getPotencia()+
				"\nNumero de puertas: "+this.getNumPuertas()+"\nNumero de ruedas: "+this.getNruedas());
	}
	
	

}
