package Level1;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		// 	Programa para pagamento de comissao de vendedores de peças
		//	A comissão será de 5% do total da venda
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		final double COM = 0.05;

		System.out.print("Digite o código do vendedor: ");
		int salesCode = sc.nextInt();
		System.out.print("Digite o código da peça: ");
		int pieceCode = sc.nextInt();
		System.out.print("Digite o preço da peça: ");
		double price = sc.nextDouble();
		System.out.print("Digite a quantidade vendida: ");
		int quant = sc.nextInt();
		
		double valorVenda = price * quant;
		double comissão = valorVenda * COM;
		
		System.out.println();
		
		System.out.println("*******DADOS DA VENDA*********");
		System.out.println("Codigo do vendedor: " + salesCode);
		System.out.println("Codigo da peça: " + pieceCode);
		System.out.println("Preço da peça: R$" + price);
		System.out.println("Quantidade da peça:" + quant);
		
		System.out.println("---------------------------------");
		System.out.println("O valor da venda é de: R$" + valorVenda);
		System.out.println("A comissão do vendedor sobre a venda é de R$: " + comissão);
		
		sc.close();
		
	}

}
