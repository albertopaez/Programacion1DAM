package ejercicio_01;

public class CuentaAhorro extends Cuenta{
	
	private double interes;

	public CuentaAhorro(long numerocuenta, double saldo, Persona cliente, double interes) {
		this.interes = interes;
		this.numerocuenta = numerocuenta;
		this.cliente = cliente;
		this.saldo = 20 + saldo;
	}
	
	public double getInteres() {
		return interes;
	}

	@Override
	public void retirar(double retirada) {
		if (saldo >= retirada+20) {
			saldo-=retirada;
			System.out.println("Retirada realizada con exito. Su saldo actual es de "+getSaldo());
		}else {
			System.out.println("No tiene suficiente saldo para realizar la operación."
					+ " Recuerde que debe dejar 20 euros de saldo en la cuenta en todo momento");
		}
	}

	@Override
	public void actualizarSaldo() {
		saldo += saldo*interes;
		System.out.println("Saldo actualizado con exito. Su saldo actual es de "+getSaldo());
	}
	
	public void actualizarInteres(double interes) {
		this.interes = interes;
		System.out.println("Interes actualizado con exito. Su nuevo interes es "+getInteres());
		
	}
	
	@Override
	public String toString() {
		return "Numero de cuenta: "+getNumerocuenta()+"\nCliente: "+cliente.getNombreYApellidos()+
				"\nNIF: "+cliente.getNif()+"\nSaldo: "+getSaldo()+"\nInteres anual: "+getInteres()+"%";
	}
	

}
