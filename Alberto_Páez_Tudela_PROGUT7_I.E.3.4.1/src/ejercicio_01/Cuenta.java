package ejercicio_01;

public abstract class Cuenta {
	
	protected long numerocuenta;
	protected double saldo;
	protected Persona cliente;
	

	public long getNumerocuenta() {
		return numerocuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public Persona getCliente() {
		return cliente;
	}
	
	public void ingresar(double ingreso) {
		saldo += ingreso;
	}
	
	public abstract void retirar(double retirada);
	
	public abstract void actualizarSaldo();
	

}
