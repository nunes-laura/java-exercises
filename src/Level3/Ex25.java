package Level3;

import java.util.Locale;
import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		
		/* Informar peso ideal de acordo com gênero seguindo as fórmulas
		 * Masc = (72.7 * altura) - 58;
		 * Fem = (62.1 * altura) - 44.7;
		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite a sua altura: ");
		double altura = sc.nextDouble();
		System.out.print("Digite seu sexo (F/M): ");
		char genero = sc.next().charAt(0);
		
		if (genero == 'F') {
			double pesoIdeal = (62.1 * altura) - 44.7;
			System.out.printf("Seu peso ideal é de %.2f%n " , pesoIdeal , "kg.");
		}
		
		else {
			double pesoIdeal = (72.7 * altura) - 58;
			System.out.printf("Seu peso ideal é de %.2f%n " , pesoIdeal , "kg.");
		}
		
		sc.close();

	}

}
