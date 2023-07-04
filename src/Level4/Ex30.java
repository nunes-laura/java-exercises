package Level4;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		
		//Programa para imprimir uma tabuada
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira um nº para verificar sua tabuada: ");
		int n = sc.nextInt();
		int result = 0;
		
		for (int i = 1; i<=10; i++) {
			result = n * i;
			System.out.println(result);
		}

		
		sc.close();
	}

}


