package llistaNumeros;

import java.util.Arrays;
import java.util.Random;

public class NumerosOrdenats {

	public static void main(String[] args) {
		
		int numero=39000;
		boolean trobat=false;
		
		int[] array = new int[500000];
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
		    array[i] = rand.nextInt(1000000) + 1;
		}
		Arrays.sort(array);
		long startTime = System.nanoTime();
		for(int i=0; i<array.length; i++) {
			if(array[i]==numero) {
				trobat=true;
			}
		}
		long endTime = System.nanoTime();
		System.out.println("Ha trobat el nomero? " + trobat);
		System.out.println("Ha tardat " + (endTime - startTime) + " nanosegons");
	}
}