package Level2;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		/* Programa que recebe 3 valores e verifica se é um triângulo
		 * Verificar se cada lado é menor que a soma dos outros 2
		 * se sim => caso A==B e B==C, triangulo equilatero
		 * se não => caso A==B ou B==C ou A==C, triangulo isósceles
		 * caso contrário, triângulo escaleno.
		 * Se os valores não caracterizarem um triâgulo, é exibida uma mensagem 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do lado A: ");
		int a = sc.nextInt();
		System.out.print("Digite o tamanho do lado B: ");
		int b = sc.nextInt();
		System.out.print("Digite o tamanho do lado C: ");
		int c = sc.nextInt();
		
		
		if (a < (b + c) && b < (c + a) && c < (b + a)) {
			if (a == b && b == c) {
				System.out.println("Triângulo equilátero!");
			}
			
			else if (a == b || a == c || c == b) {
				System.out.println("Triângulo isósceles!");
			}
			
			else {
				System.out.println("Triângulo escaleno!");
			}
		}
		
		else {
			System.out.println("O valores não correspondem a um triângulo!");
		}

		
		sc.close();

	

}
}
