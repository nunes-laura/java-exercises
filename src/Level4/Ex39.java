package Level4;

import java.util.Scanner;

public class Ex39 {

	public static void main(String[] args) {
		
		/*	Ler valor e informa se:
		 * - é par e positivo
		 * - é par e negativo
		 * - é ímpar e positivo
		 * - é ímpar e negativo 
		 */

		
		Scanner sc = new Scanner(System.in);
		
		char encerrar;
		
		do {
		System.out.print("Digite um número: ");
		int n = sc.nextInt();
		
		if(n == 0) {
			System.out.println("Este nº é par e positivo");
		}
		
		if (n % 2 == 0 && n > 0) {
			System.out.println("Este nº é par e positivo.");
		}
		
		else if(n % 2 == 0 && n < 0 ) {
			System.out.println("Este nº é par e negativo.");
		}
		else if(n % 2 !=0 && n > 0) {
			System.out.println("Este nº é ímpar e positivo.");
			
		}
		else if(n % 2 !=0 && n < 0) {
			System.out.println("Este nº é ímpar e negativo.");
		}
		
		System.out.print("Deseja encerrar o programa? (S/N): ");
		encerrar = sc.next().charAt(0);
		System.out.println();
		if(encerrar == 'S') {
			System.out.println("Programa encerrado com sucesso!");
		}
		}while(encerrar == 'N');
		
		sc.close();
	}

}
