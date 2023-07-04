package Level4;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		
		/*
		 * Programa que calcula e exibe a média de alunos de uma turma numa prova. O nº
		 * de alunos é desconhecido. Os dados do aluno são: nº de matrícula e sua nota
		 * na prova
		 */

		Scanner sc = new Scanner(System.in);

		int soma = 0;
		double media = 0;
		char continuar;
		int quantNota = 0;

		do {
			System.out.print("Digite a matrícula do aluno: ");
			int matricula = sc.nextInt();
			System.out.print("Digite a nota do aluno: ");
			int nota = sc.nextInt();
			if (nota > 0) {
				quantNota++;
				soma += nota;
			}

			media = soma / quantNota;

			System.out.print("Deseja continuar?(S/N) ");
			continuar = sc.next().charAt(0);
			System.out.println();
			if (continuar == 'N') {
				System.out.println("***Calculando média da turma***");
			}

		} while (continuar == 'S');
		System.out.println("A média da turma é de: " + media);

		sc.close();

	}

}
