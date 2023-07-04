package Level6;

import java.util.Scanner;

public class Ex64 {

	private static Scanner sc = new Scanner(System.in);
	private static int[] vect = new int[5];

	public static void main(String[] args) {
		
		/*	Programa que oferece opções ao usuário e realiza cálculos através de métodos */
		 

		boolean continuar = true;
		int n;

		while (continuar == true) {
			System.out.println("[1] - Carregar vetor");
			System.out.println("[2] - Listar vetor");
			System.out.println("[3] - Exibir apenas números pares do vetor");
			System.out.println("[4] - Exibir apenas números ímpares vetor");
			System.out.println("[5] - Exibir quantidade de números pares que existem nas posições ímpares do vetor");
			System.out.println("[6] - Exibir quantidade de números ímpares que existem nas posições ímpares do vetor");
			System.out.println("[7] - Sair");

			System.out.println();
			System.out.print("Escolha uma das opções: ");
			n = sc.nextInt();

			switch (n) {

			case 1:
				System.out.println(carregarVetor());
				System.out.println();
				break;

			case 2:
				System.out.println(listarVetor());
				break;

			case 3:
				System.out.println(pares());
				break;

			case 4:
				System.out.println(impares());
				break;

			case 5:
				System.out.println(quantPares());
				System.out.println();
				break;

			case 6:
				System.out.println(quantImpares());
				System.out.println();
				break;

			case 7:
				System.out.println("Programa finalizado com sucesso!");
				continuar = false;
				break;

			default:
				System.out.println("Opção inválida!");
			}

		}

		sc.close();
	}

	public static String carregarVetor() {
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite o " + (i + 1) + "º valor: ");
			vect[i] = sc.nextInt();
		}
		return "Vetor carregado com sucesso!";

	}

	public static String listarVetor() {
		String valores = "Valores do vetor:\n";
		for (int i = 0; i < 5; i++) {
			valores += vect[i] + "\n";
		}
		return valores;
	}

	public static String pares() {
		String pares =  "Valores pares do vetor:\n";
		
		for (int i = 0; i < 5; i++) {
			if (vect[i] % 2 == 0) {
				pares+=vect[i] + "\n";
			}
		}
		return pares;
	}
	
	public static String impares() {
		String impares =  "Valores ímpares do vetor:\n";
		
		for (int i = 0; i < 5; i++) {
			if (vect[i] % 2 != 0) {
				impares+=vect[i] + "\n";
			}
		}
		return impares;
	}
	
	public static String quantPares() {
		String quant =  "Quantidade de valores pares nas posições ímpares do vetor:\n";
		int count = 0;
		//Considerando que a 1ª posição para o user não é 0
		for (int i = 0; i < 5; i=i+2) {
			if (vect[i] % 2 == 0) {
				count++;
			}
		}
		return (quant + count);
	}
	
	public static String quantImpares() {
		String quant =  "Quantidade de valores ímpares nas posições pares do vetor:\n";
		//Considerando que a 1ª posição para o user não é 0
		int count = 0;
		for (int i = 1; i < 5; i=i+2) {
			if (vect[i] % 2 != 0) {
				count++;
			}
		}
		return (quant + count);
	}

}
