package Level4;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		
		/* Programa para calcular e exibir a soma dos quadrados dos 20 primeiros nºs ímpares
		 * a partr de um nº informado pelo usuário entre 0 e 10
		 * O for deve começar a partir de nº do usuário e a quantidade (20) deve ser somada ao nº
		 * previamente informado para que o programa funcione
		 */

		Scanner sc = new Scanner(System.in);

		double soma = 0;
		double quadrado = 0;

		System.out.print("Digite um nº maior que 0 e menor que 10: ");
		int n = sc.nextInt();
		while (n > 10 || n <= 0 ) {
			System.out.print("Valor inválido! Digite novamente: ");
			n = sc.nextInt();
		}

		for (int i = n; i<(20+n); i++) {
			if (i % 2 != 0) {
				quadrado = Math.pow(i, 2);
				soma += quadrado;
				
			}
		
		}
		System.out.println("A soma dos quadrados é de: " + soma);

		sc.close();

	}

}
