package Level2;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		// Ler 2 nºs e mostrar qual o maior ou se são iguais
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um 1º valor: ");
		int a = sc.nextInt();
		System.out.print("Digite um 2º valor: ");
		int b = sc.nextInt();

		
		if (a > b) {
			System.out.println("O valor " + a + " é maior que " + b);
		}
		else if (b > a){
			System.out.println("O valor " + b + " é maior que " + a);
		}
		else {
			System.out.println("Os valores são iguais!");
		}
		
		sc.close();

	}

}
