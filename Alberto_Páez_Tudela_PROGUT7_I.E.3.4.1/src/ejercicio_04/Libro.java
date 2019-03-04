package ejercicio_04;

import java.util.List;

public class Libro extends Publicacion implements Prestable{
	private boolean prestado; //true = esta prestado
	
	
	public Libro(String codigo, String titulo, int anioPublicacion) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.anioPublicacion = anioPublicacion;
		this.prestado=false;
	}
	
	
	
	public String getCodigo() {
		return codigo;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	
	public int cuentaPrestados(List<Libro> libros) {
		int cuenta = 0;
		for (Libro i : libros) {
			if(i.prestado==true) {
				cuenta++;
			}
		}
		return cuenta;
	}

	
	@Override
	public void prestar() {
		if(prestado==true) {
			prestado=true;
		}else {
			System.out.println("El libro ya se encuentra prestado");
		}
		
		
	}
	@Override
	public void devolver() {
		if(prestado==false) {
			prestado=true;
		}else {
			System.out.println("El libro ya se encuentra devuelto");
		}
	}
	@Override
	public boolean prestado() {
		return prestado;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "";
	}
	
	
}
