package ejercicio_01;

/**
 * <h2>Clase DVDCine, se usa para almacenar y acceder a peliculas en una BD</h2>
 * @author Alberto Páez Tudela
 * @since 03-12-2018
*/

public class DVDCine {
	/**
	 * Atributo nombre de la pelicula
	 */
	private String nombre;
	/**
	 * Atributo nombre del autor de la pelicula
	 */
	private String autor;
	/**
	 * Atributo actores destacados de la pelicula
	 */
	private String actores;
	/**
	 * Atributo genero de la pelicula
	 */
	private String genero;
	/**
	 * Atributo duración de la pelicula
	 */
	private int duracion;
	/**
	 * Atributo resumen de la pelicula
	 */
	private String resumen;
	/**
	 * Constructor sin parametros
	 * Crea pelicula generica por defecto
	 */
	public DVDCine(){
		nombre="Nombre";
		genero="Género";
		autor="Autor";
		actores="";
		duracion=0;
		resumen="";
	}
	
	//Métodos públicos
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getActores() {
		return actores;
	}
	public void setActores(String actores) {
		this.actores = actores;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public String getResumen() {
		return resumen;
	}
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	
	public boolean tieneResumen () {
		return !resumen.isEmpty();
	}
	
	/**
	 * Devuelve true si la pelicula es de genero Thriller y false en caso contrario
	 */
	public boolean esThriller () {
		boolean esThriller;
		if (genero.equalsIgnoreCase("Thriller")) {
			esThriller = true;
		} else {
			esThriller = false;
		}
		return esThriller;
	}
	
	/**
	 * Devuelve la duración de la pelicula mas un string para se más legible
	 */
	public String muestraDuracion() {
		return duracion + " min";
	}
	
	/**
	 * Devuelve todos los datos de la pelicula
	 */
	public String muestraDVDCine() {
		return nombre + " De: " + autor +
				"\nCon: " + actores + "\n \n" + genero + " - " + duracion + " min \n \nResumen: "
				+ resumen;
	}

}
