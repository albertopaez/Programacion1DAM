package practicaArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import utilidad.Input;

public class Persona {

	private int idPersona;
	private String nombre;
	private int altura;

	public Persona(int idPersona, String nombre, int altura) {
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.altura = altura;
	}

	Input i = new Input();

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona-> ID: " + idPersona + " Nombre: " + nombre + " Altura:" + altura + "\n";
	}

	public void listar(List<Persona> lp) {
		for (int x = 0; x < lp.size(); x++) {
			System.out.println(lp.get(x).toString());
		}
	}

	public void crear(List<Persona> lp) {
		if (lp.isEmpty()) {
			Persona p = new Persona(0, "Persona0", 100 + (int) Math.random() * 100 + 1);
			int id = p.getIdPersona() + 1;
			p.setIdPersona(id);
			p.setNombre("Persona" + id);
			p.setAltura(100 + (int) Math.random() * 100 + 1);
			lp.add(p);
		} else {
			Persona p = lp.get(lp.size() - 1);
			int id = p.getIdPersona() + 1;
			p.setIdPersona(id);
			p.setNombre("Persona" + id);
			p.setAltura(100 + (int) Math.random() * 100 + 1);
			lp.add(p);
		}
	}

	public void consultar(List<Persona> lp, int id) {
		Persona p = new Persona(lp.size(), "nombre", lp.size());
		for (int x = 0; x < lp.size(); x++) {
			if (lp.get(x).getIdPersona() == id) {
				p = lp.get(x);
			}
		}
		System.out.println(p.toString());
	}

	public void actualizar(List<Persona> lp, int id) throws IOException {
		for (int x = 0; x < lp.size(); x++) {
			if (lp.get(x).getIdPersona() == id) {
				System.out.println("introduzca la nueva id");
				int aux = i.tryIntegerPositivo();
				lp.get(x).setIdPersona(aux);

				System.out.println("introduzca el nuevo nombre");
				String nombre = br.readLine();
				lp.get(x).setNombre(nombre);

				System.out.println("introduzca la nueva altura");
				aux = i.tryIntegerPositivo();
				lp.get(x).setAltura(aux);
			}
		}
	}

	public void borrar(List<Persona> lp, int id) {
		for (int x = 0; x < lp.size(); x++) {
			if (lp.get(x).getIdPersona() == id) {
				lp.remove(x);
			}
		}
	}
	
}
