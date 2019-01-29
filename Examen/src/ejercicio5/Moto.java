package ejercicio5;

public class Moto extends Vehiculo{
	//numero de plazas
	private int numPlazas;
	
	public Moto(String matricula, String color) {
		super(matricula, color, 2);
		this.setNumPlazas(2);
	}

	//En los constructores asignamos 2 al numero de ruedas porque en todas las motos el numero de ruedas es 2
	public Moto(String matricula, String color, int nruedas, double cilindrada) {
		super(matricula, color, 2, cilindrada);
		this.setNumPlazas(2);
	}
	
	public Moto(String matricula, String color, int nruedas, double cilindrada, int potencia) {
		super(matricula, color, 2, cilindrada, potencia);
		this.setNumPlazas(2);
	}
	
	public Moto(int numPlazas, String matricula, String color, int nruedas, double cilindrada, int potencia) {
		super(matricula, color, 2, cilindrada, potencia);
		this.setNumPlazas(numPlazas);
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}
	
	//metodo para imprimir por pantalla los datos de la moto
	public void mostrar() {
		System.out.println("Matricula: "+this.getMatricula()+"\nColor: "+this.getColor()+
				"\nCilindrada: "+this.getCilindrada()+"\nPotencia: "+this.getPotencia()+
				"\nNumero de plazas: "+this.getNumPlazas()+"\nNumero de ruedas: "+this.getNruedas());
	}

}
