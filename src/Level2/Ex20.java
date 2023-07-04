package Level2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		/* Programa para ler 3 valores maiores que 0.
		 * Caso usuario digite zero, mostrar mensagem e guardar o valor novamente
		 * Exibir (menor valor * maior) e (maior / menor)
		*/
 
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[3];
		
		for (int i = 0; i<numbers.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			numbers[i] = sc.nextInt();
			
			while(numbers[i]<=0) {
				System.out.print("Digite um valor válido na posição " + (i + 1) + ": ");
				numbers[i] = sc.nextInt();
			}
		}
		
		Arrays.sort(numbers);
		System.out.println();
		System.out.println("***RESULTADOS***");
		System.out.println("O menor valor multiplicado pelo maior valor é igual a: " + numbers[0] * numbers[2]);
		System.out.println("O maior valor dividido pelo menor valor é igual a: " + numbers[2] / numbers[0]);
		

		System.out.println();
		sc.close();

	}

}
