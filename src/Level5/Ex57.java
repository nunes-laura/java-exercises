package Level5;

import java.util.Scanner;

public class Ex57 {

	public static void main(String[] args) {
		
		/*	Programa recebe uma frase e imprime:
		 * 	Apenas letras maiúsculas e minúsculas da frase
		 */
		
		String vogais = "aeiouAEIOU";
		String v = "";
				
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = sc.nextLine();
		
		char[] chars = frase.toCharArray();
		for(int i = 0; i<chars.length; i++) {
			if (vogais.contains(""+chars[i])) {
				v+=chars[i];
			}
		}
		
		System.out.println();
		System.out.println("Nova frase apenas com vogais em letras maiúsculas: " + v.toUpperCase());
		System.out.println("Nova frase apenas com vogais em letras minúsculas: " + v.toLowerCase());
		
		sc.close();

	}

}
