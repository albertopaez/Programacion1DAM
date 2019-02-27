package ejercicio_02;

public class Usuario {
	
	protected int mensajes;
	protected String correo;
	protected String nick;
	
	public Usuario(String correo, String nick) {
		this.mensajes = 0;
		this.correo = correo;
		this.nick = nick;
	}
	
	public int getMensajes() {
		return mensajes;
	}

	public String getCorreo() {
		return correo;
	}

	public String getNick() {
		return nick;
	}

	void incrementar() {
		mensajes += 1;
	}
	
	void decrementar() {
		if(mensajes >0) {
		mensajes -= 1;
		}else {
			System.out.println("Error. No puedes tener mensajes negatvitos");
		}
	}

	void modificarCorreo(String nuevocorreo) {
		if(nuevocorreo != "") {
			correo = nuevocorreo;
		}else {
			System.out.println("Error. No se puede teenr un correo vacio");
		}
		
	}
	
	
}
