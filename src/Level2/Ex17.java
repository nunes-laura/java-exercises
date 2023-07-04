package Level2;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		// Inserir valor entre 0 e 9. Se for diferente, mostrar mensagem de erro
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor entre [0 - 9]: ");
		int valor = sc.nextInt();
		
		if (valor > 0  && valor <= 9) {
			System.out.println("Valor válido.");
		}
		else {
			System.out.println("Valor inválido!");
		}
		
		
		
		sc.close();

	}
	

}
