package Level5;

import java.util.Scanner;

public class Ex56 {

	public static void main(String[] args) {
		
		/* Fazer um vetor com 50 posições e imprimir:
		 * Pares;
		 * Múltiplos de 5
		 */

		Scanner sc = new Scanner(System.in); 
		
		int[] vect = new int[50];
		int pares = 0;
		int multiplos = 0;
		
		
		
		for(int i = 0; i<vect.length; i++) {
			System.out.print("Digite o " +(i+1) + "º valor: ");
			vect[i] = sc.nextInt();
			
			if(vect[i] % 2 == 0) {
				pares++;
			}
			if(vect[i] % 5 == 0) {
				multiplos++;
			}
		}
		
		System.out.println();
		System.out.println("A quantidade de nºs pares é de: " + pares);
		System.out.println("A quantidade de nºs múltiplos de 5 é de: " + multiplos);
		
		
		
		sc.close();
	}

}
