package Level1;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		
		/*	Algoritmo para ler uma idade de uma pessoa em anos, meses e dias
		 *Informar o resultado apenas em dias
		 *Considerar ano com 365 dias e mês com 30 dias 
		*/

		
		final int ANO = 365;
		final int MES = 30;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		System.out.print("Anos = ");
		int anos = sc.nextInt();
		System.out.print("Meses = ");
		int meses = sc.nextInt();
		System.out.print("Dias = ");
		int dias = sc.nextInt();
		sc.close();
		
		int anos_dias = anos * ANO;
		int meses_dias = meses * MES;
		
		System.out.println("Sua idade em dias é de: " + (anos_dias + meses_dias + dias));

	}

}
