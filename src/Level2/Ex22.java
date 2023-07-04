package Level2;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		
		/* Ler um nª
		 * Se nº > 0 => A recebe nª
		 * Se não => B recebe nº
		 * Mostrar o resultado
		 */

		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;

		System.out.print("Digite um nº: ");
		int n = sc.nextInt();

		if (n > 0) {
			a += n;
			System.out.println("A variável A recebeu o valor " + n + " e agora vale: " + a);
		} else {
			b += n;
			System.out.println("A variável B recebeu o valor " + n + " e agora vale: " + b);
		}

		sc.close();
	}

}
