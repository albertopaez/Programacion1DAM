package Ejercicio_06;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ParesImpares {
	public static void main(String[] args) throws IOException {
		
	int[] vector= new int[100];
	ArrayList<Integer> pares = new ArrayList<Integer>();
	ArrayList<Integer> impares = new ArrayList<Integer>();
		
	for (int i = 0; i < vector.length; i++) {
		vector[i] = (int) (Math.random() * 1000+1);
	}
	
	for (int i = 0; i < vector.length; i++) {
		if(vector[i]%2==0) {
			pares.add(vector[i]);
		}else {
			impares.add(vector[i]);
		}
		
	}
	
	System.out.println("Vector: "+Arrays.toString(vector)+
			"\nPares: "+pares.toString()+"\nimpares: "+impares.toString());
	
	}
}
