package complexidadealgoritmos;

public class Main {

	public static void main(String[] args) {
		Vetor vetor = new Vetor();
		
		double[] array = {75274, 0, 100, 45, 1234, 23, 500, 1000};
		
		double[] valores = vetor.obterMaiorMenorValor(array);
		
		System.out.println("Menor = " + valores[0]);
		System.out.println("Maior = " + valores[1]);
	}

}
