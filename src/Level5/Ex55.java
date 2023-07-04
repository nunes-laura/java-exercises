package Level5;

import java.util.Scanner;

public class Ex55 {

	public static void main(String[] args) {
		
		 //Ler uma frase de até 50 carecteres Imprimir a frase sem os espaços em branco
		 

		Scanner sc = new Scanner(System.in);
		String frase;
		int count = 0;
		

		System.out.print("Digite uma frase de até 50 caracteres: ");
		frase = sc.nextLine();

		while (frase.length() > 50) {
			System.out.print("Frase inválida. Digite novamente: ");
			frase = sc.nextLine();
		}

		System.out.println();
		String novaFrase = frase.replaceAll("\\s", "");
		
		System.out.println("Esta é a sua nova frase: " + novaFrase);
		
		for(int i = 0; i<frase.length(); i++) {
			if (frase.charAt(i) == ' ') {
				count++;
			}
		}
		
		int contador = Ex55.contaEspacos(frase);
		
		System.out.println("Nº de espaços em branco com for: " + count);
		System.out.println("Nº de espaços em branco com método: " +contador);

		sc.close();

	}
	
	public static int contaEspacos(String texto){
		return texto.length()-texto.replaceAll(" ","").length();
	}
}