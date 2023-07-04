package Level1;

import java.util.Locale;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		// Ler uma temperatura em Farenheit e dar o resultado em Celsius
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite uma temperatura em Farenheit: ");
		double F = sc.nextDouble();
		
		double C = (F - 32) * 5 / 9;
		System.out.printf("A temperatura em Celsius é de: %.2f%n",  C);
		
		
		sc.close();

	}

}
