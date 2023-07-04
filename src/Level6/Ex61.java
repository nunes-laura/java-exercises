package Level6;

import java.util.Locale;
import java.util.Scanner;

public class Ex61 {

	public static void main(String[] args) {
		
		/*	Programa que calcula reajuste de salário
		 * 	Método recebe salário normal + índice de reajuste
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do salário: ");
		double salario = sc.nextDouble();
		
		System.out.print("Digite o índice de reajuste(em %): ");
		double indice = sc.nextDouble();
		
		double calculo = Ex61.reajuste(salario, indice);
		
		System.out.println();
		System.out.printf("O valor do salário reajustado é de R$ %.2f" , calculo);		
		
		sc.close();
	}

		
	public static double reajuste(double salario, double indice) {
		
		double calculo = salario * (indice/100);
		salario+=calculo;
		
		return salario;
	}
}
