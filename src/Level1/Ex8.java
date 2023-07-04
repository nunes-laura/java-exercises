package Level1;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		// Informar o volume de uma lata => Fórmula: V = 3.14 * R * R * A
		
		final double PI = 3.14;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o raio da lata: ");
		int raio = sc.nextInt();
		
		System.out.println("Digite a altura da lata: ");
		int altura = sc.nextInt();
		
		double volume = PI * raio * raio * altura;
		
		System.out.println("O vloume da lata é igual a: " + volume);
		
		sc.close();

	}

}
