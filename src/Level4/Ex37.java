package Level4;

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		
		/*	Programa de conversão númerica
		 * 	A partir da opção escolhida, realizar os cálculos
		 * 	O programa se encerrar apenas quando o usário não quer mais interagir
		 */

		Scanner sc = new Scanner(System.in);
		
		char continuar;
		
		do {
		System.out.println("Digite uma das seguintes opções: ");
		System.out.println("[1] - Adição");
		System.out.println("[2] - Subtração");
		System.out.println("[3] - Divisão");
		System.out.println("[4] - Multiplicação");
		
		
		int n = sc.nextInt();
		
		switch (n) {
		case 1:
			System.out.print("Digite o 1º nº: ");
			int first = sc.nextInt();
			System.out.print("Digite o 2º nº: ");
			int second = sc.nextInt();
			int adição = first + second;
			System.out.println("A soma de " + first + " + " + second + " é = " + adição);
			break;
			
		case 2:
			System.out.print("Digite o 1º nº: ");
			int ft = sc.nextInt();
			System.out.print("Digite o 2º nº: ");
			int sec = sc.nextInt();
			int subtração = ft - sec;
			System.out.println("A subtração de " + ft + " - " + sec + " é = " + subtração);
			break;
			
		case 3:
			System.out.print("Digite o 1º nº: ");
			double f = sc.nextInt();
			System.out.print("Digite o 2º nº: ");
			double s = sc.nextInt();
			double divisão = f / s;
			System.out.println("A divisão de " + f + " / " + s + " é = " + divisão);
			break;
			
		case 4:
			System.out.print("Digite o 1º nº: ");
			int primeiro = sc.nextInt();
			System.out.print("Digite o 2º nº: ");
			int segundo = sc.nextInt();
			int multiplicação = primeiro * segundo;
			System.out.println("A multiplicação de " + primeiro + " * " + segundo + " é = " + multiplicação);
			break;
		
			default:
				System.out.println("Opção inválida!");
			}
		
		System.out.print("Deseja continuar?(s/n) ");
		continuar = sc.next().charAt(0);
		if (continuar == 'n') {
			System.out.println("Programa encerrado!");
		}
		
		}
		while (continuar == 's');
		
		
		
		sc.close();
		
	}

}
