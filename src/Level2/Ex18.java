package Level2;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		/* Programa que le 3 nºs e verifica se é 1, 2 ou 3
		 * Se não for, mostra a mensagem "código inválido"
		 * Utilizar comando switch
		*/
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o código: ");
		int code = sc.nextInt();
		
		switch(code) {
		
		case 1:
			System.out.println("Código 1.");
		break;
		
		case 2:
			System.out.println("Código 2.");
		break;
		
		case 3:
			System.out.println("Código 3.");
		break;
		
		default:
			System.out.println("Código inválido!");
		}
		
		sc.close();
	}

}
