package Level4;

import java.util.Locale;
import java.util.Scanner;

public class Ex40 {

	public static void main(String[] args) {
		
		/*	Informar se um índice de poluição é aceitável ou se medidas devem ser tomadas
		 * 	Programa encerra quando usuário deseja não mais interagir
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char encerrar;

		do {
			System.out.print("Digite o índice de poluição local: ");
			double indice = sc.nextDouble();

			if (indice <= 0.25) {
				System.out.println("Índice de poluição aceitável.");
			}

			if (indice > 0.25 && indice < 0.4) {
				System.out.println("As indústrias do grupo 1 suspenderão suas atividades.");
			}

			else if (indice >= 0.4 && indice < 0.5) {
				System.out.println("As indústrias do grupo 1 e 2 suspenderão suas atividades.");
			}

			else if (indice >= 0.5) {
				System.out.println("Todas as indústrias suspenderão suas atividades.");
			}
			System.out.print("Deseja encerrar o programa? (S/N): ");
			encerrar = sc.next().charAt(0);
			System.out.println();
			if (encerrar == 'S') {
				System.out.println("Programa encerrado com sucesso.");
			}

		} while (encerrar == 'N');

		sc.close();

	}

}
