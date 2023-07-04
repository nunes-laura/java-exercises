package Level1;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		 // Ler 4 valores e apresentar resultado 2 2 de adição e subtração
		 

		Scanner sc = new Scanner(System.in);

		System.out.println("****Resolução com vetor****");
		int[] vect = new int[4];

		for (int i = 0; i < 4; i++) {
			System.out.print("Digite o " + (i + 1) + "º valor: ");
			vect[i] = sc.nextInt();
		}

		System.out.println();
		System.out.println("*******SOMAS************");
		System.out.println("A soma de " + vect[0] + " + " + vect[1] + " é de = " + (vect[0] + vect[1]));
		System.out.println("A soma de " + vect[0] + " + " + vect[2] + " é de = " + (vect[0] + vect[2]));
		System.out.println("A soma de " + vect[0] + " + " + vect[3] + " é de = " + (vect[0] + vect[3]));
		System.out.println("A soma de " + vect[1] + " + " + vect[2] + " é de = " + (vect[1] + vect[2]));
		System.out.println("A soma de " + vect[1] + " + " + vect[3] + " é de = " + (vect[1] + vect[3]));
		System.out.println("A soma de " + vect[2] + " + " + vect[3] + " é de = " + (vect[2] + vect[3]));

		System.out.println();
		System.out.println("*****MULTIPLICAÇÕES*********");
		System.out.println("A multiplicação de " + vect[0] + " * " + vect[1] + " é = " + vect[0] * vect[1]);
		System.out.println("A multiplicação de " + vect[0] + " * " + vect[2] + " é = " + vect[0] * vect[2]);
		System.out.println("A multiplicação de " + vect[0] + " * " + vect[3] + " é = " + vect[0] * vect[3]);
		System.out.println("A multiplicação de " + vect[1] + " * " + vect[2] + " é = " + vect[1] * vect[2]);
		System.out.println("A multiplicação de " + vect[1] + " * " + vect[3] + " é = " + vect[1] * vect[3]);
		System.out.println("A multiplicação de " + vect[2] + " * " + vect[3] + " é = " + vect[2] * vect[3]);

		sc.close();
	}

}
