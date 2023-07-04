package Level5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex54 {

	public static void main(String[] args) {
		
		/*	Dados 2 vetores: A = 5 e B = 8
		 * 	Fazer programa que imprime elementos comuns aos 2 vetores
		 */

		Scanner sc = new Scanner(System.in);
		
		Integer[] A = new Integer[5];
		Integer[] B = new Integer[8];
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i<A.length; i++) {
			System.out.print("Digite o " + (i+1) + "º valor do vetor A: ");
			A[i] = sc.nextInt();		
		}
		
		System.out.println();
		
		for (int i = 0; i<B.length; i++) {
			System.out.print("Digite o " + (i+1) + "º valor do vetor B: ");
			B[i] = sc.nextInt();
			
			for (int y = 0; y<5; y++) {
				if (B[i] == A[y]) {
					list.add(B[i]);
				}
			}
		}
		
		Collections.sort(list);
		System.out.println();
		System.out.println("Números em comum entre os vetores: " + list);
		
		
		sc.close();
	}

}
