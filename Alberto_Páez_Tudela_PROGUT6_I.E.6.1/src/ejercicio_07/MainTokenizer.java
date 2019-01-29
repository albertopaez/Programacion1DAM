package ejercicio_07;

import java.io.IOException;

public class MainTokenizer {
	public static void main(String[] args) throws IOException {
		
		Tokenizer t = new Tokenizer();
		
		
		System.out.println(t.tokenizer("Juan Carlos \n 8.5 \n Andrés \n 4.9 \n Pedro \n 3.8 \n Juan \n 6.3"));
		
	}
}
