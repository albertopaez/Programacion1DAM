package ejercicio_04;

import java.util.List;

public class Publicacion {

	protected String codigo;
	protected String titulo;
	protected int anioPublicacion;
	
	
	public int publicacionesAnterioresA(List<Publicacion> publicaciones, int anio){
		int publicacionesAnteriores = 0;
		for (Publicacion i : publicaciones) {
			if(i.anioPublicacion<anio) {
				publicacionesAnteriores++;
			}
		}
		return publicacionesAnteriores;
	}
	
}
