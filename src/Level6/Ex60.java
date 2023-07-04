package Level6;

import java.util.Scanner;

public class Ex60 {

	public static void main(String[] args) {
		
		/* Programa que verifica nº do quadrante
		 * A partir de um método com 2 parâmetros (x, y)
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de x: ");
		int x = sc.nextInt();
		
		System.out.print("Digite o valor de y: ");
		int y = sc.nextInt();
		
		int resultado = Ex60.verificaQuadrante(x, y);
		
		System.out.println("O nº de quadrante é: " + resultado);
		
		
		sc.close();

	}
	
	public static int verificaQuadrante(int x, int y) {
		int n = 0;
		
		if(x > 0 && y > 0) {
			n = 1;
		}
		else if( x > 0 && y < 0) {
			n = 2;
		}
		else if(x < 0 && y < 0 ) {
			n = 3;
		}
		else if (x < 0 && y > 0) {
			n = 4;
		}
	
		return n;
	}
}
