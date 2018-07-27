package operacaominmax;

public class Main {

	public static void main(String[] args) {
		MinMax mm = new MinMax();
		
		for (int i=1; i<=100; i++) {
			int[] vetor = new int[i];
			int operations1 = mm.minMax1(mm.crescente(vetor));
			int operations2 = mm.minMax2(mm.crescente(vetor));
			int operations3 = mm.minMax2(mm.decrescente(vetor));
			int operations4 = mm.minMax2(mm.aleatorioRandomico(vetor));
			int operations5 = mm.minMax2(mm.aleatorioIntercalado(vetor));
			int operations6 = mm.minMax3(mm.crescente(vetor));
			System.out.println(i + ";" + operations1 + ";" + operations2 + ";" + operations3 + ";" + operations4 + ";" + operations5 + ";" + operations6 + ";");
		}
	}

}
