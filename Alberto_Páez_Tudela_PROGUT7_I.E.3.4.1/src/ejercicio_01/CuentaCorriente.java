package ejercicio_01;

public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(long numerocuenta, double saldo, Persona cliente) {
		this.numerocuenta = numerocuenta;
		this.cliente = cliente;
		this.saldo = saldo;
	}

	@Override
	public void retirar(double retirada) {
		if (saldo >= retirada) {
			saldo-=retirada;
			System.out.println("Retirada realizada con exito. Su saldo actual es de "+getSaldo());
		}else {
			System.out.println("No tiene suficiente saldo para realizar la operación");
		}
	}

	@Override
	public void actualizarSaldo() {
		saldo += saldo*1.5;
		System.out.println("Saldo actualizado con exito. Su saldo actual es de "+getSaldo());
	}
	
	@Override
	public String toString() {
		return "Numero de cuenta: "+getNumerocuenta()+"\nCliente: "+cliente.getNombreYApellidos()+
				"\nNIF: "+cliente.getNif()+"\nSaldo: "+getSaldo()+"\nInteres anual: 1'5%";
	}
	
	

}
