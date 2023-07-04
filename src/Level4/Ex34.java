package Level4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		
		/*
		 * Programa que lê nºs positivos e exibe menor e maior valor O nº de elementos
		 * não é conhecido e um nº negativo encerra o programa
		 */

		Scanner sc = new Scanner(System.in);

		List<Integer> list = new ArrayList<>();
		int n = 0;

		try {
			while (n >= 0) {
				System.out.print("Digite um número (Número negativo encerra o programa): ");
				n = sc.nextInt();
				if (n >= 0) {
					list.add(n);
				}

			}
			Collections.sort(list);
			System.out.println();
			System.out.println("O menor número digitado foi: " + list.get(0));
			System.out.println("O maior número digitado foi: " + list.get(list.size() - 1));
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println("**Programa encerrado imediamente pois número negativo foi digitado na 1ª opção.**");
		}

		sc.close();

	}

}
