package Level6;

import java.util.Scanner;

public class Ex63 {

	public static void main(String[] args) {
		
		/*	Programa que le um numero e informa se é par ou impar
		 * 	Criar metodo "verifica"
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int n = sc.nextInt();
		

		System.out.println(verifica(n));
		
		sc.close();

	}

	public static String verifica(int n) {

		if (n % 2 == 0) {
			return n + " = Número par";
		}

		else {
			return n + " = Número ímpar";
		}

	}

}
