package Level2;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		// Ler 2 valores A e B e efetuar a troca do valores
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite valor A: ");
        int a = sc.nextInt();
        System.out.print("Digite valor B: ");
        int b = sc.nextInt();

        int soma = 0;
        soma = b;
        b = a;
        a = soma;
        
        System.out.println();
        System.out.println("**RESULTADOS** ");
        System.out.println("A agora vale =  " + a);
        System.out.println("B agora vale =" + b);
		
		sc.close();

	}

}
