package Level5;

import java.util.Scanner;

public class Ex52 {

	public static void main(String[] args) {
		
		/*	Programa lê o valor de um vetor e imprimir quantas vezes aparece a sequencia 1,3,4
		 * 	Se usuáro digitar valor negativo, encerrar o programa
		 */

		Scanner sc = new Scanner(System.in);

		int valor = 0;
		int soma = 0;

		try {

			do {
				System.out.print("Digite o tamanho do vetor (Valor negativo encerra o programa):  ");
				valor = sc.nextInt();
				while (valor > 100) {
					System.out.print("Valor deve ser maior que 0 e menor que 100! Digite novamente: ");
					valor = sc.nextInt();
				}

				int[] vect = new int[valor];

				for (int i = 0; i < vect.length; i++) {
					System.out.print("Digite o " + (i + 1) + "º valor: ");
					vect[i] = sc.nextInt();
				}

				for (int i = 0; i < vect.length; i++) {
					if (vect[i] == 1 && vect[i + 1] == 3 && vect[i + 2] == 4) {
						soma++;
					}

				}

				if (soma == 0) {
					System.out.println("O nº de vezes que a sequência 1, 3, 4 apareceu é 0.");
				} else {
					System.out.println("O nº de vezes que a sequência 1, 3, 4 apareceu ao total é de: " + soma);
				}

				System.out.println();
				soma -= soma;
			} while (valor >=0);

		} catch (NegativeArraySizeException e) {
			System.out.println("Programa encerrado com sucesso.");

			sc.close();
		}

	}
}
