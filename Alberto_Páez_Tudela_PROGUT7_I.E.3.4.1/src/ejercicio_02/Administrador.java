package ejercicio_02;

public class Administrador extends Moderador{

	private int baneos;
	
	public Administrador(String correo, String nick) {
		super(correo, nick);
		this.mensajes = 0;
		this.correo = correo;
		this.nick = nick;
		this.papelera = 0;
		this.baneos = 0;
	}

	public int getBaneos() {
		return baneos;
	}
	
	public void setNick(String nuevoNick) {
		if(nuevoNick != "") {
			nick = nuevoNick;
		}else {
			System.out.println("Error. No se puede teenr un Nick vacio");
		}
	}
	
	public void baneosInc() {
		baneos += 1;
	}

}
