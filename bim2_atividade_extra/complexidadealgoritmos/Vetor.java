package complexidadealgoritmos;

public class Vetor {
		
	public double[] obterMaiorMenorValor(double[] array) {
		if (array.length == 0) {
			System.out.println("O vetor está vazia...");
			return new double[] {0, 0};
		}
		
		int minPos, maxPos;
		double menor = array[0];
		double maior = array[0];
		
		if (array.length == 1) {
			return new double[] {menor, maior};
		}
		
		if (array.length % 2 == 0) {
			for (int i=0; i<array.length; i+=2) {
				if (array[i] < array[i + 1]) {
					minPos = i;
					maxPos = i + 1;
				} else {
					minPos = i + 1;
					maxPos = i;
				}
				
				if (array[minPos] < menor) {
					menor = array[minPos];
				}
				
				if (array[maxPos] > maior) {
					maior = array[maxPos];
				}
			}
		} else {
			for (int i=1; i<array.length; i+=2) {
				if (array[i] < array[i + 1]) {
					minPos = i;
					maxPos = i + 1;
				} else {
					minPos = i + 1;
					maxPos = i;
				}
				
				if (array[minPos] < menor) {
					menor = array[minPos];
				}
				
				if (array[maxPos] > maior) {
					maior = array[maxPos];
				}
			}
		}
		
		
		return new double[] {menor, maior};
	}
}
