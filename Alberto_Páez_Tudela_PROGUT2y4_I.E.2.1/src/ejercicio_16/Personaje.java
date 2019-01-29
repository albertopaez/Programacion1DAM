package ejercicio_16;

/**
 * <h2>Clase Personaje, se usa como clase abstracta para otras clases</h2>
 * @author Alberto P�ez Tudela
 * @since 03-12-2018
*/
public class Personaje {
	//Atributo nombre del personaje
	protected String nombre;
	//Atributo energ�a m�xima del personaje
	protected int energiaMaxima;
	//Atributo energ�a actual del personaje
	protected int energiaActual;
	
	/**
	 * Constructor con 2 parametros de entradas
	 * La cantidad de energ�a del personaje se inicializa para ser igual a la energ�a m�xima
	 * @param nombre
	 * @param energ�a maxima
	 */
	public Personaje(String nombre, int energiaMaxima) {
		this.nombre = nombre;
		this.energiaMaxima = energiaMaxima;
		this.energiaActual = energiaMaxima;
	}

	/**
	 * Constructor con 1 parametros de entradas
	 * La cantidad de energ�a maxima y actual del personaje es 100
	 * @param nombre
	 */
	public Personaje(String nombre) {
		this.nombre = nombre;
		this.energiaMaxima = 100;
		this.energiaActual = 100;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEnergiaMaxima() {
		return energiaMaxima;
	}


	public void setEnergiaMaxima(int energiaMaxima) {
		this.energiaMaxima = energiaMaxima;
	}


	public int getEnergiaActual() {
		return energiaActual;
	}


	public void setEnergiaActual(int energiaActual) {
		this.energiaActual = energiaActual;
	}
	
	/**
	 * Aumenta la energ�a actual del personaje y muestra un mensaje que depende de la cantidad de energ�a actual
	 * respecto a la cantidad de energ�a m�xima
	 */
	public void comer() {
		int alimento = (int) Math.floor(Math.random()*10+11);
		
		if(alimento+this.energiaActual<=this.energiaMaxima/2) {
			this.energiaActual+=alimento;
			System.out.println("Sigo teniendo hambre...");
		}else {
			if(alimento+this.energiaActual<this.energiaMaxima) {
				this.energiaActual+=alimento;
				System.out.println("Todavia podr�a comer m�s...");
			}else {
				if(alimento+this.energiaActual>=this.energiaMaxima) {
					this.energiaActual=this.energiaMaxima;
					System.out.println("�No puedo dar ni un bocado m�s!");
				}
			}
			
		}
	}
	

}
