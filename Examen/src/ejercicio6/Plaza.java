package ejercicio6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import utilidad.Prueba;

public class Plaza {
	//variable donde almacenaremos la cantidad de coches que han usado la plaza
	private int ocupantes;
	private int numeroPlaza;
	private Coche coche;
	//cuando la plaza está disponible su valor sera true y cuando false
	private boolean disponible;
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Prueba p = new Prueba();
	
	public Plaza(int numeroPlaza) {
		this.numeroPlaza = numeroPlaza;
		this.coche = null;
		this.disponible = true;
		this.ocupantes=0;
	}
	
	public int getOcupantes() {
		return ocupantes;
	}

	public int getNumeroPlaza() {
		return numeroPlaza;
	}

	public void setNumeroPlaza(int numeroPlaza) {
		this.numeroPlaza = numeroPlaza;
	}

	public Coche getCoche() {
		return coche;
	}

	public void setCoche(Coche coche) {
		this.coche = coche;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	public void mostrar() {
		String coche;
		String ocupado = "No";
		if(this.getCoche()==null) {
			coche = "No hay coche aparcado";
		}else {
			coche=this.getCoche().getMatricula();
		}
		if(this.isDisponible()==true) {
			ocupado="Si";
		}
		
		System.out.println("Numero de plaza: "+this.getNumeroPlaza()+"\nCoche: "+coche+
				"\nDisponible: "+ocupado+"\nNumero de coches aparcados: "+
				this.getOcupantes());
	}
	
	public void menu() throws IOException{
		int opcion;
		do {
			System.out.println("MENU DE APARCAMIENTO:\n1. Aparcar coche\n2. Sacar coche"
					+ "\n3. Ver coche aparcado\n4. Salir aplicación");
			opcion = p.tryInteger();
			switch(opcion) {
			case 1:
				this.aparcar();
				break;
			case 2:
				this.sacar();
				break;
			case 3:
				this.mostrarCoche();
				break;
			case 4:
				this.mostrar();
				break;
			default:
				System.out.println("Comando invalido");
			}
		}while(opcion!=4);
		
	}
	
	public void aparcar() throws IOException {
		if(this.isDisponible()==true) {
			System.out.println("Introduzca matricula del coche");
			String matricula = br.readLine();
			System.out.println("Introduzca marca del coche");
			String modelo = br.readLine();
			System.out.println("Introduzca modelo del coche");
			String marca = br.readLine();
			Coche coche = new Coche(matricula, marca, modelo);
			this.setCoche(coche);
			this.setDisponible(false);
			this.ocupantes++;
			System.out.println("EL COCHE SE HA APARCADO");
		}else {
			System.out.println("PLAZA YA OCUPADA POR OTRO COCHE");
		}
	}
	
	public void sacar() {
		if(this.isDisponible()==false) {
			System.out.println("PLAZA LIBRE EL COCHE "+this.getCoche().getMatricula() +
					" HA SALIDO DE LA PLAZA");
			this.setCoche(null);
			this.setDisponible(true);
		}else {
			System.out.println("ERROR, NO HAY COCHE EN LA PLAZA DE APARCAMIENTO"
					+ " LA PLAZA ESTÁ LIBRE");
		}
	}
	
	public void mostrarCoche() {
		if(this.isDisponible()==false) {
			System.out.println("Matricula: "+this.getCoche().getMatricula()+"\nMarca: "+
		this.getCoche().getMarca()+"\nModelo: "+this.getCoche().getModelo());
		}else {
			System.out.println("LA PLAZA ESTA LIBRE");
		}
	}
}
