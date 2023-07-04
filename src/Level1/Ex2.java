package Level1;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		// 	Ler a cotação do dólar
		//	Ler um valor em dólares - converter o valor para real
		//	Mostrar o resultado
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Qual a cotação do dólar hoje? ");
		double dolar = sc.nextDouble();
		
		sc.nextLine();
		System.out.println("Qual o valor em dólares?");
		double valorDolar = sc.nextDouble();
		
		double valorReal = dolar * valorDolar;
		
		
		System.out.println("Este valor em reais é igual a R$" + valorReal);
		
		
		sc.close();

	}

}
