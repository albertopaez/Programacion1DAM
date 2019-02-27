package ejercicio_02;

public class Moderador extends Usuario {
	
	
	protected int papelera;
	
	public Moderador(String correo, String nick) {
		super(correo, nick);
		this.mensajes = 0;
		this.correo = correo;
		this.nick = nick;
		this.papelera = 0;
	}

	public int getPapelera() {
		return papelera;
	}
	
	public void papeleraInc() {
		papelera += 1;
	}


}
