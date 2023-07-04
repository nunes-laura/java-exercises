package Level2;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		
		/*	Programa le um numero e mostra se é positivo ou negativo.
		 * 	Usuário pode continuar a execução e para quando quiser
		 */
		
		Scanner sc = new Scanner(System.in);
		
		char prosseguir;
		
		do{
		System.out.print("Digite um nº: ");
		int n = sc.nextInt();
		if (n >= 0) {
			System.out.println("Este é um número positivo!");
		}
		else {
			System.out.println("Este é um número negativo!");
		}
		
		System.out.print("Deseja continuar?(s/n): ");
		prosseguir = sc.next().charAt(0);
		if (prosseguir == 'n') {
			System.out.println("Programa encerrado.");
		}
		
		} while(prosseguir == 's');
		
		
		sc.close();

	}

}
