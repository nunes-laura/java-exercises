package Level3;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		
		/* Programa le 2 numeros inteiros
		 * Apresenta opçoes para o usuário
		*/

		Scanner sc = new Scanner(System.in);

		int option;

		
			System.out.print("Digite um nº: ");
			int n = sc.nextInt();
			System.out.print("Digite outro nº: ");
			int n2 = sc.nextInt();
		do {
			System.out.println();
			System.out.println("Escolha uma das opções: ");
			System.out.println("[1] - Verifica se um dos números é ou não múltiplo do outro");
			System.out.println("[2] - Verifica se os dois números são pares");
			System.out.println("[3] - Verifica se a média dos dois números é maior ou igual a 7");
			System.out.println("[4] - Sair");
			option = sc.nextInt();
			

			switch (option) {
			case 1:
				if (n % n2 == 0) {
					System.out.println("Número " + n + " é múltiplo de " + n2);
				}

				else if (n2 % n == 0) {
					System.out.println("Número " + n2 + " é múltiplo de " + n);
				}

				else {
					System.out.println("Números não múltiplos.");
				}

				break;

			case 2:
				if (n % 2 == 0 && n2 % 2 == 0) {
					System.out.println("Ambos os números são pares.");
				}
				else if (n % 2 != 0 && n2 % 2 != 0) {
					System.out.println("Ambos não são pares.");
				}
				else if (n2 % 2 != 0 || n % 2 != 0 ) {
					System.out.println("Uma das opções não é par.");
				}
				break;

			case 3:
				if ((n + n2) / 2 > 7) {
					System.out.println("A média dos números é maior ou igual a 7.");
				}
				else {
					System.out.println("A média dos números não é maior ou igual a 7.");
				}
				break;

			case 4:
				System.out.println("Programa encerrado!");
			}

		} while (option != 4);

		sc.close();
	}

}
