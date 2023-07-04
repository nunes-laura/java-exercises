package Level2;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		// Programa que le um nº inteiro e exibe seu módulo
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
        int x = sc.nextInt();

        int modulo = 0;

        if (x >= 0) { modulo += x;}
        else {modulo = x * (-1);}

        System.out.println("O módulo de " + x + " é: " + modulo);
		
		
		sc.close();

	}

}
