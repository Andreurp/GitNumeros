package llistaNumeros;

import java.util.Arrays;
import java.util.Random;

public class NumerosOrdenats  {

	public static void main(String[] args) {
		
		int numero=39000;
		boolean trobat=false;
		boolean sortir = false;
		
		int[] array = new int[500000];
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
		    array[i] = rand.nextInt(1000000) + 1;
		}
		Arrays.sort(array);
		long startTime = System.nanoTime();
		int i=0;
		do{
			if(array[i]==numero) {
				trobat=true;
				sortir = true;
			}
			if(array[i]>numero) {
				sortir=true;
			}
			i++;
		}while(sortir==false && i<array.length);
		long endTime = System.nanoTime();
		System.out.println("Ha trobat el nomero? " + trobat);
		System.out.println("Ha tardat " + (endTime - startTime) + " nanosegons");
	}
}