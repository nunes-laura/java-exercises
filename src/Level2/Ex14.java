package Level2;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		// Ler 2 nºs e apresentar a diferença do maior para o menor
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um 1º valor: ");
		int a = sc.nextInt();
		System.out.print("Digite um 2º valor: ");
		int b = sc.nextInt();
		
		int maior = 0;
		int menor = 0;
		
		if(a > b) {
			maior += (a - b);
			System.out.println("A diferença do maior valor que é " + a +  " para o valor menor que é " + b + " é =  " + maior);
		}
		else if(b > a) {
			menor += (b - a);
			System.out.println("A diferença do maior valor que é " + b +  " para o valor menor que é " + a + " é =  " + menor);
		}
		
		else {
			System.out.println("Valores iguais, não há diferença entre eles!");
		}
		
		
		sc.close();

	}

}
