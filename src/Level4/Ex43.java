package Level4;

public class Ex43 {

	public static void main(String[] args) {
		
		/* O primeiro quadro do tabuleiro contem apenas 1 grão
		 * Os demais, tem o dobro do quadrado anterior
		 */
		
		
		float primeiro = 1;
		float prox = 2;
		float soma = 0;
		for (int i = 0; i<64; i++) {
			prox = prox * 2;
			soma = (soma + prox) + primeiro;
		}
		System.out.printf("A quantidade de grãos a ser paga seria de: %.2f%n", soma);

	}

}
