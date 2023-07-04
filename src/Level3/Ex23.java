package Level3;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		
		/*	Exibir as 4 operações aritméticas e realizar o cálculo 
		 * 	Usuário pode continuar ou encerrar o programa quando quiser
		*/

		Scanner sc = new Scanner(System.in);

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

		sc.close();

	}

}
