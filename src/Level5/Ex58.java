
package Level5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex58 {

	public static void main(String[] args) {
		
		/* Programa recebe N valores e:
		 * - Imprime maior valor
		 * - Calcula a media dos valores
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números serão digitados? ");
		int n = sc.nextInt();
		Integer[] vect = new Integer[n];
		
		double media = 0;
		double soma = 0;
		
		
		for(int i = 0; i<vect.length; i++) {
		System.out.print("Digite o " + (i+1) + "º valor: ");
		vect[i] = sc.nextInt();
		soma+=vect[i];
		}
		
		media = soma / vect.length;
		
		List<Integer> list = new ArrayList<>();
		Collections.addAll(list, vect);
		Collections.sort(list);
		
		System.out.println();
		System.out.println("O maior valor é: " + (list.get(list.size()-1)));
		System.out.printf("A média dos valores é: %.2f%n  " , media);
		
		
		sc.close();

	}

}
