package ejercicio_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {

		FileInputStream file = null;
		String entrada = "";
		char c;

		try {
			file = new FileInputStream("test1.txt");
			int size = file.available();
			for (int i = 0; i < size; i++) {
				c = (char) file.read();
				entrada = entrada + c;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				file.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		CuentaPalabras cp = new CuentaPalabras();

		System.out.println(cp.cuentaPalabras(entrada));

	}
}