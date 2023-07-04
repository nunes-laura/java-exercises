package Level4;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		
		/* 2 programas: 
		 * 1  lê um cojunto de nº positivos (sabendo sua quantidade) e soma pares e impares
		 * 1 lê um cojunto de nº positivos (sem saber sua quantidade) e soma pares e impares
		 */

		Scanner sc = new Scanner(System.in);

		int somaPares = 0;
		int somaImpares = 0;
		
		int somaPares2 = 0;
		int somaImpares2 = 0;

		System.out.println("***PROGRAMA COM CONJUNTO DE NÚMEROS PRÉ ESTABELECIDOS***");
		System.out.print("Quantos números você vai digitar: ");
		int n = sc.nextInt();
		
		int vect[] = new int[n];
		
		for (int i = 0; i<vect.length; i++) {
			System.out.print("Digite o " + (i+1) + "º número: ");
			int n2 = sc.nextInt();
			if (n2 % 2 == 0) {
				somaPares+=n2;
			}
			else {
				somaImpares+=n2;
			}
		}

		System.out.println("A soma dos números pares é = " + somaPares);
		System.out.println("A soma dos números ímpares é = " + somaImpares);

		
		System.out.println("----------------------------------------------------");
		System.out.println("***PROGRAMA COM CONJUNTO DE NÚMEROS NÃO ESTABELECIDOS***");
		int x = 0;
		while (x >= 0) {
			System.out.print("Digite um número (Para sair, digite um número negativo): ");
			x = sc.nextInt();
			if (x >= 0) {
				if (x % 2 == 0) {
					somaPares2 += x;
				} else {
					somaImpares2 += x;
				}
			}
		}
		System.out.println();
		System.out.println("***RESULTADOS***");
		System.out.println("A soma dos números pares é = " + somaPares2);
		System.out.println("A soma dos números ímpares é = " + somaImpares2);
		sc.close();

	}

}
