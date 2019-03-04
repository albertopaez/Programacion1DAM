package ejercicio_04;

public class Revista extends Publicacion{
	private int numero;
	
	public Revista(String codigo, String titulo, int anioPublicacion, int numero) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.anioPublicacion = anioPublicacion;
		this.numero = numero;
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "";
	}
	
}
