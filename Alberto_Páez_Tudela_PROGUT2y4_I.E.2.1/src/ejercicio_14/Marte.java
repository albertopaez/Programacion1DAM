package ejercicio_14;

import java.io.IOException;

public class Marte {
	public static void main(String[] args) throws IOException {
		
		
		Marciano et1 = new Marciano("Bogothoint");
		et1.cuentaMarcianos();
		Marciano et2 = new Marciano("Clzarhorhoac");
		et1.cuentaMarcianos();
		Marciano et3 = new Marciano("Entharu");
		et1.cuentaMarcianos();
		et2.muere();
		Marciano et4 = new Marciano("Gorharu");
		et1.cuentaMarcianos();
		et2.muere();
		et1.estaVivo();
		et2.estaVivo();
		et3.estaVivo();
		et4.estaVivo();
		
		
	}
}
