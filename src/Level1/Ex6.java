package Level1;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		// Ler uma temperatura em Celsius e forncer resultado em Farenheit
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite a temperatura em graus celsius: ");
		double C = sc.nextDouble();
		
		double F = (9 * C + 160) / 5;
		
		System.out.println("A temperatura em Farenheit é de: " + F);
		
		
		sc.close();

	}

}
