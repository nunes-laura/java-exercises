package Level6;

import java.util.Scanner;

public class Ex62 {

	public static void main(String[] args) {
		
		/*	Programa para calcular o valor da hipotenusa
		 *  Método hipotenusa recebe o valor da base e da altura de um triângulo
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tamanho da base do triângulo: ");
		int base = sc.nextInt();
		System.out.print("Digite o tamanho da altura do triângulo: ");
		int altura = sc.nextInt();
		
		double hipotenusa = Ex62.calculaHipotenusa(base, altura);
		
		System.out.println();
		System.out.printf("O valor da hipotenusa é de: %.2f%n " , hipotenusa);
		
		sc.close();
	}
	

	public static double calculaHipotenusa(int base, int altura) {
		
		double hipotenusa = Math.pow(base, 2) + Math.pow(altura,2);
		hipotenusa = Math.sqrt(hipotenusa);
		
		 return hipotenusa;
	}
}
