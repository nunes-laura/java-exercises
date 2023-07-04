package Level4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		
		/*	Programa que lê 10 valores positivos e: Encontra o maior e o menor 
		 * 	Calcular a media dos valores
		 */

		Scanner sc = new Scanner(System.in);
		int soma = 0;
		int media;

		Integer[] vect = new Integer[10];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º valor: ");
			vect[i] = sc.nextInt();
			soma += vect[i];

		}

		media = soma / vect.length;

		ArrayList<Integer> myList = new ArrayList<>();
		Collections.addAll(myList, vect);
		Collections.sort(myList);
		
		System.out.println();
		System.out.println("O menor valor digitado foi: " + myList.get(0));
		System.out.println("O maior valor digitado foi: " + myList.get(myList.size() - 1));
		System.out.println("A média dos valores digitados é de: " + media);

		sc.close();

	}

}
