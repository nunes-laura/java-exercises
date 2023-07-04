package Level1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		// Programa para calcular estoque médio de uma peça
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o quantidade mínima da peça: ");
		int min = sc.nextInt();
		System.out.println("Digite o quantidade máxima da peça: ");
		int max = sc.nextInt();
		
		int médio = (min + max) / 2;
		
		System.out.println("O estoque médio da peça é: " + médio);
		
		
		sc.close();

		

	}

}
