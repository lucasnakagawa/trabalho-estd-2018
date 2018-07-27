package operacaominmax;

import java.util.Random;

public class MinMax {
	public int minMax1(int[] array) {
		int i;
		int min = array[0];
		int max = array[0];
		int operations = 2;
		
		for (i = 1; i < array.length; i++) {
			operations++;
			if (array[i] > max) {
				operations++;
				max = array[i];
			}
			
			operations++;
			if (array[i] < min) {
				operations++;
				min = array[i];
			}
		}
		
		return operations;
	}
	
	public int minMax2(int[] array) {
		int i;
		int min = array[0];
		int max = array[0];
		int operations = 2;
		
		for (i = 1; i < array.length; i++) {
			operations ++;
			if (array[i] > max) {
				operations++;
				max = array[i];
			} else {
				operations++;
				if (array[i] < min) {
					operations++;
					min = array[i];
				}
			}
		}
		
		return operations; 
	}
	
	public int minMax3(int[] array) {
		int operations = 0;
		
		operations++;
		if (array.length == 0) {
			System.out.println("O vetor está vazio...");
			return operations;
		}
		
		int minPos, maxPos;
		double menor = array[0];
		double maior = array[0];
		
		operations += 3;
		
		if (array.length == 1) {
			return operations;
		}
		
		operations++;
		
		if (array.length % 2 == 0) {
			for (int i=0; i<array.length; i+=2) {
				operations++;
				if (array[i] < array[i + 1]) {
					operations++;
					minPos = i;
					maxPos = i + 1;
				} else {
					operations++;
					minPos = i + 1;
					maxPos = i;
				}
				
				operations++;
				if (array[minPos] < menor) {
					operations++;
					menor = array[minPos];
				}
				
				operations++;
				if (array[maxPos] > maior) {
					operations++;
					maior = array[maxPos];
				}
			}
		} else {
			for (int i=1; i<array.length; i+=2) {
				operations++;
				if (array[i] < array[i + 1]) {
					operations++;
					minPos = i;
					maxPos = i + 1;
				} else {
					operations++;
					minPos = i + 1;
					maxPos = i;
				}
				
				operations++;
				if (array[minPos] < menor) {
					operations++;
					menor = array[minPos];
				}
				
				operations++;
				if (array[maxPos] > maior) {
					operations++;
					maior = array[maxPos];
				}
			}
		}
		
		return operations;
	}
	
	public int[] crescente(int[] array) {
		for (int i=1; i<=array.length; i++) {
			array[i-1] = i;
		}
		
		return array;
	}
	
	public int[] decrescente(int[] array) {
		int counter = 0;
		
		for (int i=array.length; i>0; i--) {
			array[counter] = i;
			counter++;
		}
		
		return array;
	}
	
	public int[] aleatorioIntercalado(int[] array) {
		for (int i=1; i<=array.length; i++) {
			if (i % 2 == 0) {
				array[i-1] = 100 - i;
			} else {
				array[i-1] = i;
			}
		}
		
		return array;
	}
	
	public int[] aleatorioRandomico(int[] array) {
		Random r = new Random();
		
		for (int i=0; i<array.length; i++) {
			array[i] = r.nextInt();
		}
		
		return array;
	}
}
