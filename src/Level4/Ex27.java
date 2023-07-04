package Level4;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		
		/*	Calculo do fatorial dos numeros
		 * 	O calculo finaliza quando atinge o numero definido pelo usuario
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números serão processados? ");
		int numbers = sc.nextInt();
		
		int vect[] = new int[numbers];
		
		float fatorial = 1;
		for(long n = 1; n<=vect.length; n++) {
			fatorial = fatorial * n;
			System.out.println("O fatorial de " + n + " é = " + fatorial);
		}
		
		sc.close();

	}

}
