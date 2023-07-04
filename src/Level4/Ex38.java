package Level4;

import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		
		/* Programa recebe código e salario de um trabalhador
		 * Sabendo que ele ganha 10 reais por hora e que mais de 50 horas soma-se 20 reais por hora mais, realizar cálculo.
		 * Programa se encerra apenas quando usuário não quer mais interagir
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int horasTrabalhadas = 0;
		double salario = 0;
		double E = 0;
		char continuar;
		
		do {
		System.out.print("Digite o código do trabalhador: ");
		int code = sc.nextInt();
		System.out.print("Digite as horas trabalhadas pelo colaborador: ");
		horasTrabalhadas = sc.nextInt();
		
		if (horasTrabalhadas > 50) {
			E = (horasTrabalhadas - 50) * 20.0;
			salario = (10.0 * 50) +  E;
			System.out.println("O salario do trabalhador  de código " + code + " é de: R$" + salario);
		}
		else {
			salario = 10.0 * horasTrabalhadas;
			System.out.println("O salario do trabalhador de código " + code + " é de: R$" + salario);
		}
		
		System.out.print("Deseja prosseguir? (S/N): ");
		continuar = sc.next().charAt(0);
		if (continuar == 'N') {
			System.out.println("Programa encerrado com sucesso!");
		}
		}while(continuar == 'S');
		
		
		sc.close();

	}

}
