package Level4;

import java.util.Locale;
import java.util.Scanner;

public class Ex44 {

	public static void main(String[] args) {
		
		// Programa que dá aopções e realiza os cálculos
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[1] Conversão de Graus Celsius em Farenheit");
		System.out.println("[2] Conversão de Graus Farenheit em Celsius");
		System.out.println("[3] Peso ideal homem");
		System.out.println("[4] Peso ideal mulher");
		System.out.println();
		System.out.print("Escolha uma das opções: ");
		int option = sc.nextInt();
		
		switch (option) {
		
		case 1:
			System.out.print("Digite o valor da temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = (9 * C + 160)/5;
			System.out.printf("O valor da temperatua em Farenheit é de: %.2f%n " , F);
			break;
			
		case 2:
			System.out.print("Digite o valor da temperatura em Farenheit: ");
			double Fh = sc.nextDouble();
			double Cel = (Fh - 32) * 5 / 9;
			System.out.printf("O valor da temperatua em Celsius é de: %.2f%n " , Cel);
			break;
			
		case 3:
			System.out.print("Digite sua altura: ");
			double alturaHomem = sc.nextDouble();
			System.out.print("Digite seu peso atual: ");
			double pesoHomemAtual = sc.nextDouble();
			double pesoHomemIdeal = (72.2* alturaHomem) - 58;
			System.out.printf("O peso ideal é de %.2f%n " , pesoHomemIdeal, "kg.");
			if (pesoHomemAtual > pesoHomemIdeal) {
				System.out.println("O peso atual está acima do ideal.");
			}
			else if(pesoHomemAtual < pesoHomemIdeal) {
				System.out.println("O peso atual está abaixo do peso ideal.");
			}
			else {
				System.out.println("Parabéns! O peso atual está de acordo com o ideal.");
			}
			break;
			
		case 4:
			System.out.print("Digite sua altura: ");
			double alturaMulher = sc.nextDouble();
			System.out.print("Digite seu peso atual: ");
			double pesoMulherAtual = sc.nextDouble();
			double pesoMulherIdeal = (62.1* alturaMulher) - 44.7;
			System.out.printf("O peso ideal é de %.2f%n " , pesoMulherIdeal, "kg.");
			if (pesoMulherAtual > pesoMulherIdeal) {
				System.out.println("O peso atual está acima do ideal.");
			}
			else if(pesoMulherAtual < pesoMulherIdeal) {
				System.out.println("O peso atual está abaixo do peso ideal.");
			}
			else {
				System.out.println("Parabéns! O peso atual está de acordo com o ideal.");
			}
		}
		
		
		
		sc.close();

	}

}
