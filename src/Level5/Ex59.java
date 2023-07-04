package Level5;

import java.util.Scanner;

public class Ex59 {

	public static void main(String[] args) {
		
		/* Programa solicita 2 carateres de A a Z
		 * Imprimir o nº de caraxteres entre eles
		 * Primeiro caractere deve ser maior do que o segundo
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro caractere(Z-A): ");
		char c1 = sc.next().toLowerCase().charAt(0);
		
		System.out.print("Digite o segundo caractere(A-Z): ");
		char c2 = sc.next().toLowerCase().charAt(0);
		
		int count = (c1 - c2);

		if (c1 > c2) {
		System.out.println("A diferença entre os caracretes é de: " + count);
		}
		else {
			System.out.println("Erro! O primeiro caractere deve ser maior do que o segundo.");
		}
		
		
		sc.close();

				
	}

}
